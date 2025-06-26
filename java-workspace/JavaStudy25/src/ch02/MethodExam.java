package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {
		// 성적처리용 프로그램을 메서드로 재구현
		// 메인 메소드는 주 메뉴를 구현
		// 사용자 지정 메서드에서는 부 메뉴를 구현 해보자
		
		 Scanner inputInt = new Scanner(System.in);
		 String id= "phj";
		 String pw= "1234";
		 boolean run = true;
		 boolean login = false; // 로그인 상태 저장용, 초기 상태
		 
		 while(run) {
			 System.out.println("================================");
			 System.out.println("안녕하세요 mbc아카데미 학원 입니다.");
			 System.out.println();
			 System.out.println("1. 로그인");
			 System.out.println("2. 교직원 관리");
			 System.out.println("3. 학생 관리");
			 System.out.println("4. 성적 관리");
			 System.out.println("9. 프로그램 종료");
			 System.out.println("원하시는 메뉴를 선택해주세요");
			 System.out.print(">>> ");
			 int num = inputInt.nextInt();
			 System.out.println("================================");
			 
			 switch(num) {
			 case 1 :
				 System.out.println();
				 System.out.println("로그인 페이지로 이동합니다.");
				 login = loginOk(id,pw,login);
				 if(login=true) {
					 System.out.println();
					 System.out.println(id+ "님, 환영합니다.");
					 System.out.println("2~4번 메뉴를 사용할 수 있습니다.");
				 }// if문 종료
				 break;
				 
			 case 2 :
				 System.out.println();
				 System.out.println("교직원 관리 페이지로 이동합니다.");
				 break;
			 
			 case 3 :
				 System.out.println();
				 System.out.println("학생 관리 페이지로 이동합니다.");
				 break;
			 
			 case 4 :
				 System.out.println();
				 System.out.println("성적 관리 페이지로 이동합니다.");
				 break;
			 
			 case 9 :
				 System.out.println();
				 System.out.println("프로그램을 종료합니다.");
				 run=false;
				 break;
				 
			 }// switch문 종료
			 
		 }// while문 종료
		 		
	}// main 메서드 종료

	static boolean loginOk(String id, String pw, boolean login) {
		
		Scanner inputLogin = new Scanner(System.in);
		System.out.print("id : ");
		String inputId =inputLogin.next();
		System.out.print("pw : ");
		String inputPw =inputLogin.next();
		
		if(id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println();
			System.out.println("id와 pw가 일치 합니다.");
			System.out.println("로그인 성공");
			login = true;
		}else {
			System.out.println();
			System.out.println("id나 pw가 일치하지 않습니다.");
			System.out.println("로그인 실패");
			login = false;
		}
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}// class 종료
