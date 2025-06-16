package ch05.ScoresCard;

import java.util.Scanner;

public class ScoresExam {
	// 필드
	private static Scanner input = new Scanner(System.in);
	private static StudentDTO[] studentDTOs = new StudentDTO[5]; // 학생 객체용으로 5개의 배열 생성
	
	// 생성자 -> main일 경우 new 사용하지 않음(정적 static으로 사용하지 않음)
	// String[] string = new String[5];
	
	// 메인 메서드
	public static void main(String[] args) {
		// ScoresExam을 만들어보자 PPT p302
		// 주실행 클래스와 메뉴와 클래스, 메서드 호출용으로 작업
		// 객체 : 학생, 성적, 통계...
		
		boolean run = true;
		while(run) {
			System.out.println("====학생관리 프로그램 ver2====");
			System.out.println("1.학생관리 | 2.성적입력 | 3.통계 | 4.종료");
			System.out.print("원하시는 메뉴를 선택해주세요. >>> ");
			System.out.println("=========================");
			int select = input.nextInt();
			switch(select) {
			case 1 :
				System.out.println("학생 관리 메뉴입니다.");
				break;
			case 2 :
				System.out.println("성적 입력 메뉴입니다.");
				break;
			case 3 :
				System.out.println("통계 메뉴입니다.");
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}// 주메뉴 실행 switch문 종료
		}// 주메뉴 실행 while문 종료
		
	}// main 메서드 종료

}// class 종료
