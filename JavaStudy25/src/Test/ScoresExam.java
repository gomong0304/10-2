package Test;

import java.util.Scanner;

import Test.DTO.ScoreDTO;
import Test.DTO.StudentDTO;
import Test.Service.ScoreService;
import Test.Service.StudentService;

public class ScoresExam {
	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputint = new Scanner(System.in);
	
	public static StudentDTO[] students = new StudentDTO[10]; // 학생 배열 10개
	public static ScoreDTO[] scores = new ScoreDTO[10]; // 점수 배열 10개
	/*
	 * public static StudentDTO student = null; // 학생 정보 저장하는 객체 public static
	 * ScoreDTO score = null; // 점수 저장하는 객체
	 * static { StudentDTO studentDTO0 = new StudentDTO("박희진", 970702, 3, 1);
	 * students[0] = studentDTO0;
	 * 
	 * ScoreDTO scoreDTO0 = new ScoreDTO(100, 100, 100); 
	 * scores[0] = scoreDTO0; 
	 * }
	 */
	
	// 생성자
	
	// 메인 메서드
	public static void main(String[] args) {
		// 성적관리용 프로그램을 만들자 (25.05.29 시험)
		
		boolean run = true;
		while(run) {
			System.out.println("===MBC아카데미 성적 처리 프로그램===");
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1.학생관리 | 2.성적관리 | 3.프로그램 종료");
			System.out.print("1~3 >>> ");
			String select = inputStr.next();
			System.out.println("=============================");
			switch(select) {
			case "1" :
				System.out.println("학생 관리 메뉴입니다.");
				StudentService studentService = new StudentService();
				studentService.menu(inputStr, inputint, students);
				break;
			case "2" :
				System.out.println("성적 관리 메뉴입니다.");
				ScoreService scoreService = new ScoreService();
				scoreService.menu(inputStr, inputint, scores, students);
				break;
			case "3" :
				System.out.println("프로그램을 종료합니다.");
				System.out.println("이용해 주셔서 감사합니다.");
				run = false;
				break;
			default :
				System.out.println("없는 메뉴입니다. 다시 선택해주세요");
				break;
			}// 메뉴선택 switch문 종료
		}// 메뉴선택 while문 종료
	}// main 메서드 종료

}// class 종료
