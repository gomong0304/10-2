package ch05.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		Car2 mycar = new Car2(); // car2클래스에 mycar라는 변수를 생성해서 새로운 객체를 만든다.
		
		mycar.setSpeed(-20);
		System.out.println("현재 속도 : " + mycar.getSpeed());
		// 값을 제공할때는 set-
		// 값을 받을때는 get-
		
		mycar.setSpeed(-50);
		System.out.println("현재 속도 : " + mycar.getSpeed());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		System.out.println("현재 중지 상태 : " + mycar.getSpeed());
	}

}
