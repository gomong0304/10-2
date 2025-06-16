package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// 비교 연산자는 동등비교와 크기비교가 있다.
		// == : 같냐?
		// != : 다르냐?
		// >  : 초과, 크냐?
		// >= : 이상, 크거나 같냐?
		// <  : 미만, 작냐?
		// <= : 이하, 작거나 같냐?
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = ( num1 <= num2 ); 
		//boolean 타입은 true, false 값을 갖을 수 있다.
		//              참     거짓
		System.out.println(result1);
		
		char char1 = 'A'; // 유니코드로 A 65
		char char2 = 'a'; // 유니코드로 a 97
		boolean result2 = ( char1 > char2 );
		System.out.println( result2 );
		boolean result3 = ( num1 > char2 );
		System.out.println( "num1 > char2? " + result3 );
		
		char char3 = 43;
		char char4 = 42;
		System.out.println(char3);
		System.out.println(char4);
		
		int v2 = 1;
		double v3 =1.0;
		System.out.println("===================================");
		System.out.println(v2 == v3);
		// 동등비교연산자에 타입이 다른 변수를 비교하면 자동 타입 변환이 일어난다.
		// 이때 자동 타입 변환은 큰 값으로 타입을 매칭한다.
		
		double v4 = 0.1 ;
		float v5 = 0.1F ;
		System.out.println("==========================");
		System.out.println(v4 == v5); // false 왜?
		// 실수형(소수점)은 부동 소수점 연산을 수행해서 근사값으로 표현을 한다.
		// true 처리를 하려면 강제타입 변환을 해야함
		System.out.println((float)v4 == v5); // v4를 float 형으로 변환
		System.out.println(v4 == (double)v5); // v5를 double 형으로 변환 ->자동 타입 변환임
		
		System.out.println((int)(v4*10) == (int)(v5*10)); 
		// (int)v4 (int)v5처리를 하면 둘다 소수점을 날려서 0이 됨
		// 그래서 10을 곱해준 다음에 (int) 처리를 함
		System.out.println(v4); // 0.1
		System.out.println(v5); // 0.1
		//print문에서 계산을 한 값은 변수에 저장되지 않는다. 왜? 해킹 때문에
	}

}
