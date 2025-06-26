package ch02;

public class ForPrintExam2 {

	public static void main(String[] args) {
		// 초기화식이 둘이상이나 증감식이 둘이상이 들어갈수도있다.
		// 조건식에는 &&을 사용.
		
		for(int i=0, j=100; i<=10 && j>=00; i++, j--) {
			System.out.println("i값의 증가 : " + i + " // j값의 감소 : " + j);
		}// for문 종료

	}// main 메소드 종료

}// class 종료
