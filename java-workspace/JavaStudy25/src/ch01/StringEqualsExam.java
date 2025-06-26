package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// 지금까지 배운 변수 타입은 기본타입으로 자바에서 객체 없이 사용됨
		// String도 원래 객체를 생성하고 만들어야 하지만 편의상 생략해서 사용
		String strval1 = "박희진";
		String strval2 = "박희진";
		String strval3 = new String( "박희진" ); // 새로운 주소를 만들어냈음
		
		System.out.println( strval1 == strval2 );
		System.out.println( strval1 == strval3 );
		
		boolean eq1 = strval1.equals( strval3 );
		System.out.println( "1과 3번의 equals메서드 사용 결과 : " + eq1 );
		
		// 결론 String은 하나의 객체로 안에 동작이 포함되어있다.
		// String으로 비교를 할때는 == 보다는 equals 메서드를 사용하자
	}

}
