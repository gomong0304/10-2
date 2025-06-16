package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// 강제 타입 변환(Casting)
		// 큰 크기의 타입은 작은 크기의 타입으로 자동변환 할 수 없다.
		// int(21억) -> byte 타입으로 담으면 누수가 발생한다.
		// 이것을 누수가 발생해도 강제로 적용하는 법을 강제 타입 변환이라고 한다.
		
		int intValue = 123456789 ;
		byte byteValue = (byte)intValue ; 
		// 강제로 byte 타입으로 변환 (괄호안에 타입 넣으면 강제 변환)
		//Type mismatch: cannot convert from int to byte
		
		System.out.println("int 타입 값 출력 : " + intValue);
		System.out.println("byte 타입 값 출력 : " + byteValue);
		
		int kor = 100 ;
		int eng = 99 ;
		int mat = 97 ;
		
		int total = kor + eng + mat ; // 정수
		System.out.println("=========성적표==========");
		System.out.println(" 국어 + 영어 + 수학 = 총점 : " + total);// 정수
		
 		int avg = total / 3 ; // int 값으로 평균을 구함
 		System.out.println("평균점수 : " + avg); 
 		
 		double avg2 = total / 3 ; // 자동타입 변환 됨
 		System.out.println("평균점수  : " + avg2);
 		
 		avg2 = (double)total / 3 ; // 강제타입 변환 함
 		System.out.println("평균점수  : " + avg2);
 		
 	
	}

}
