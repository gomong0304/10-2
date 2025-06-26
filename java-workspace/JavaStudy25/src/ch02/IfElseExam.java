package ch02;

import java.util.Scanner;

public class IfElseExam {

	public static void main(String[] args) {
		// if-else 연습
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = input.nextInt();
		
		if (number % 2 == 0)
		System.out.println("짝수!");
		
		else
		System.out.println("홀수!");
		
		System.out.println("종료");
		
	}// main 메소드 종료
}//Class 종료

