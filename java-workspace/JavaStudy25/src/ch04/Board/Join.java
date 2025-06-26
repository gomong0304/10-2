package ch04.Board;

import java.util.Scanner;

public class Join {
	// 필드
	String id;
	String pw;
	String nickName;
	String email;
	
	
	// 생성자
	// 자동으로 생성자를 만듬
	
	Join join = new Join();
	
	// 메서드
	public Join register(Scanner input) {
		
		Join newjoin = new Join();
		System.out.println("가입할 id를 입력하세요");
		System.out.print(">>> ");
		newjoin.id = input.next();
		System.out.println("가입할 pw를 입력하세요");
		System.out.print(">>> ");
		newjoin.pw = input.next();
		System.out.println("닉네임을 입력하세요");
		System.out.print(">>> ");
		newjoin.nickName = input.next();
		System.out.println("email을 입력하세요");
		System.out.print(">>> ");
		newjoin.email = input.next();
		return newjoin;
	}
	
	public Join login(Scanner input, Join[] joins) {
		System.out.println("로그인을 시작합니다.");
		Join loginMember = new Join();
		System.out.println("id를 입력하세요");
		System.out.print(">>> ");
		loginMember.id = input.next();
		System.out.println("pw를 입력하세요");
		System.out.print(">>> ");
		loginMember.pw = input.next();
		return loginMember;
	}
	
}

