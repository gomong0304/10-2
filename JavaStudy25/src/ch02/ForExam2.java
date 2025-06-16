package ch02;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {
		// 최소~최대 5씩 증가하는 증가값을 출력하게 만들어보자
		
		Scanner inputInt = new Scanner(System.in);
		System.out.print("확인할 max값 >> ");
		int max = inputInt.nextInt();
		System.out.print("확인할 min 값 >> ");
		int min = inputInt.nextInt();
		System.out.print("증가값 add >> ");
		int add = inputInt.nextInt();
		
		System.out.println(min + "~" + max + "까지" + add + "값을 알아보자");
		
		int i = 0; // 초기값
		for(i=min; i<=max; i=i+add) {
			System.out.println("출력값 : " + i);
		}// for문 종료
	
	}// main 메소드 종료

}// class 종료
