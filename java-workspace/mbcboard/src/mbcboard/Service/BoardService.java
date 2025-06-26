package mbcboard.Service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.BoardDAO.BoardDAO;
import mbcboard.DTO.BoardDTO;

public class BoardService {
	// dto와 dao를 사용하여 부메뉴와 crud를 처리한다.
	
	// 필드
	public BoardDAO boardDAO = new BoardDAO(); // 빈 dao 객체를 만들고 호출이 되면서 실행이 될꺼임 
	
	// 기본생성자
	
	// 메서드(부메뉴,생성,모두보기,한개보기,수정하기,삭제하기)
	public void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true;
		while (subRun) {
			System.out.println("=========3. 비회원 전용 게시판 서비스=========");
			System.out.println("1.모든 게시글 보기 | 2.게시글 작성 | 3.게시글 자세히 보기 | 4.게시글 수정 | 5.게시글 삭제 | 6.나가기");
			System.out.print(">>> ");
			String subSelect = inputStr.next();
			
			switch (subSelect) {
			case "1":
				System.out.println("모든 게시글 보기 메뉴입니다");
				selectAll(boardDAO);
				break;
			case "2":
				System.out.println("게시글 작성 메뉴입니다");
				insertBoard(boardDAO,inputStr);
				break;
			case "3":
				System.out.println("게시글 자세히 보기 메뉴입니다");
				readOne(inputStr);
				break;
			case "4":
				System.out.println("게시글 수정 메뉴입니다");
				modify(inputStr);
				break;
			case "5":
				System.out.println("게시글 삭제 메뉴입니다");
				deleteOne(inputStr);
				break;
			case "6":
				System.out.println("게시글 보기 메뉴 종료");
				boardDAO.connection.close();
				subRun = false;
				break;
			default :
				System.out.println("잘못입력하셨습니다. \n 1~6까지만 입력해주세요");
				break;
			}// switch문 종료
		}// while문 종료
	}// 서브메뉴 메서드 종료

	private void deleteOne(Scanner inputStr) throws SQLException {
		// 한개의 게시물 종료(제목을 받아서)
		System.out.println("=====================================");
		System.out.println("===========mbc 게시글 삭제 메뉴===========");
		System.out.println("삭제하실 게시글의 제목을 입력하세요.");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.deleteOne(inputStr,title);
		System.out.println("=====================================");
	}// deleteOne 메서드 종료

	private void modify(Scanner inputStr) throws SQLException {
		// 게시글 수정 메뉴
		System.out.println("=====================================");
		System.out.println("===========mbc 게시글 수정 메뉴===========");
		System.out.println("수정하실 게시글의 제목을 입력하세요.");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.modify(title,inputStr);
		System.out.println("=====================================");
	}// 게시글 수정 메뉴 종료

	private void readOne(Scanner inputStr) throws SQLException {
		// 원하는 게시글의 제목을 입력하면 내용이 보이도록 select 처리
		System.out.println("=====================================");
		System.out.println("=========mbc 게시글 작성 보기 메뉴=========");
		System.out.println("열람하실 게시글의 제목을 입력하세요.");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("=====================================");	
	}// 게시글 자세히 보기 메서드 종료

	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// 키보드로 입력한 데이터를 DTO를 사용하여 DAO를 통해 DB에 저장(insert)하는 서비스를 제공
		System.out.println("=================================");
		System.out.println("=========mbc 게시글 작성 메뉴=========");
		BoardDTO boardDTO = new BoardDTO(); // 빈 BoardDTO 객체를 생성
		System.out.print("작성자 : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("제목: ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());
		
		boardDAO.insertBoard(boardDTO); // 위에서 만든 dto 객체를 dao에 전달
		System.out.println("==============================");
	}// insertBoard 메서드 종료

	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// DAO에게 전체보기 하는 서비스를 제공한다
		System.out.println("=========mbc 게시판 목록=========");
		boardDAO.selectAll();
		System.out.println("==============================");
	}// selectAll 메서드 종료
	
}
