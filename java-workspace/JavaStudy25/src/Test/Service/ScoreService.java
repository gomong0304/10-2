package Test.Service;

import java.util.Arrays;
import java.util.Scanner;

import Test.DTO.ScoreDTO;
import Test.DTO.StudentDTO;

public class ScoreService {
	// 필드
	// 생성자
	
	// 메서드
	public void menu(Scanner inputStr, Scanner inputint, ScoreDTO[] scores, StudentDTO[] students) {
		// 성적관리 보조메뉴
		boolean scrun = true;
		while(scrun) {
		System.out.println("---성적 관리 메뉴입니다.---");
		System.out.println("원하시는 메뉴를 선택해주세요");
		System.out.println("1.성적등록 | 2.성적보기 | 3.성적수정 | 4.성적삭제 | 5.메인메뉴");
		System.out.print("1~5 >>> ");
		String select = inputStr.next();
		switch(select) {
		case "1" :
			System.out.println("성적 등록 메뉴입니다.");
			regScore(inputStr, inputint, scores, students);
			for(int i =0 ; i<students.length; i++) {
				if(scores[i] != null) {
			System.out.println("-----성적 입력 완료------");
			System.out.println(students[i].getName() + " 학생의 성적입니다.");
			System.out.println("국어 : " + scores[i].getKor());
			System.out.println("수학 : " +  scores[i].getMat());
			System.out.println("영어 : " +  scores[i].getEng());
				}
			}
			break;
		case "2" :
			System.out.println("전체 성적 보기 메뉴입니다.");
			for(int i = 0; i<students.length; i++) {
				if(students[i] != null ) {
					System.out.println(students[i].getName() + "학생의 점수입니다.");
					System.out.print("국어 점수 : " + scores[i].getKor() + "\t");
					System.out.print("수학 점수 : " + scores[i].getMat() + "\t");
					System.out.print("영어 점수 : " + scores[i].getEng() + "\t");
					System.out.print("총합 : " + scores[i].getTotal()+ "\t" );
					System.out.print("평균 : " + scores[i].getAvg()+ "\n" );
				}// if문 종료
			}// for문 종료
			break;
		case "3" :
			System.out.println("성적 수정 메뉴입니다.");
			correction(inputStr, inputint, scores, students);
			break;
		case "4" :
			System.out.println("성적 삭제 메뉴입니다.");
			delete(inputStr, inputint, scores, students);
			break;
		case "5" :
			System.out.println("메인 메뉴로 돌아갑니다.");
			scrun = false;
			break;
		}// 성적관리 switch문 종료
		}// 성적관리 보조 메뉴 while문 종료
	}// 성적관리 보조 메뉴 종료	

	
	public ScoreDTO[] delete(Scanner inputStr, Scanner inputint, ScoreDTO[] scores, StudentDTO[] students) {
		// 성적 삭제 처리 메뉴
		ScoreDTO deleteScore = new ScoreDTO();
		
		System.out.print("삭제하실 학생의 이름을 입력해주세요 : ");
		String name = inputStr.next();
		for(int i = 0; i<scores.length; i++) {
			if(name.equals(students[i].getName())) {
				System.out.println(students[i].getName() + " 학생의 성적을 삭제하겠습니다.");
				scores[i].setKor(0);
				scores[i].setMat(0);
				scores[i].setEng(0);
				break;
			}//if문 종료
		}// for문 종료
		
		for(int i = 0; i<scores.length; i++) {
		System.out.println(students[i].getName() + "성적을 삭제 완료했습니다.");
		}// for문 종료
		return scores;
	}// 성적 삭제 처리 메뉴 종료

	
	public ScoreDTO[] correction(Scanner inputStr, Scanner inputint, ScoreDTO[] scores, StudentDTO[] students) {
		
		ScoreDTO scCorrection = new ScoreDTO();
		int i =0; 
		System.out.println("수정하실 학생을 입력해주세요.");
		System.out.print(">>> ");
		String name = inputStr.next();
		for(i = 0; i<students.length; i++) {
			if(name.equals(students[i].getName())) {
				System.out.println(students[i].getName() + "학생의 성적을 수정하겠습니다.");
				System.out.println(students[i].getName() + "학생의 성적 : ");
				System.out.println("국어 : " + scores[i].getKor());
				System.out.println("수학 : " + scores[i].getMat());
				System.out.println("영어 : " + scores[i].getEng());
				System.out.println("---------------------------");
				System.out.println("수정하실 점수를 입력해주세요");
				System.out.print("국어 : ");
				scores[i].setKor(inputint.nextInt());
				
				System.out.print("수학 : ");
				scores[i].setMat(inputint.nextInt());
				
				System.out.print("영어 : ");
				scores[i].setEng(inputint.nextInt());
				System.out.println("---------------------------");
				System.out.println("점수 수정이 완료되었습니다.");
				System.out.println(students[i].getName() + "수정 후 성적 : ");
				System.out.println("국어 : " + scores[i].getKor());
				System.out.println("수학 : " + scores[i].getMat());
				System.out.println("영어 : " + scores[i].getEng());
			
				break;
			}// if문 종료
		} // for문 종료
		return scores;
	}// 성적 수정 메서드

	public ScoreDTO[] regScore(Scanner inputStr, Scanner inputint, ScoreDTO[] scores, StudentDTO[] students) {
		// 성적 입력
		
		/*
		 * System.out.println(Arrays.toString(scores));
		 * System.out.println(Arrays.toString(students));
		 */
		int i = 0;
		System.out.print("성적을 입력하실 학생의 이름을 입력해주세요 : ");
		String name = inputStr.next();
		for(i = 0; i<students.length; i++) {
			if(students[i] == null) continue;
			else if(name.equals(students[i].getName())) {
				scores[i] = new ScoreDTO();
				System.out.println(students[i].getName() + " 학생의 성적을 입력하겠습니다.");
				System.out.print("국어 성적 : ");
				scores[i].setKor(inputint.nextInt());
				
				System.out.print("수학 성적 : ");
				scores[i].setMat(inputint.nextInt());
				
				System.out.print("영어 성적 : ");
				scores[i].setEng(inputint.nextInt());
			break;	
			}
		}
		return scores;
	}// 성적 입력 종료
}
