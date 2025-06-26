package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for문은 반복문으로 초기화식,조건식,증감식으로 만든다.
		// for(int i=0; i<=10; i++){반복실행문};
		// i는 0부터 10이전까지 1씩 반복하는 실행문이다
		// for 문에서 사용하는 i 초기값은 for{}가 끝나면 사라진다.
		
		Scanner inputInt = new Scanner(System.in);
		System.out.print("확인할 max값을 입력하세요 >>> "); // 키보드로 값을 입력해야함
		int max = inputInt.nextInt(); // 키보드로 최대 숫자 입력
		System.out.print("확인할 min값을 입력하세요 >>> "); // 키보드로 값을 입력해야함
		int min = inputInt.nextInt(); // 키보드로 최소 숫자 입력
		
		System.out.println(min + " ~" + max + "까지의 증가값을 출력해보자");
		
		int total = 0; //초기값
		for(total=min; total<=max; total++) {
			System.out.println("증가값 : " + total);
		}// for문 종료

	}// main 메소드 종료

}// class 종료
