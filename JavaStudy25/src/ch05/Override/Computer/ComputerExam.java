package ch05.Override.Computer;

public class ComputerExam {
	// 필드
	// 생성자
	
	// 메인 메서드
	public static void main(String[] args) {
		// PPT P328 실습
		int r = 10; // 10값을 실수로 전달
		
		Calculaor cal = new Calculaor();
		System.out.print("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		// 부모 객체에 대한 원면적 계산값
		
		Computer com = new Computer();
		System.out.print("원 면적 : " + com.areaCircle(r));
		System.out.println();
		// 자식 객체에 대한 원면적 계산값

	}// main 종료

}// class 종료
