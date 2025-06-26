package ch04;

public class AdvancedForExam {

	public static void main(String[] args) {
		// 향상된 for문을 복습해보자
		
		int[] scores = {97, 84, 54, 60, 40, 55};
		
		int sum = 0;// 총합 변수, 초기값 = 0
		for(int i : scores) {
			sum += i; // sum = sum + i; 
		}
		System.out.println("점수의 총합 : " + sum);
		
		String[] names = {"박희진", "지선우", "최수빈", "김시찬"};
		for(String i : names) {
			System.out.print(i + " ");
		}
	}// main 메서드 종료

}// class 종료
