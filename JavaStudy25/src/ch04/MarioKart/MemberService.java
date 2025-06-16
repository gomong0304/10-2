package ch04.MarioKart;

import java.util.Scanner;

import ch04.MarioKart.DTO.MemberDTO;

public class MemberService {
	// 필드
	
	// 생성자
	
	// 메서드
	// 부메뉴용 메서드 -> 필요한 파라미터는 입력개체,회원 배열,로그인상태
	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, 
			MemberDTO loginState) {
		
		System.out.println("====회원 관리 메뉴입니다.====");
		
		boolean subrun = true;
		while(subrun) {
			System.out.println("1.가입 | 2.로그인 | 3.수정 | 4.회원탈퇴 | 5.회원관리메뉴 종료");
			System.out.print("원하시는 메뉴번호를 입력해주세요.(숫자 1~5) >>> ");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("가입 메뉴로 진입합니다.");
				create(input, memberDTOs);
				break;
				
			case "2" :
				System.out.println("로그인 메뉴로 진입합니다.");
				loginState = login(input, memberDTOs, loginState);
				break;
				
			case "3" :
				System.out.println("회원 정보 수정 메뉴로 진입합니다.");
				loginState = update(input, memberDTOs, loginState);
				break;
			
			case "4" :
				System.out.println("회원탈퇴 메뉴로 진입합니다.");
				loginState = delete(input, memberDTOs, loginState);
				break;
			
			case "5" :
				System.out.println("회원관리 메뉴를 종료합니다.");
				System.out.println("이전 메뉴로 돌아갑니다.");
				subrun = false;
				break;
			
			default : 
				System.out.println("없는 메뉴번호입니다.");
				System.out.println("다시 입력해주세요.");
			}// 메뉴 선택 스위치문 종료
		}// 회원관리 메뉴 와일문 종료
		return loginState;
	}// 회원 멤버 메뉴 종료

	public MemberDTO delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 회원 정보 삭제 메서드
		System.out.println("회원 탈퇴 메뉴입니다.");
		System.out.println("정말 회원을 탈퇴하시겠습니까?");
		System.out.println("탈퇴를 원하시면 yes를 눌러주세요.");
		System.out.println(">>> ");
		String answer = input.next();
		
		boolean run = true;
		while(run) {
		switch(answer){
		case "1" :
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("탈퇴할 id를 입력해주세요");
			System.out.print(">>> ");
			String id = input.next();
			if(loginState.id.equals(id)) {
				System.out.println("pw를 입력해주세요");
				System.out.print(">>> ");
				System.out.println(loginState.id +"님, 탈퇴를 진행합니다.");
				System.out.println("====탈퇴 진행 중====");
				loginState.id = null;
				loginState.pw = null;
				System.out.println("탈퇴가 완료 되었습니다.");
				System.out.println("게임이 종료됩니다. 감사합니다.");
				run = false;
				break;
			}else {
				System.out.println("존재하지 않는 id입니다.");
				break;
			}
		}else {
			System.out.println("회원 탈퇴를 취소합니다.");
			System.out.println("이전화면으로 돌아갑니다.");
			run = false;
			break;
		}// if문 종료
		}// switch문 종료	
		}// while문 종료
		return loginState;
	}// 회원 정보 삭제 메서드 종료

	public MemberDTO update(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 회원 정보 수정 메서드
		System.out.println("회원 정보를 수정합니다.");
		System.out.println("id를 입력하세요.");
		System.out.print(">>> ");
		String id = input.next();
		System.out.println("pw를 입력하세요.");
		System.out.print(">>> ");
		String pw = input.next();
		MemberDTO updateMember = new MemberDTO();
		updateMember.id = id;
		updateMember.pw = pw;
		if(loginState.id.equals(updateMember.id) && loginState.pw.equals(updateMember.pw)) {
			System.out.println("변경할 id를 입력하세요");
			System.out.print(">>> ");
			loginState.id = input.next();
			System.out.println("변경할 pw를 입력하세요");
			System.out.print(">>> ");
			loginState.id = input.next();
			System.out.println(updateMember.id + "에서 " + loginState.id + "로 변경완료되었습니다." );
		}// if문 종료 (로그인한 사용자 정보만 변경)
		return loginState;
	}// 회원 정보 수정 메서드 종료

	public MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 로그인용 메서드
		System.out.println("로그인을 진행합니다.");
		System.out.println("id를 입력하세요.");
		System.out.print(">>> ");
		String id = input.next();
		System.out.println("pw를 입력하세요.");
		System.out.print(">>> ");
		String pw = input.next();
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		// 로그인 id 및 pw 입력
		
		for(int i = 0; i<memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id) &&
					memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공!");
				loginState = memberDTOs[i];
			}// 로그인 if문 종료
		}// 로그인 for문 종료
		System.out.println(loginState.nickName + "님, 환영합니다!");
		return loginState;
	}// 로그인용 메서드 종료

	public void create(Scanner input, MemberDTO[] memberDTOs) {
		// 회원 가입용 메서드
		System.out.println("회원 가입을 진행합니다.");
		MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성
		
		System.out.println("사용할 id를 입력해주세요");
		System.out.print(">>> ");
		memberDTO.id = input.next();
		System.out.println("사용할 pw를 입력해주세요");
		System.out.print(">>> ");
		memberDTO.pw = input.next();
		System.out.println("사용할 별명을 입력해주세요");
		System.out.print(">>> ");
		memberDTO.nickName = input.next();
		System.out.println("email을 입력해주세요");
		System.out.print(">>> ");
		memberDTO.email = input.next();
		// memberDTO 빈객체에 필드값 입력완료
		
		// 배열에 0~null 값이면 위에 값들을 입력 exam
		for (int i = 0; i<memberDTOs.length; i++) {
			if(memberDTOs[i] == null) {// null 값이면 값이 없는 상태
				memberDTOs[i] = memberDTO;
				break;
			}// if문 종료
		}// 입력값 저장 for문 종료
		
		System.out.println(memberDTO.nickName + "님, 회원가입을 축하드립니다.");
	}// 회원 가입용 메서드 종료

}// 멤버 서비스 클래스 종료
