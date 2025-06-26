package mbcboard.BoardDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.DTO.BoardDTO;

public class BoardDAO {
	// 게시판의 DB와 연동을 담당한다.
	// JDBC 5단계를 사용
	// 1단계 : Connect 객체를 사용하여 ojdbc6.jar를 생성
	// 2단계 : URL,ID,PW,SQL 쿼리문을 작성한다
	// 3단계 : 쿼리문 실행
	// 4단계 : 쿼리문의 실행결과를 받는다
	// 5단계 : 연결종료를 진행
	
	// 필드 (1~5단계에서 사용할 객체)
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	// 기본생성자
	public BoardDAO() {
		
		try { // 예외가 발생할 수 있는 실행문, 프로그램 강제 종료 처리함
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest");	
		} catch(ClassNotFoundException e){
			System.out.println("driver 이름이나 ojdbc6.jar 파일이 잘못되었습니다.");
			e.printStackTrace();
			System.exit(0);;
		} catch(SQLException e){
			System.out.println("URL,ID,PW가 잘못되었습니다. BoardDAO에 기본생성자를 확인하세요.");
			e.printStackTrace();
			System.exit(0);
		}
	}// 기본 생성자 종료

	// 메서드
	public void selectAll() throws SQLException {
		// sql 사용하여 전체 목록 보기 결과 출력
		
		try {
			String sql = "select bno, btitle, bwriter, bdate from board order by bdate desc"; 
			// 데이터베이스에서 board 테이블 내용을 가져오는 쿼리문
			
			statement = connection.createStatement(); // 쿼리문을 실행할객체
			resultSet = statement.executeQuery(sql);  // 쿼리문을 실행하여 결과를 표로 받는다.
			
			System.out.println("번호\t 제목\t 작성자\t 작성일\t");
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");
			}
			
		} catch (SQLException e) { //오류 발생시 예외 처리문
			System.out.println("selectAll()메서드에 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close();
		}
		
	}// selectAll()메서드 종료

	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		// 서비스에서 만든 insert dto를 받아서 db에 넣기
		
		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate) " + 
					" values(board_seq.nextval,?,?,?,sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, boardDTO.getBwriter());
			System.out.println("쿼리문 확인 : " + sql);
			
			result = preparedStatement.executeUpdate(); // 쿼리문 실행하여 정수로 출력
			
			if(result>0) {
				System.out.println(result + "개의 게시물이 등록되었습니다.");
				connection.commit();
			} else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("입력에 실패했습니다.");
				connection.rollback();
			}// if문 종료
		} catch (SQLException e) {
			System.out.println("예외발생 : insertBoard() 메서드의 쿼리문을 확인해주세요");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
		
	}// insertBoard() 메서드 종료

	public void readOne(String title) throws SQLException {
		// 서비스에서 입력받은 제목을 받아서 내용보는 select문
		
		try {
			String sql = "select * from board where btitle = ?";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet= preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				BoardDTO boardDTO = new BoardDTO();
				
				boardDTO.setBno(resultSet.getInt("bno"));
				boardDTO.setBtitle(resultSet.getString("btitle"));
				boardDTO.setBcontent(resultSet.getString("bcontent"));
				boardDTO.setBwriter(resultSet.getString("bwriter"));
				boardDTO.setBdate(resultSet.getDate("bdate"));
				
				System.out.println("=========조회한 게시글 내용입니다.=========");
				System.out.println("번호 : " + boardDTO.getBno());
				System.out.println("제목 : " + boardDTO.getBtitle());
				System.out.println("내용 : " + boardDTO.getBcontent());
				System.out.println("작성자 : " + boardDTO.getBwriter());
				System.out.println("작성일 : " + boardDTO.getBdate());
				
			} else {
				System.out.println("조회한 게시물이 존재하지 않습니다.");
			}// if문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : readOne()메서드를 확인하세요.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
	}// readOne메서드 종료

	public void modify(String title, Scanner inputStr) throws SQLException {
		// 입력받은 제목을 dao에서 받아서 db에서 찾고 내용 수정
		try {
			System.out.println("수정 사항을 입력하세요.");
			System.out.print("제목 : ");
			boardDTO.setBtitle(inputStr.next());
			
			Scanner inputLine = new Scanner(System.in);
			System.out.print("내용 : ");
			boardDTO.setBcontent(inputLine.nextLine());
			
			String sql = "update board set btitle=?, bcontent=?, bdate=sysdate where btitle=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, title);
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "개의 게시물이 수정되었습니다");
				connection.commit();
			} else {
				System.out.println("수정이 완료되지않았습니다.");
				connection.rollback();
			}// if문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : modify()메서드 및 sql문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
		
	}// modify 메서드 종료

	public void deleteOne(Scanner inputStr, String title) throws SQLException {
		// 키보드로 입력받은 게시글의 제목을 찾아서 삭제 시킴
		try {
			String sql = "delete from board where btitle =?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "개의 게시물이 삭제되었습니다.");
				connection.commit();
			} else {
				System.out.println("삭제가 완료되지 않았습니다.");
			}// if문 종료
			
			System.out.println("===========mbc 게시글 전체 메뉴===========");
			selectAll();
			
		} catch (SQLException e) {
			System.out.println("예외발생 : deleteOne()와 sql문을 확인해주세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
		
	}// deleteOne 메서드 종료
	
}// BoardDAO CLASS의 메서드 종료
