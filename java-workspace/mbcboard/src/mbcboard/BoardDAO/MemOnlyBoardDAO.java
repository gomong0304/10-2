package mbcboard.BoardDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mbcboard.DTO.MemberDTO;

public class MemOnlyBoardDAO {
	// 회원 전용 게시판 dao
	// 필드
	MemberDTO memberDTO = new MemberDTO();
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	int result = 0; 
	
	// 생성자
	public MemOnlyBoardDAO() {
		
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
	
}// MemOnlyBoardDAO 클래스 종료
