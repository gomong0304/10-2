package ch02;

import java.util.Scanner;

public class DoWhileTestExam {

	public static void main(String[] args) {
		// upAndDown 게임을 만들어보자
		
		int input=0, answer=0;
		
		answer=(int)(Math.random()*31)+1; //1~31까지의 랜덤한 숫자를 고름
		Scanner num = new Scanner(System.in);
		
		do {
			System.out.println("1~31 사이의 숫자를 입력하세요.");
			System.out.print(">>> ");
			input = num.nextInt();
			
			if(input>answer) {
				System.out.println("down");
			}else if(input<answer) {
				System.out.println("up");
			}
		}while(input!=answer); //계속 반복한다 넣은 값과 정답이 다를때
		System.out.println("정답 : " + answer);		
		
	}// main 메소드 종료

}// class 종료
