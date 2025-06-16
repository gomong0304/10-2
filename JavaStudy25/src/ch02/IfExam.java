package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if(조건문){ 실행문 }
		//    조건문에 true가 처리 되면 중괄호 안쪽이 실행된다.
		//    조건문에 false가 처리되면 중괄호 안쪽이 실행되지 않는다.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=======안녕하세요=======");
		System.out.println("귀하의 성함을 입력하세요");
		System.out.print(">>>> ");
		String name = input.next();
		
		System.out.println("귀하의 성적을 입력하세요");
		System.out.print(">>>> ");
		int kor = input.nextInt(); 
		
		if (kor > 0 && kor <= 100) {
		System.out.println("================================");
		System.out.println("점수 : " + kor + "입니다.");
		System.out.println("등급을 확인하시겠습니까?");
		System.out.print(">>>> ");
		String answer = input.next();
		if (answer.equalsIgnoreCase("yes")) {
			if (kor >= 90 ) {
			System.out.println("90점 이상으로 A등급입니다." );	
			}	else if (kor >= 80 ) {
				System.out.println("80점 이상으로 B등급입니다." );
				}	else if (kor >= 70 ) {
					System.out.println("70점 이상으로 C등급입니다." );
					} 	else if (kor >= 60 ) {
						System.out.println("60점 이상으로 D등급입니다." );
						}	else {
							System.out.println("점수가 너무 낮아 등급 측정이 어렵습니다." );	
							} 
		}	else { 
			System.out.println("====다시 응답해주세요.====");
			}
		} else { System.out.println("입력하신 점수가 잘못되었습니다.");
		}
	}	
}

		
		


