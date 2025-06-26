package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// 연산자는 프로그램에서 데이터를 처리하여 결과를 산출함
		// 연산자는 +, -, *, /, % (4칙연산자 + 나머지계산)
		// 피연산자는 변수, 값을 말함
		
		// 단항 연산 (변수가 1개인것)
		
		int x = 10 ;
		x++ ; // x = x + 1
		System.out.println("10에 ++ 단항연산한 결과 : " + x) ;
		
		x-- ; // x = x - 1 위에서 나온 x값이 내려옴
		System.out.println("x에 -- 단항연산한 결과 : " + x);
		
		
		// 이항 연산 (변수가 2개인 것)
		int y = 20 ;
		int result = x + y ;
		//    30     10  20
		
		
		System.out.println("x + y = " + result);
		
		
		
		// 삼항 연산 (항이 3개인 것)
		boolean result1 = (result>10) ? true : false ;
		//                    조건        참      거짓
		System.out.println("result>10 결과 : " + result1);
		
		
		String result2 = (result>50) ? "크다" : "작다" ; // 문자로 나오게 하려면 String 사용
		System.out.println("result>50 결과 : " + result2);
		
		
		int x1 = 10 * 10 ;   // 곱셈
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ;    // 나누기 -> 몫이 나옴
		System.out.println("10 / 3 = " + x2);
		int x3 = 10 % 3 ;    // 나머지 -> 나머지가 나옴
		System.out.println("10을 3로 나눈 나머지 = " + x3);
		
		
		// 미션 -> 3항 연산자를 사용하여 홀짝 계산을 해보자. (내가 한거)
		int x4 = 2197 ; 
		int result4 = x4 % 2 ;
		String result5 = (result4 < 1) ? "짝수" : "홀수" ;
		System.out.println(x4 + "의 결과는 : " + result5 );
		
		
		// 미션 -> 3항 연산자를 사용하여 홀짝 계산을 해보자. (선생님이랑 한거)
		int odd = 11 ;
		int div = odd % 2 ; // 11를 2로 나누었을 때 나머지를 div에 넣음
		String resultodd = (div == 1) ? "홀수" : "짝수" ;
		System.out.println("11의 홀짝 계산 결과 : " + resultodd);
		
		
		// 미션 -> 3항 연산자를 사용하여 4의 배수를  찾아보자 (내가 한거)
		int x5 =24;
		int result6 = x5 % 4 ; //x5를 4로 나누었을때 나머지를 result6에 넣음
		String result7 = (result6 == 0) ? "맞습니다" : "아닙니다" ;
		System.out.println(x5 + "는(은) 4의 배수가 " + result7);
		
		
		// 미션 -> 3항 연산자를 사용하여 4의 배수를  찾아보자 (선생님이랑 한거)
		int multi4 = 24 ;
		int div4 = multi4 % 4 ; 
		String resultDiv4 = (div4 == 0) ? "4의 배수입니다" : "4의 배수가 아닙니다." ;
		System.out.println("4의 배수 판단 결과 : " + resultDiv4);
		
		
		// 증감연산자 테스트
		System.out.println("-------증감연산자 위치에 따른 결과---------");
		int a = 10 ;
		a++ ; // a=a+1의 의미 -> 11
		++a ; // 11+1 = 12
		System.out.println("10 -> a++ -> ++a의 결과 " + a);
		
		int b = 10 ;
		b-- ;
		--b ;
		System.out.println("10 -> b-- -> --b의 결과 " + b);
		
		int c ;
		c = a++ ; 
		// 위에서 나온 a값인 12가 c로 들어가고 a++ -> 12+1로 계산되서 a값이 나옴
		//c = a 계산 후에 a = a + 1이 되었다.
		// 연산자의 우선순위에 따라서 계산이 되기 때문이다.
		System.out.println("a의 결과 : " + a); // 13
		System.out.println("c의 결과 : " + c); // 12
		System.out.println("----------------------------");
		
		c = ++a ;
		// 위에 a = 13이였으니까 c = a = a + 1
		System.out.println("a의 결과 : " + a); // 14
		System.out.println("c의 결과 : " + c); // 14
		System.out.println("----------------------------");
		
		
		c = ++a + b++ ;
		// 위에서 a = 14 였으니까 ++a = 15
		// 위에서 b = 8 이였으니까 b++ = 9
		// c는 왼쪽에서 부터 계산이 되어서 c = (1 + a) + (b = 8) + 이런식... -> 여기서 알수 있는것은 ++의 위치에 따라서 값이 변한다는 점
		System.out.println("a의 결과 : " + a); // 15
		System.out.println("b의 결과 : " + b); // 9
		System.out.println("c의 결과 : " + c); // 23
		System.out.println("----------------------------");
		
	}

}
