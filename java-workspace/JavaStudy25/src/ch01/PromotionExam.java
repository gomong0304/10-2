package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// 자동 타입변환 연습
		// : 작은 타입 값을 손실 없이 큰 타입 값으로 변화하는것.
		// byte(1byte : 8bit)
		// short(2byte : 16bit) & char(유니코드용 : 문자표현)
		// int(4byte : 32bit)
		// long(8byte : 64bit)   // 접미사 L을 붙여야 함 
		
		
		// float(4byte : 32 bit) // 여기서 부터 실수형 접미사F를 붙여야 함
		// double(8byte : 64bit)
		
		byte byteValue = 10 ; // 바이트 타입의 변수에 10값을 넣는다.
		int intValue = byteValue ; // 자동타입 변환이 됨
		System.out.println("�ڵ� Ÿ�� �� int : " + intValue);
		
		char charValue = '가' ; // 유니코드 10진법 44032->16진법 AC00
		intValue = charValue ;
		System.out.println("자동타입 된 int : " + intValue);
		
		intValue = 500 ;
		long longValue = intValue ;
		System.out.println("자동타입 된  long  " + longValue);
		
		double doubleValue = intValue ;
		System.out.println("자동타입 된  double : " + doubleValue);

		
	}

}
