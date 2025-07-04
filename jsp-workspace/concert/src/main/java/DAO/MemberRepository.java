package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.Member;

public class MemberRepository {
	
	private ArrayList<Member> listOfMembers = new ArrayList<Member>();
	
	private static MemberRepository instance;
	
	public static MemberRepository getInstance() throws ClassNotFoundException, SQLException{
		if(instance == null) 
			instance = new MemberRepository();
		return instance;
	}
	
	public MemberRepository() throws ClassNotFoundException, SQLException{
		
		Connection conn=null;
		
		String url="jdbc:mysql://192.168.111.102:3306/concert";
		String user="concert";
		String password="1234";
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1단계 성공");
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("2단계 성공");
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="SELECT*FROM member"; // DB 테이블
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		System.out.println("3단계 성공");
		
		while(rs.next()) {
			Member member = new Member();
			member.setId(rs.getString("m_id"));
			member.setPassword(rs.getString("m_password"));
			member.setName(rs.getString("m_name"));
			member.setGender(rs.getString("m_gender"));
			member.setBirth(rs.getString("m_birth"));
			member.setMail(rs.getString("m_mail"));
			member.setPhone(rs.getString("m_phone"));
			member.setAddress(rs.getString("m_address"));
			member.setRegist_day(rs.getString("m_regist_day"));
			
			listOfMembers.add(member);
			System.out.println(member.toString());
		}// while문 종료
	}// MemberRepository() 종료
	
	public ArrayList<Member> getAllMembers(){
		return listOfMembers;
	}// 모든 멤버 정보를 listOfMembers에 넘긴다
	
	public Member getMemberById(String id) {
		Member memberById = null;
		
		for(int i =0; i<listOfMembers.size(); i++) {
			Member member=listOfMembers.get(i);
			if(member !=null && member.getId() !=null && member.getId().equals(id)) {
				
				memberById = member;
				break;
			}
		}
		return memberById;
	}
	
	public void addMember(Member member) {
		listOfMembers.add(member);
	}
	
}
