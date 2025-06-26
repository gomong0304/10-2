package ch05.Override.Computer;

public class Computer extends Calculaor {
	// 필드
	// 생성자
	// 메서드
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}

}
