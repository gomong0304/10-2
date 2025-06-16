package mbcjdbc;

import java.sql.SQLException;
import java.util.Scanner;

import mbcjdbc.DAO.EmpDAO;

public class JDBCExam {

	public static void main(String[] args) throws SQLException {
		// 오라클과 자바를 연동하는 JDBC 테스트
		// 프로젝트 우클릭 빌드패스 -> 컨피그 빌드패스 -> 외부라이브러리 추가 필수! -> ojdbc6.jar 추가
		// References Libraries가 추가됨 -> ojdbc6.jar를 import 할수있다.
		// 예외 처리 : 서비스 제공중에 런타임이 중단되는것을 막기 위한 기법이다.
		// throws SQLException -> SQL 런타임 중에 오류나 버그로 중단되는것을 처리한다.
		
		
		// 패키지는 3개로 나눠서 구현
		// DTO : 객체용 게터 세터
		// DAO : 데이터 베이스에 접속하여 CRUD 쿼리 처리용
		// SERVICE :  자바에서 CRUD 부메뉴용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사원 이름 : ");
		String name = input.next();
		
		System.out.print("부서명 : ");
		String dept = input.next();
		
		System.out.print("입사 점수 : ");
		double score = input.nextDouble();
		// 키보드로 입력완료 -> num은 db에서 시퀀스 객체로 자동 주입되서 따로 작성x
		
		// 객체를 생성하여 DAO에게 전달해야함.
		EmpDAO empDAO = new EmpDAO(); // DAO 객체 생성 -> 메서드 호출하여 값 전달
		empDAO.insertEMP(name, dept, score);
		
		System.out.println("모든 데이터 확인해보기");
		empDAO.selectEMPALL();
	}

}
