package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// 문자열 연결 테스트
		// print( "테스트" + "입니다.") -> +가 연결 연산자임
		// 피연산자 중 한쪽이 문자열이면 + 연산자는 문자열 연결로 반응함
		
		String str1 = "kor" + 17.0; // 17.0
		System.out.println(str1);
		
		String str2 = str1 + " 특징 : ";
		System.out.println(str2);
		
		String str3 = str2 + 3.0 + 3; 
		System.out.println(str3);
		
		String str4 = 3.0 + 3.0 + "kor"  ;
		System.out.println(str4);
		// 앞에서 뒤로 진행 string 타입의 str4의 방에 3.0+3.0 -> 6.0 + kor이 결합되서 들어갔다.
		
		String str5 = 'm' + 3.0 + "kor";
		// "m"으로 치면 문자 m이 나온다.
		// 'm'은 유니코드 표에서 109를 의미한다.
		// 코드의 흐름은 위에서 아래로 앞에서 뒤로
		// 3+3.0이 먼저 계산이 된 후에 문자열과 결합을 함
		System.out.println(str5);
	}

}
