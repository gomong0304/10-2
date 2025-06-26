package ch04.staticBlock;

public class Calculator {
	// 전자 계산기용 객체
	// static을 이용하여 구현해보자.
	
	// 필드
	public static double pi = 3.14159;
	public static String name;
	public static String date;
	public static String owner;
	public static int result;
	
	// 생성자(따로 작성을 안하면 알아서 생성을 한다.)
	// new 없이 사용하기 위해서 초기값을 미리 설정해둔다.
	static { // 정적 메서드 값을 지정해둠
		name = "카시오";
		date = "2025-05-26";
		owner = "박희진";
				
	}
	
	// 메서드
	public static int plus(int x, int y) {
		return x+y;
	}
	
	public static int minus(int x, int y) {
		return x-y;
	}
	
	
	
	
	
}
