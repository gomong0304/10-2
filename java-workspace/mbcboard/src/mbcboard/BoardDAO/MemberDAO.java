package mbcboard.BoardDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import mbcboard.DTO.MemberDTO;

public class MemberDAO {
	// 필드
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	// 기본생성자
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest");
		} catch(ClassNotFoundException e) {
			System.out.println("driver 이름이나 ojdbc6.jar 파일이 잘못되었습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch(SQLException e) {
			System.out.println("URL,ID,PW가 잘못되었습니다. MemberDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0);
		}
	}// 기본생성자 종료

	
	// 메서드
	public ArrayList<MemberDTO> selectAll() throws SQLException {
		// sql,select 활용해서 회원 목록 결과 출력
		
		ArrayList<MemberDTO> memberList = new ArrayList<>();
		
		try {
			String sql = "select mno, bwriter, id, regidate from member order by mno asc";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			System.out.println("번호\t 작성자\t 아이디\t 가입날짜\t\t");
			while(resultSet.next()) {
				MemberDTO member = new MemberDTO();
				System.out.print(resultSet.getInt("mno") + "\t");
				member.setMno(resultSet.getInt("mno"));
				System.out.print(resultSet.getString("bwriter") + "\t");
				member.setBwriter(resultSet.getString("bwriter"));
				System.out.print(resultSet.getString("id") + "\t");
				member.setId(resultSet.getString("id"));
				System.out.println(resultSet.getDate("regidate") + "\t\t");	
				member.setRegidate(resultSet.getDate("regidate"));
				
				memberList.add(member);
			}// while문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : selectAll() 메서드의 쿼리문을 확인해주세요");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close();
		}	
		
		return memberList;
	}// selectAll() 메서드 종료
	
	public void insertMember(MemberDTO memberDTO) throws SQLException {
		// 키보드로 입력받은 이름,id,pw로 새로운 회원 insert문
		
		try {
			String sql = "insert into member(mno, bwriter, id, pw, regidate) " + 
					" values(board_seq.nextval,?,?,?,sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "명의 회원이 등록되었습니다");
				connection.commit();
			} else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("회원가입에 실패했습니다.");
				connection.rollback();
			}// if문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : insertMember()메서드 및 쿼리문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}	
	}// insertMember문 종료


	public void readOne(String name) throws SQLException {
		// 회원 이름 문자열이 넘어온것을 sel 처리하여 출력함
		try {
			String sql = "select mno, bwriter, id, regidate from member where bwriter = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				MemberDTO memberDTO = new MemberDTO();
				
				memberDTO.setMno(resultSet.getInt("mno"));
				memberDTO.setBwriter(resultSet.getString("bwriter"));
				memberDTO.setId(resultSet.getString("id"));
				memberDTO.setRegidate(resultSet.getDate("regidate"));
				
				System.out.println("--------조회된 회원 정보--------");
				System.out.println("회원 번호 : " + memberDTO.getMno());
				System.out.println("이름 : " + memberDTO.getBwriter());
				System.out.println("id : " + memberDTO.getId());
				System.out.println("가입 날짜 : " + memberDTO.getRegidate());
			} else {
				System.out.println("조회하는 회원이 존재하지 않습니다. \n다시입력바랍니다.");
			}// if문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : readOne()메서드 및 쿼리문을 확인하세요.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
	}// readOne메서드 종료


	public void modify(String id, Scanner inputStr) throws SQLException {
		// 수정할 회원을 찾아서 정보를 수정한다.
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("수정할 정보를 입력하세요.");
		System.out.print("이름 : ");
		memberDTO.setBwriter(inputStr.next());
		
		System.out.print("id :");
		memberDTO.setId(inputStr.next());
		
		System.out.print("pw : ");
		memberDTO.setPw(inputStr.next());
		
		try {
			String sql = "delete bweiter from board where member_id=? ";  
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			
			String sql2 = "update member set bwriter=?, id=?, pw=?, regidate=sysdate where id=?";
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			preparedStatement.setString(4, id);
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "개의 정보가 수정되었습니다.");
				connection.commit();
			} else {
				System.out.println("수정이 완료되지 않았습니다.");
				connection.rollback();
			}//if문 종료
			
			System.out.println("----------수정후 전체 List----------");
			selectAll();
			System.out.println("---------------------------------");
			
		} catch (SQLException e) {
			System.out.println("예외발생 : modify() 메서드 및 쿼리문을 확인하세요");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
	}// modify 메서드 종료

	
	public void deleteOne(String id) throws SQLException {
		// 로그인을 하고 회원 삭제 메서드
		
		try {
			String sql = "delete from member where id =?";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "명의 회원이 삭제 되었습니다.");
				connection.commit();
			} else {
				System.out.println("회원 삭제가 되지 않았습니다.");
				connection.rollback();
			}// if문 종료
			
			System.out.println("----------가입되어있는 List----------");
			selectAll();
			System.out.println("---------------------------------");
			
		} catch (SQLException e) {
			System.out.println("예외발생 : deleteOne()메서드 및 쿼리문을 확인하세요.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}	
	}// deleteOne 메서드 종료	
	
	
	public MemberDTO login (MemberDTO session, MemberDTO memberDTO) throws SQLException {
		try {
			String sql = "select * from member where id=? and pw=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId());
			preparedStatement.setString(2, memberDTO.getPw());
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				memberDTO.setMno(resultSet.getInt("mno"));
				memberDTO.setBwriter(resultSet.getString("bwriter"));
				memberDTO.setId(resultSet.getString("id"));
				memberDTO.setPw(resultSet.getString("pw"));
				memberDTO.setRegidate(resultSet.getDate("regidate"));
				return session;
			}// if문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : MemberDTO() 메서드 및 쿼리문을 확인하세요");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
			resultSet.close();
		}	
		return null;
	}
}// memberDAO 메서드 종료
