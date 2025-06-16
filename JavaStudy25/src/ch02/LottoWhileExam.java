package ch02;

public class LottoWhileExam {

	public static void main(String[] args) {
		// while문을 활용하여 로또 번호 추첨 프로그램을 만들어보자
		
		int i= 0; // 초기값 설정
		while(true){
			int num = (int)(Math.random()*45)+1;
			// System.out.println(num);
			System.out.println("오늘의 로또 번호 : " + num);
			i++;
			if(i == 6) {
				System.out.println("프로그램 종료");
				break;
			}// if문 종료
			
		}// while문 종료
		
	}// main 메서드 종료

}// class 종료
