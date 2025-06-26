package ch04.CarEX;

public class Car {
	// 필드
	public String company;  // 제작 회사
	public String number;   // 차량 번호
	public String color;    // 차량 색깔
	public int maxSpeed;	// 차량 최고 속도
	public int minSpeed;	// 차량 최저 속도
	public int speed;       // 차량 속도
	public int oil;         // 차량에 채워져있는 오일의 양
	
	// 생성자
	public Car() {
		maxSpeed = 300; // 최고 속도 300 지정
		minSpeed = 0;   // 최저 속도 0 지정
		speed = 0;     // 초기 속도 10 지정
		oil = 100;		// 초기 채워져있는 오일의 양 100 지정
	}
	
	// 메서드
	public void start(){
		System.out.println();
		System.out.println("===="+ number + "차량이 운행을 시작합니다.====");
		System.out.print("현재 속도 : " + speed + " ,");
		System.out.print("현재 주유량 : " + oil + " ");
		
	}// car class 메서드 종료
		
}// car class 종료
