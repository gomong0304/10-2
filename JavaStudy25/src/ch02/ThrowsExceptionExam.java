package ch02;

public class ThrowsExceptionExam {

	public static void main(String[] args) throws Exception {
		// 키보드의 입력을 받아 제어하는 실행문
		// 숫자 1 입력 -> 속도 증가
		// 숫자 2 입력 -> 속도 감소
		// 숫자 3 입력 -> 프로그램 종료
		
		// 키보드로 입력받는 키코드 리턴 -> int ketCode = System.in.read();
		
		boolean run = true; // 실행 여부를 판단
		int speed = 100; // 현재 속도는 100km/h
		int keyCode = 0; // 키보드로 입력되는 값
		
		while(run) { // run에 초기값이 true 이기 때문에 주행중이라는 뜻
			if(keyCode !=13 && keyCode !=10) { //유니코드 표로 엔터가 아니면
				System.out.println("-----------------------");
				System.out.println("1.엑셀 | 2.브레이크 | 3.중지");
				System.out.println("-----------------------");
				System.out.print("선택 : ");
			}//if문 종료
			keyCode = System.in.read(); // System.out.println(keyCode)
			
			if(keyCode == 49) {
				speed=speed+5; // speed+=5;
				System.out.println("현재 속도 : " + speed);
			}	else if(keyCode == 50) {
				speed=speed+5; // speed-=5
				System.out.println("현재 속도 : " + speed);
				}	else if (keyCode == 51) {
					run=false;
					System.out.println("크루즈 기능이 종료 됩니다.");
					System.out.println("현재 속도 : " + speed);
					System.out.println("안전운전하세요!!!");
					}
		}//while 문 종료
		System.out.println("프로그램 종료");

	}// main 메소드 종료

}// class 종료
