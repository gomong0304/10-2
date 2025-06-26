package ch02;

public class ForFloatConterExam {

	public static void main(String[] args) {
		// for문 작성시 주의할점
		// 초기화식에서 루프 카운트 변수를 부동 소수점,즉 실수로 사용하면 안된다
		
		float x=0;
		for(x=0.1f; x<1.0f; x=x+0.1f) {
			System.out.println(x);
		}// 루프를 9번만 진행하고 그이후는 진행 하지 않는다.

	}

}
