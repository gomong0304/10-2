package ch05.Override.Airplane;

public class SuperSonicAirplane extends Airplane {
	
	// 필드
	public static final int NORMAL = 1; // 일반비행
	public static final int SUPERSONIC = 2; // 초음속비행
	// 상수 선언(변하지 않는 값)
	public int flyMode = NORMAL; // 기본 비행 모드는 일반비행임
	
	// 생성자
	// 메서드
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}else {
			super.fly(); // 부모에서 제공하는 fly 메서드 호출
		}
	}
}
