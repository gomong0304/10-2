package ch02;

import java.util.Scanner;

public class CalcuratorExam {

		// 간단한 계산기 프로그램 만들기
		// 입력 받기 : 숫자 > 연산자 > 숫자
		// 연산자별로 메서드에 숫자 넣기 (입력받는 순서에 맞춰서 조금 귀찮지만 메서드에서 잘 해결하기)
		// 결과값 main 메서드에서 출력해주기 (return 받아서)
		// 완료 반복재생 가능하게 while문 사용하기 
		// (다시 하시겠습니까? or 이어서 계산하시겠습니까?)
	
	static int plus(int x1, int x3) {
		int x4=0;
		x4=x1+x3;
		return x4;
	}// plus M end
	
	static int minus(int x1, int x3) {
		int x4=0;
		x4=x1-x3;
		return x4;
	}// minus M end
		
	static int times(int x1, int x3) {
		 int x4 = 0;
		 x4 = x1 * x3;
	     return x4;
	}// times M end

	static int divide(int x1, int x3) {
	     int x4 = 0;
	     x4 = x1 / x3;
	     return x4;
	}// divide M end

public static void main(String[] args) {
	
	int x1=0, x2=0, x3=0, x4=0, x5=0;
	boolean run=true, run2=true;
	
	String y1="연산기호";
	
	Scanner input = new Scanner(System.in);
	
	while(run) {
		if(x1==0) {
			System.out.println("=========정수 계산기========");
			System.out.println("int 범위 내의 숫자를 입력해주세요");
			System.out.print(">>> ");
			x1=input.nextInt();
		}// if문 종료
		System.out.println("부호를 선택해주세요");
		System.out.println("1. +(더하기)");
		System.out.println("2. -(빼기)");
		System.out.println("3. x(곱하기)");
		System.out.println("4. /(나누기)");
		System.out.print(">>> ");
		x2=input.nextInt();
		
		System.out.println("int 범위 내의 숫자를 입력해주세요");
		System.out.print(">>> ");
		x3=input.nextInt();
		
		run2=true;
		
		switch(x2) {
		case 1 :
			x4=plus(x1,x3); y1="+";
			break;
		case 2 :
			x4=minus(x1,x3); y1="-";
			break;
		case 3 :
			x4=times(x1,x3); y1="x";
			break;
		case 4 :
			x4=divide(x1,x3); y1="/";
			break;
		
		}// 스위치문 종료, default 생략
		
		System.out.println("계산결과 : " + x1 + " " + y1 + " " + x3 + "=" + x4);
		
		while(run2) {
			if(x4 !=0) {
				System.out.println("1.종료하기");
				System.out.println("2.다시하기");
				System.out.println("3.이어서 계산하기");
				System.out.print(">>> ");
			}else {
				System.out.println("1.종료하기");
				System.out.println("2. 다시하기");
			}
			
			x5=input.nextInt();
			switch(x5) {
			case 1 :
				run=false; 
				run2=false;
				break;
				
			case 2 :
				x1=0;
				x2=0;
				x3=0;
				run2=false;
				break;
				
			case 3 :
				x1=0;
				x2=0;
				x3=0;
				run2=false;
				break;
			
				default :
					System.out.println("숫자를 잘못선택하셨습니다.");
					System.out.println("다시 입력해주세요.");
			}// switch문 종료
					
		}// 안쪽 while문종료
		
	}// 바깥쪽 while문 종료
		
		
}// main 메서드 종료

}// class 종료
