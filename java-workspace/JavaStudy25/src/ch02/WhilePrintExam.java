package ch02;

import java.util.Scanner;

public class WhilePrintExam {

	public static void main(String[] args) {
		// While문은 false가 나오기 전까지 계속 반복된다.
		
		int i=1;
		int sum=0;
		
		while(i <= 100) {
			sum =sum+i;
			i++;
			System.out.println("1~" + (i-1) +"까지의 합 : " + sum);
		}//두번째 while문 종료

	}// main 메소드 종료

}// class 종료
