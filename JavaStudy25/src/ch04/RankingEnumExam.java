package ch04;

import ch04.Week.Week;

public class RankingEnumExam {

	public static void main(String[] args) {
		// ranking enum을 가지고 연습해보자
		
		Ranking[] grade = Ranking.values(); // values() 열거 타입의 모든 열거 객체들을 배얄로 만들어 리턴한다.
		for(Ranking a : grade) {
			System.out.println(a + " ");
		}
		
		Ranking grades = Ranking.ADMIN;
		String x = grades.name();
		int ordinal = grades.ordinal();
		System.out.println("객체의 이름은 : " + x );
		System.out.println("객체의 열거순서는 : " + ordinal);
		
		
		Week[] days = Week.values();
		for(Week b : days) {
			System.out.println(b + " ");
		}
		
	
	}// main 메서드 종료

}// class 종료
