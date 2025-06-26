package mbcboard.Service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.BoardDAO.MemOnlyBoardDAO;
import mbcboard.BoardDAO.MemberDAO;
import mbcboard.DTO.MemberDTO;

public class MemOnlyBoardService {
	// 필드
	MemOnlyBoardDAO memOnlyBoardDAO = new MemOnlyBoardDAO();
	MemberDAO memberDAO = new MemberDAO();
	MemberDTO memberDTO = new MemberDTO();
	// 생성자
	
	// 메서드
	public void memMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		// 회원 전용 메뉴를 만들어보자...
		boolean memMenu = true;
		while (memMenu) {
			System.out.println("=========2. 회원 전용 게시판 서비스=========");
			System.out.println("1.로그인 | 2.게시글 작성 | 3.모든 게시글 보기| 4.게시글 자세히 보기 | 5.게시글 수정 | 6.게시글 삭제 | 7.나가기");
			System.out.print(">>> ");
			String memSelect = inputStr.next();
			
			switch (memSelect) {
			case "1":
				System.out.println("로그인 화면으로 이동합니다.");
				login(inputStr,session);
				break;
			case "2":
				System.out.println("게시글 작성 화면으로 이동합니다.");
				break;
			case "3":
				System.out.println("모든 게시글 보기 화면으로 이동합니다.");
				break;
			case "4":
				System.out.println("게시글 자세히 보기 화면으로 이동합니다.");
				break;
			case "5":
				System.out.println("게시글 수정 화면으로 이동합니다.");
				break;
			case "6":
				System.out.println("게시글 삭제 화면으로 이동합니다.");
				break;
			case "7":
				System.out.println("회원 전용 게시판 서비스를 종료합니다. \n이전메뉴로 돌아갑니다.");
				memMenu = false;
				break;
			default : 
				System.out.println("잘못입력하셨습니다. \n 1~7까지만 입력해주세요");
				break;
			}// 회원전용 게시판 switch문 종료
		}// 회원전용 게시판 while문 종료
	}// 회원전용 게시판 메뉴 메서드 종료

	private void login(Scanner inputStr, MemberDTO session) {
		// 로그인을 해보자
		
	}// 로그인 메서드 종료
	
}// 회원전용 게시판 서비스 클래스 종료
