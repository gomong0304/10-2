package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch는 조건 제어문이다
		// 조건이 맞으면 case : 에 있는 실행문이 실행된다.
		// break;를 넣으면 멈출수있다.
		
		// 성적처리 프로그램을 만들어보자!
		
		Scanner input = new Scanner(System.in);
		System.out.println("=======mbc아카데미=======");
		System.out.println("a. 교직원관리");
		System.out.println("b. 학생관리");
		System.out.println("c. 성적관리");
		System.out.println("z. 프로그그램 종료");
		System.out.print("a~c 혹은 프로그램을 종료하려면 z를 눌러주세요>>> ");
		
		char word = input.next().charAt(0);
		// 문자열로 받아서 문자의 맨앞글자만 뺀다
		// System.out.println("선택한 문자 : " + word); 테스트해보고 추석처리함
		
		switch(word) {
		case 'a' :
		case 'A' :
		System.out.println(" ");
		System.out.println("교직원 관리 메뉴로 진입하였습니다.");
		System.out.println("1. 교직원 등록");
		System.out.println("2. 교직원 보기");
		System.out.println("3. 교직원 수정");
		System.out.println("4. 교직원 삭제");
		System.out.print("1~4 >>> ");
		int number1 = input.nextInt();
		
		switch(number1) {
			case 1 : 
				System.out.println(" ");
				System.out.println("교직원 등록 메뉴입니다");
				System.out.print("등록하시려는 교직원의 성함을 입력해주세요 >>> ");
				String name1 = input.next();
				System.out.print("등록하시려는 교직원의 생년월일을 입력해주세요 >>> ");
				int num1 = input.nextInt();
				System.out.println("교직원 " + name1 + "님 , " + " 생년월일 : " + num1);
				System.out.println("저장완료했습니다.");
				break;
			
			case 2 :
				System.out.println(" ");
				System.out.println("교직원 보기 메뉴입니다.");
				break;
			
			case 3 :
				System.out.println(" ");
				System.out.println("교직원 수정 메뉴입니다.");
				break;
			
			case 4 :
				System.out.println(" ");
				System.out.println("교직원 삭제 메뉴입니다.");	
				break;
			
			default : 
				System.out.println("잘못입력하셨습니다.");
				System.out.println("프로그램을 다시 실행하세요");
				break;
			}// 교직원 switch문 종료
			break;
		
		case 'b' :
		case 'B' :
			System.out.println(" ");
			System.out.println("학생 관리 메뉴입니다");
			break;
		
		case 'c' :
		case 'C' :
			System.out.println(" ");
			System.out.println("성적 관리 메뉴입니다.");
			System.out.print("성함을 입력해주세요. >>> ");
			String name2 = input.next();
			System.out.println(" ");
			System.out.println(name2 + " 의 성적을 입력해주세요");
			
			System.out.print("국어 : ");
			int kor = input.nextInt();
			if(kor<0 || kor>100) {
				System.out.println("잘못 입력하셨습니다. 재입력해주세요");
				break;
			}// 국어 성적 검증
			
			System.out.print("수학 : ");
			int mat = input.nextInt();
			if(mat<0 || mat>100) {
				System.out.println("잘못 입력하셨습니다. 재입력해주세요.");
				break;
			}//수학 성적 검증
			
			System.out.print("영어 : ");
			int eng = input.nextInt();
			if(eng<0 || eng>100) {
				System.out.println("잘못 입력하셨습니다. 재입력해주세요.");
				break;
			}//영어 성적 검증
			int total = kor + mat + eng;
			double avg = (int)total / 3;
			double score = avg;
			
			System.out.println(" ");
			System.out.println("확인하고자 하는 메뉴를 선택해주세요");
			System.out.println("1. 총점확인");
			System.out.println("2. 평균확인");
			System.out.println("3. 등급확인");
			System.out.print("1~3 >>> ");
			int number2 = input.nextInt();
			switch(number2) {
			case 1 : 
				System.out.println(" ");
				System.out.println("총점확인 메뉴입니다.");
				System.out.println("국여수의 총점은 : " + total + "입니다.");
				break;
				
			case 2 :
				System.out.println(" ");
				System.out.println("평균확인 메뉴입니다");
				System.out.println("국영수의 평균은 : " + avg + "입니다.");
				break;
				
			case 3 :
				System.out.println(" ");
				System.out.println("등급확인 메뉴입니다.");
				if(score>=90) {
					System.out.println("평균이 90 이상이므로 A등급입니다.");
				}	else if(score>=80) {
						System.out.println("평균이 80 이상이므로 B등급입니다.");
					}	else if(score>=70) {
							System.out.println("평균이 70 이상이므로 C등급입니다..");
						}	else if(score>=60) {
								System.out.println("평균이 60 이상이므로 D등급입니다..");
							} 	else {
									System.out.println("평균이 너무 낮아 등급확인이 어렵습니다.");
									System.out.println("더 공부하세요!!!!!");
								}
				break;
					
			default :
				System.out.println(" ");
				System.out.println("잘못입력하셨습니다.");
				System.out.println("프로그램을 재실행해주세요.");
				break;
			}
			break;
		
		case 'z' :
		case 'Z' :
			System.out.println(" ");
			System.out.println("프로그램을 종료합니다.");
			break;
		
		default :
			System.out.println("메뉴에 없는 문자입니다.");
			System.out.println("프로그램을 다시 실행해주세요.");
			break;
		}// switch문 종료
	}// main 메소드 종료
}// Class 종료
