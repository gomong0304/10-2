package ch04;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		// 회원 관리 main 메서드

		Scanner input = new Scanner(System.in);
		
		Member[] members = null; 
		// Member 속성을 가지고있는 member 배열이 만들어졌는데 초기값이 없음.
		
		System.out.println("========회원가입 프로그램========");
		System.out.println("관리할 회원수를 입력해주세요");
		System.out.print(">>> ");
		int count = input.nextInt(); // 회원수를 키보드로 입력받음
		members = new Member[count]; // members 배열에 count 만큼의 배열을 만?듦
		
		
		boolean run = true;
		while(run) {
		System.out.println();
		System.out.println("회원 메뉴입니다.");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 목록 보기");
		System.out.println("3. 로그인");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 탈퇴");
		System.out.println("원하시는 메뉴를 선택해주세요.");
		System.out.print("(1~5 숫자만) >>> ");
		int select = input.nextInt(); // 원하는 메뉴 키보드로 입력하는 메서드
		
		switch(select) {
		case 1 :
			Member member1 = new Member(); // Member의 생성자를 불러옴, 객체 생성
			for(int i = 0; i<members.length; i++) {
				member1 = member1.memberAdd(input);
				members[i] = member1;
			}//case1의 for문 종료
			break;
		
		case 2 : 
			Member member2 = new Member();
			member2.memberAllList(members);
			break;
			
		case 3 : 
			Member member3 = new Member();
			member3.memberLogin(members);
			break;
			
		case 4 : 
			Member member4 = new Member();
			member4.memberUpdate(members);
			break;
			
		case 5 : 
			Member member5 = new Member();
			member5.memberDelete(members);
			break;
			
		default : 
			System.out.println("회원 가입 프로그램이 종료됩니다.");
			run = false;
			
		}// 회원 메뉴 선택 switch문 종료
				
		}// 회원 메뉴 while문 종료
			
	}// main 메서드 종료

}// class 종료
