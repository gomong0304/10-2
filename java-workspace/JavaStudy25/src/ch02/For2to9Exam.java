package ch02;

public class For2to9Exam {

	public static void main(String[] args) {
		// for문으로 구구단을 만들어보자
		// 2x1=2 ~ 2x9=18
		// 9x1=9 ~ 9x9=81
		
		for(int m=2; m<=9; m++) {
			System.out.println();
			System.out.println("========" + m + "단=========");
			
				for(int n=1; n<=9; n++) {
					System.out.print(" "+ m +  "X" + n + " = " + (m*n) + " ");
				}// 안쪽 for문 종료
		}// for문 종료

	}// main 메소드 종료

}// class 종료
