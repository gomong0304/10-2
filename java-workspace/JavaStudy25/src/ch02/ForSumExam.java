package ch02;

import java.util.Scanner;

public class ForSumExam {

	public static void main(String[] args) {
		// 최대값이 변동될때 최대값까지의 합계를 구해보자
		// 최대값을 키보드로 입력받는다.
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.print("max 값 >> ");
		int max = inputInt.nextInt(); // max값 입력
		System.out.print("min 값 >> ");
		int min = inputInt.nextInt(); // min값 입력
		
		
		int sum=0; // 누적합계를 구하는 변수 선언
		int i=0;
		
		for(i=min; i<=max; i++ ) {
			sum = sum+i;
		}//for문 종료
		
		System.out.println("min~max까지의 합계 >>> " + sum);
		
	}// main 메소드 종료

}// class 종료
