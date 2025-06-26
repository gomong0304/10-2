package ch04.Board;

import java.util.Scanner;

public class BoardExam {
	
	public static Scanner input = new Scanner(System.in);
	public static Join[] joins = new Join[100];
	public static Board[] boards = new Board[1000];
	

	public static void main(String[] args) {
		// 회원 전용 게시판 프로그램을 제작해보자
		// 객체는 join board 2개 사용
		// 회원 전용 게시판이다.
		
		System.out.println("======회원 전용 게시판======");
		
		boolean run = true;
		while(run) {
			System.out.println("1.회원관리 | 2.게시판 | 3.종료");
			System.out.print(">>> ");
			String select = input.next(); // 들어갈 메뉴를 키보드로 입력받음 근데 스트링 타입
			
			switch(select) {
			case "1" :
				System.out.println("회원 관리 메뉴로 진입합니다.");
				Join join = new Join(); // join 클래스에서 생성자를 가져옴
				// 빈 객체를 생성함
				join.register(input);
				break;
				
			case "2" :
				System.out.println("게시판 메뉴로 진입합니다.");
				break;
				
			case "3" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}// 메뉴 선택 스위치문 종료
			
			
			
			
			
			
			
		}// while문 종료
		
	}// main 메서드 종료

}// class 종료
