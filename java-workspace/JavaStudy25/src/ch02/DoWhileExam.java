package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do-while문 복습
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner in = new Scanner(System.in);
		String inputStr; // 키보드로 입력 받은 값 저장용
		
		do {
			System.out.print(">>> ");
			inputStr = in.nextLine(); // 키보드로 String 값을 입력 받는다.
			System.out.println("전송값 : " + inputStr);
		} while(!inputStr.equals("q"));
		System.out.println("----------");
		System.out.println("프로그램 종료");
		System.out.println("----------");
		
	}// main 메소드 종료

}// class 종료
