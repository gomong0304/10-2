package ch04.staticBlock;

public class CalculatorExam {

	public static void main(String[] args) {
		// 정적 필드와 정적 메서드 사용
		
		System.out.println("계산기 내부의 파이값 : " + Calculator.pi);
		double result1 = 10*10*Calculator.pi;
		System.out.println("정적 필드로 계산한 값 : " + result1);
		double result2 = Calculator.plus(10,20);
		System.out.println("정적 메서드로 더하기 계산한 값 : " + result2);
		double result3 = Calculator.minus(10,20);
		System.out.println("정적 메서드로 빼기 계산한 값 : " + result3);

	}// 이거의 단점은 중간에 값이 꼬일수있다는 점이다.

}
