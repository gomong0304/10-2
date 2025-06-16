package ch01;

public class IntToFloatExam2 {

	public static void main(String[] args) {
		
		int num1 = 123456780 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ;
		num2 = (int) num3 ;
		
		System.out.println("num1 : " + num1) ;
		System.out.println("num2 : " + num2) ; //num2 : 123456784 int와 float의 값의 범위가 달라서 num1 num2의 값이 달라짐
		System.out.println("num3 : " + num3) ; 
		//num3 : 1.23456784E8 -> 지수형식으로 E뒤에 숫자를 부동 소수점 처리
		//       12.3456784E7
		//       1234567.84E2

		int result = num1 - num2 ;
		System.out.println("==============================");
		System.out.println("float으로 다녀온 후에 num2 값 변경됨");
		System.out.println("num1 - num2 : " + result);
		
		// float  int-> float 
		// float double 

	}

}
