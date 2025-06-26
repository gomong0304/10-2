package ch04.Week;

public class EnumWeekExam {

	public static void main(String[] args) {
		// 생성한 Week Enum을 활용해보자
		
		Week today = Week.FRIDAY;
		System.out.println(today);
		
		if(today.equals(Week.FRIDAY)) {
			System.out.println("TRUE");
		}else {
			System.out.println("false");
		}
		
		Week today1 = Week.SUNDAY;
		System.out.println(today1 == Week.SUNDAY);
		

	}// main 메서드 종료

}// class 종료
