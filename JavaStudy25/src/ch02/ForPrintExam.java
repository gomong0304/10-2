package ch02;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문 연습
	
		for(int i=1; i<=10; i++) {
			System.out.println("1~10까지의 출력 : " + i);
		}// for문 종료
		
		System.out.println();
		
		for(int y=2; y<=10; y=y+2) {
			System.out.println("1~10까지의 숫자중 짝수만 출력 : " + y);
		}

	}// main 메소드 종료

}// class 종료