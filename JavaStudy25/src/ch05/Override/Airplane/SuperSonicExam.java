package ch05.Override.Airplane;

public class SuperSonicExam {
	// 필드
	
	// 생성자
	
	// 메서드
	public static void main(String[] args) {
		// PPT P331 실습
		// 비행기 동작에 대한 오버레이드 실습
		SuperSonicAirplane sa = new SuperSonicAirplane(); // 새로운 객체 생성
		sa.takeoff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		System.out.println("현재 비행모드 : " + sa.flyMode);
		sa.fly();
		System.out.println();
		sa.flyMode = SuperSonicAirplane.NORMAL;
		System.out.println("비행모드 : " + sa.flyMode);
	}// main 종료

}// class 종료
