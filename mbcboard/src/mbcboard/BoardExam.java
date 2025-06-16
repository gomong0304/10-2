package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.DTO.MemberDTO;
import mbcboard.Service.BoardService;
import mbcboard.Service.MemOnlyBoardService;
import mbcboard.Service.MemberService;

public class BoardExam {
	// 필드
	public static Scanner inputStr = new Scanner(System.in); // 공용으로 사용
	public static MemberDTO session = null; // 로그인 처리용 객체
	
	// 생성자 -> static 블럭
	
	// 메서드
	public static void main(String[] args) throws SQLException {
		// mbc 게시판용 jdbc 테스트
		// dto : 객체를 담당
		// dao :  데이터 베이스와의 연동을 담당
		// service : 부메뉴와 서비스를 담당
		boolean run = true;
		while (run) {
			System.out.println("=========mbc 자유 게시판=========");
			System.out.println("1.회원가입 및 관리 | 2.회원용 게시판 | 3.비회원용 게시판 | 4.종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("회원용 서비스로 진입합니다.");
				MemberService memberService = new MemberService();
				memberService.subMenu(inputStr);
				break;
			case "2":
				System.out.println("회원용 게시판 서비스로 진입합니다.");
				MemOnlyBoardService memOnlyBoardService = new MemOnlyBoardService();
				memOnlyBoardService.memMenu(inputStr, session);
				break;
			case "3":
				System.out.println("비회원용 게시판 서비스로 진입합니다.");
				BoardService boardService = new BoardService();
				boardService.subMenu(inputStr);
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default :
				System.out.println("잘못입력하셨습니다. \n1~4번만 입력해주세요");
				break;
			}// switch문 종료
		}// while문 종료
	}// main 메서드 종료

}// class 종료
