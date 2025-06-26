package ch02;

public class ContinueExam {

	public static void main(String[] args) {
		// Continue문은 반복문을 종료하지 않고 계속 박복을 수행한다.
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}// if문 종료
		
			System.out.println(i);
			
		}// for문 종료
		
	}// main 메소드 종료

}// class 종료
