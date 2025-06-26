package ch04;

import java.util.Scanner;

public class Member {

	// main class 아님
	// 인스턴스 객체용 class
	// 속성=필드 생성
	public int infor ; // 회원 정보 int타입의 속성 생성
	public String id ; // 회원 id String타입의 속성 생성
	public String pw ; // 회원 pw String타입의 속성 생성
	
	
	// 생성자 생성 :  main 메서드가 new로 호출할때 동작.
	public Member() {
		// main 메서드에서 Member class의 메서드를 호출하려면 new Member();와 같이 호출 가능.
	}
	
	
	// 메서드 생성 : Member class에서 행해지는 동작=메서드 CRUD
	
	public Member memberAdd(Scanner input) {
		Member member = new Member(); // return용 객체
		System.out.println("회원 가입용 메서드 입니다.");
		System.out.println("회원 번호를 입력하세요");
		System.out.print(">>> ");
		member.infor = input.nextInt();
		
		System.out.println("회원가입 용 id를 입력하세요");
		System.out.print(">>> ");
		member.id = input.next();
		
		System.out.println("회원가입 용 pw를 입력하세요");
		System.out.print(">>> ");
		member.pw = input.next();
		
		return member;
	}
	
	public void memberAllList(Member[] members) {
		System.out.println("회원 전체 목록 보기용 메서드 입니다.");
		for(int i = 0; i<members.length; i++) {
			System.out.println("==" + (i+1) + "번째 회원 정보==");
			System.out.println("회원 번호 : " + members[i].infor);
			System.out.println("회원 id : " + members[i].id);
			System.out.println("회원 pw : " + members[i].pw);
		}
	}// 회원 전체 목록 보기용 메서드 종료
	 // return이 없어서 void로 저장
	
	public void memberLogin(Member[] members) {
		System.out.println("로그인용 메서드 입니다.");
	}
	
	public void memberUpdate(Member[] members) {
		System.out.println("회원 수정용 메서드 입니다.");
	}
	
	public void memberDelete(Member[] members) {
		System.out.println("회원 탈퇴용 메서드 입니다.");
	}
}
