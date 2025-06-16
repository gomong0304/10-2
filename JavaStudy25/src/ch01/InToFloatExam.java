package ch01;

public class InToFloatExam {

	public static void main(String[] args) {
		// float은 32bit로 되어 있는 부동소수점 연산에 사용됨
		// 정수타입을 실수타입으로 변환 할 때 손실이 발생한다.
		// int(32bit) = float(32bit)
		
		int num1 = 123456781 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ; // int타입 값을 float에 넣음
		
		System.out.println(num1); // 123456781
		System.out.println(num2); // 123456780
		System.out.println(num3); // 1.23456784E8
	}

}
