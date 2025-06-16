package ch02;

public class BreakOutterExam {

	public static void main(String[] args) {
		// break문에 라벨을 붙이면 반복코드의 종료 시점을 정할 수 있다.
		
		for(char upper='A'; upper<='E'; upper++) {
			Outter : for(char lower='a'; lower<='e'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower =='e') {
					break Outter;
				}//if문 종료
			}// for문 종료
		}// for문 종료

	}// main 메소드 종료

}// class 종료
