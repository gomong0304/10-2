package mbcjdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {
	// JDBC를 담당하는 클래스
	// 오라클과 쿼리를 작성하여 EXAM에 CRUD를 제공하자
	
	// JDBC는 이미 만들어진 외부 라이브러리로 5단계의 설정이 필수다.
	// 1단계 : 연결하는 객체가 있어야한다. -> Connection
	// 2단계 : 쿼리문을 생성하는 객체를 쓴다. -> Statement,PrepareStatement
	// 3단계 : 쿼리문을 실행하고
	// 4단계 : 쿼리문 실행 결과를 받는다. -> select는 resultSet으로 받고 나머지는 int로 받음
	// 5단계 : 연결을 종료한다.
	
	// 필드
	
	// 생성자(기본 생성자라서 작성안하면 알아서 생성됨)
	
	// 메서드
	public void insertEMP(String name, String dept, double score) throws SQLException {
		// 3개의 값을 매개값으로 전달 받아 emp 테이블로 전달해야함
		
		Connection conn = null; 			// db에 연결하는 객체 생성
		Statement stmt = null;			 	// 쿼리문 저장 객체 (구형)
		PreparedStatement pstmt = null; 	// 쿼리문 저장 객체 (신형)
		ResultSet resultSet = null; 		// 쿼리 실행 결과를 표로 출력 -> select용
		int result = 0; 					// 쿼리 실행 결과가 정수로 출력 C,U,D는 결과값이 1(성공),0(실패)로 출력
		
		// 기본 구조는 try{}catch{}catch{}finally{}; 이런식
		
		try { // 예외가 발생 가능성이 있는 실행문에서 활용
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계용 ojabc6.jar 호출
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");
			
			stmt = conn.createStatement(); //쿼리 처리용 객체 생성
			String sql = "insert into emp(num, name, dept, score) "
					+ " values(emp_seq.nextval, '" + name + "','" + dept + "','" + score + "')"; // 쿼리문 완성
			
		result = stmt.executeUpdate(sql);
		
		if(result>0) {
			System.out.println(result + "행의 데이터를 추가했습니다. \n");
			conn.commit();
		}else {
			System.out.println("결과 : " + result + "입니다.");
			System.out.println("입력 실패 롤백 처리 됩니다.");
			conn.rollback();
		}
		}catch(ClassNotFoundException e) {
			System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("URL이나 ID,PW가 잘못되었습니다. 확인해주세요.");
			e.printStackTrace();
		}finally {
			stmt.close();
			System.out.println("스테이트문 종료");
			conn.close();
			System.out.println("conn문 종료");
		}
	}// insertEMP 메서드 종료

	public void selectEMPALL() throws SQLException {
		// emp 테이블에 모든 정보를 번호기준으로 내림차순 출력
		
		Connection conn = null; 			// db에 연결하는 객체 생성
		Statement stmt = null;			 	// 쿼리문 저장 객체 (구형)
		PreparedStatement pstmt = null; 	// 쿼리문 저장 객체 (신형)
		ResultSet resultSet = null; 		// 쿼리 실행 결과를 표로 출력 -> select용
		int result = 0; 					// 쿼리 실행 결과가 정수로 출력 C,U,D는 결과값이 1(성공),0(실패)로 출력
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계용 ojabc6.jar 호출
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");
			
			stmt = conn.createStatement(); //쿼리 처리용 객체 생성
			String sql = "SELECT * FROM EMP ORDER BY NUM ASC"; // NUM 오름차순
			resultSet = stmt.executeQuery(sql); // 결과를 표로 받음
			
			System.out.println("----------------------------------------");
			System.out.println("사원번호\t 이름\t 부서\t 입사점수");
			System.out.println("----------------------------------------");
			
			while(resultSet.next()) { // 우리는 인덱스 번호 말고 필드명으로 쓰자.
				System.out.print(resultSet.getInt("num") + "\t"); // 필드명이 num인걸 찾아서 출력
				System.out.print(resultSet.getString("name") + "\t");
				System.out.print(resultSet.getString("dept") + "\t");
				System.out.println(resultSet.getDouble("score") + "\t");
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("URL이나 ID,PW가 잘못되었습니다. 확인해주세요.");
			e.printStackTrace();
		}finally {
			resultSet.close();
			System.out.println("resultSet 종료");
			stmt.close();
			System.out.println("스테이트문 종료");
			conn.close();
			System.out.println("conn문 종료");
		}
	}// selectEMPALL 메서드 종료

}
