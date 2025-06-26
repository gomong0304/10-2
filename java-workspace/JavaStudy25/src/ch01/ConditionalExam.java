package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
		// 삼항연산자는 3개의 항을 가진 연산자
		// if와 같이 비교하는 연산자로 많이 활용
		// 조건식 ? 참(실행문) : 거짓(실행문) -> 기본 형태
		
		int eng = 75;
		char grade = (eng > 90 ) ? 'A' : ( (eng >= 80) ? 'B' : 'C') ;
		System.out.println(eng + "점은" + grade + "등급입니다");	
		
	}//main종료
}//class종료
