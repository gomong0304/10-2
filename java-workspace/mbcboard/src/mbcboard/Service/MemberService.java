package mbcboard.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import mbcboard.BoardDAO.MemberDAO;
import mbcboard.DTO.MemberDTO;

public class MemberService {
	// 멤버의 DTO와 DAO를 활용하여 회원 관리용 CRUD를 처리한다
	
	// 필드
	public MemberDAO memberDAO = new MemberDAO();
	public MemberDTO session = new MemberDTO();
	
	// 기본생성자
	
	// 메서드(부메뉴,생성,모두보기,한개보기,수정하기,삭제하기)
	public void subMenu(Scanner inputStr) throws SQLException {
		
		boolean memRun = true;
		while (memRun) {
			System.out.println("=========1.회원 서비스=========");
			System.out.println("0.로그인 | 1.회원 가입 | 2.회원 모두 보기 | 3.회원 정보 보기 | 4.회원 정보 수정 | 5.회원 삭제 | 6.나가기");
			System.out.print(">>> ");
			String memSelect = inputStr.next();
			switch (memSelect) {
			case "0": 
				System.out.println("로그인 메뉴로 진입합니다.");
				loginMember(memberDAO,inputStr);
				break;
			case "1":
				System.out.println("회원 가입메뉴로 진입합니다.");
				insertMember(memberDAO,inputStr);
				break;
			case "2":
				System.out.println("모든 회원 목록 보기메뉴로 진입합니다.");
				selectAll(memberDAO);
				break;
			case "3":
				System.out.println("회원 정보 보기메뉴로 진입합니다.");
				readOne(memberDAO,inputStr);
				break;
			case "4":
				System.out.println("회원 정보 수정메뉴로 진입합니다.");
				modify(memberDAO, inputStr);
				break;
			case "5":
				System.out.println("회원 삭제메뉴로 진입합니다.");
				deleteOne(inputStr);
				break;
			case "6":
				System.out.println("회원 서비스 종료");
				memberDAO.connection.close();
				memRun = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다. \n0~6번까지만 입력해주세요.");
				break;
			}// 회원 서비스 메뉴 선택 switch문 종료
		}// 회원 서비스 메뉴 선택 while문 종료
	}// 회원 서비스 메서드 종료


	private void deleteOne(Scanner inputStr) throws SQLException {
		// 회원 탈퇴 메서드
		System.out.println("=========회원 탈퇴 메뉴=========");
		System.out.println("회원 탈퇴할 id를 입력해주세요.");
		System.out.print(">>> ");
		String id = inputStr.next();
		System.out.println("정말 회원을 탈퇴하시겠습니까? yes or no");
		System.out.print(">>> ");
		String answer = inputStr.next();
		
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("회원 정보가 삭제 됩니다.");
			memberDAO.deleteOne(id);
		} else {
			System.out.println("회원 탈퇴가 취소되었습니다.");
		}
		System.out.println("==============================");
	}// 회원 정보 삭제 메서드 종료

	private void modify(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원번호를 받아서 정보 수정 메서드
		System.out.println("=========회원 정보 수정 메뉴=========");
		System.out.println("수정하실 회원의 id를 입력해주세요.");
		System.out.print(">>> ");
		String id = inputStr.next();
		
		memberDAO.modify(id,inputStr);
		System.out.println("==============================");
	}// modify메서드 종료

	private void readOne(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원 이름을 입력하면 내용이 보이도록 sel처리
		System.out.println("=========회원 조회 서비스=========");
		System.out.println("조회할 회원의 이름을 입력해주세요.");
		System.out.print(">>> ");
		String name = inputStr.next();
		
		memberDAO.readOne(name);
		System.out.println("==============================");
	}// readOne 메서드 종료

	private void selectAll(MemberDAO memberDAO) throws SQLException {
		// 멤버 dao에게 전체 보기 서비스를 제공
		System.out.println("============회원 목록============");
		memberDAO.selectAll();
		System.out.println("==============================");
	}// 회원 selectAll 메서드 종료

	
	private void insertMember(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 키보드로 입력한 데이터로 멤버를 추가해보자
		MemberDTO memberDTO = new MemberDTO(); // 빈객체 생성
		System.out.println("============회원 가입 서비스============");
		
		System.out.println("----------가입되어있는 List----------");
		ArrayList<MemberDTO> memberList = new ArrayList<>();
		memberList = memberDAO.selectAll();
		System.out.println("---------------------------------");
		
		System.out.print("회원 이름 : ");
		memberDTO.setBwriter(inputStr.next());
		
		// System.out.println(memberList.size()); 사이즈 확인 검증
		
		boolean joinMem = true;
		while(joinMem) {
			int index = 0;
			
			System.out.print("id : ");
			memberDTO.setId(inputStr.next());
			
			for (MemberDTO member : memberList) { // 향상된 for문
				index++;
				if (memberDTO.getId().equals(member.getId())) {
					System.out.println("이미 사용중이 id 입니다. \n다시입력해주세요");
					break;
				}// if문 종료
			} // for문 종료
			
			if (index == memberList.size()) {
				System.out.println("사용 가능한 id 입니다.");
				joinMem = false;
			}// if 문 종료
		}// id 중복검사 while문 종료
		
		System.out.print("pw : ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.insertMember(memberDTO);
		System.out.println("==============================");
	}// insertMember 메서드 종료
	
	
	private void loginMember(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 키보드로 id와 pw를 입력했을때 로그인이 되는걸 확인해보자.
		System.out.println("============로그인 서비스============");
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("로그인할 id를 입력해주세요");
		System.out.print(">>> ");
		memberDTO.setId(inputStr.next());
		
		System.out.println("로그인할 pw를 입력해주세요");
		System.out.print(">>> ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.login(session, memberDTO);
		System.out.println("==============================");
	}// loginMember 메서드 종료
}
