package ch04.MarioKart;

import java.util.Scanner;

import ch04.MarioKart.DTO.CartDTO;
import ch04.MarioKart.DTO.CharacterDTO;
import ch04.MarioKart.DTO.GliderDTO;
import ch04.MarioKart.DTO.ItemDTO;
import ch04.MarioKart.DTO.MemberDTO;
import ch04.MarioKart.DTO.TireDTO;

public class MarioKartExam {
	// 필드 -> main 메서드가 있는 필드는 static 용으로 만듬
	// DTO -> 필드명,값 만 가지고 있음
	
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10]; 		   // 10명의 회원가입
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15]; // 15개의 캐릭터
	public static CartDTO[] cartDTOs = new CartDTO[10]; 		 	   // 10개의 카트
	public static GliderDTO[] gliderDTOs = new GliderDTO[10]; 		   // 10개의 글라이더
	public static TireDTO[] tireDTOs = new TireDTO[10]; 			   // 10개의 타이어
	public static ItemDTO[] itemDTOs = new ItemDTO[10]; 			   // 10개의 아이템
	
	public static MemberDTO LoginState;
	// 세션과 같은 기능, 로그인 성공시 객체를 가지고 있는 용도
	
	// 생성자 -> new MarioKartExam()으로 객체를 생성하지 않음 메인이기때문에
	// static() 스태틱 블럭을 사용하여 초기화한다.
	
	static {
		CharacterDTO CharacterDTO0 = new CharacterDTO("마리오", 3.0, 3.0, 3.0, 3.0,3.0);
		CharacterDTO CharacterDTO1 = new CharacterDTO("루이지", 3.0, 3.0, 3.0, 3.0,3.0);
		CharacterDTO CharacterDTO2 = new CharacterDTO("와리오", 3.0, 3.0, 3.0, 3.0,3.0);
		CharacterDTO CharacterDTO3 = new CharacterDTO("데이지", 3.0, 3.0, 3.0, 3.0,3.0);
		// 4개의 캐릭터 객체 완성
		
		// 생성한 객체를 배열에 넣어서 관리
		characterDTOs[0] = CharacterDTO0;
		characterDTOs[1] = CharacterDTO1;
		characterDTOs[2] = CharacterDTO2;
		characterDTOs[3] = CharacterDTO3;
		}// 초기화용 스태틱 블럭 종료
	
	//정적 메서드 (메인메서드)
	
	public static void main(String[] args) {
		// 마리오 카트 게임 프로젝트
		// mvc 패턴으로 프로젝트 구현
		// DTO : 객체 처리(Data Transfer Object, 데이터 전송 객체) ->  new로 생성
		// service : 부메뉴용(객체와 객체를 연결하여 서비스 제공)
		// start : 배열과 주메뉴용
		
		System.out.println("========마리오 카드 게임을 시작합니다.========");
		
		boolean run = true; //구동 실행
		while(run) {
			System.out.println("1.회원관리 | 2.카트관리 | 3.캐릭터관리 | 4.게임실행 | 5.게임종료");
			System.out.print("원하시는 메뉴번호를 입력해주세요.(숫자 1~5) >>> ");
			String select = input.next(); // 메뉴를 키보드로 받음
			
			// 이제 DTO를 이용해서 메뉴가 왔다갔다할꺼임.
			switch(select) {
			case "1" :
				System.out.println("회원관리 메뉴로 진입합니다.");
				MemberService memberservice = new MemberService();
				LoginState = memberservice.menu(input, memberDTOs, LoginState);
				System.out.println("현재 로그인한 회원 이름은 : " + LoginState.nickName);
				break;
				
			case "2" :
				System.out.println("카트관리 메뉴로 진입합니다.");
				break;
				
			case "3" :
				System.out.println("캐릭터관리 메뉴로 진입합니다.");
				break;
				
			case "4" :
				System.out.println("게임을 실행합니다.");
				break;
				
			case "5" :
				System.out.println("게임을 종료합니다.");
				System.out.println("이용해 주셔서 감사합니다.");
				run = false;
				break;
				
			default : 
				System.out.println("선택지에 없는 숫자입니다.");
				System.out.println("다시 입력해주세요.");
				break;
				
			
			}// 메뉴 선택했을때의 스위치문 종료
			
			
			
		}// 구동 와일문 종료
		

	}// main 메서드 종료

}// class 종료
