package ch04.CarEX;

import java.util.Scanner;

public class CarLogin {
	
	// 필드
	public String id; // 로그인할 id
	public String pw; // 로그인할 pw
	public String name; // 회원의 이름
	public int age; // 회원의 나이
	
	// 생성자
	public CarLogin() {
		
	}
	
	// 메서드
	public CarLogin login(Scanner input) {
		CarLogin member = new CarLogin();
		System.out.println("회원 가입할 id를 입력해주세요");
		System.out.print(">>> ");
		member.id = input.next();
		id = member.id;
		
		System.out.println("회원 가입할 pw를 입력해주세요");
		System.out.print(">>> ");
		member.pw = input.next();
		pw = member.pw;
		
		System.out.println("회원 가입이 완료 되었습니다.");
		System.out.println("id : " + id + ", pw : " + pw);
		
		return member;
	}
}
