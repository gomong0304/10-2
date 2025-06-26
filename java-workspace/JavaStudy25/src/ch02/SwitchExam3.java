package ch02;

import java.util.Scanner;

public class SwitchExam3 {

	public static void main(String[] args) {
		// 사용자 지정 메서드를 void 말고 return 받아 처리하는 코드를 만들어보자
		Scanner inputStr = new Scanner(System.in);
		boolean run=true;
		while (run) {
			
			System.out.println();
			System.out.println("동물 판독기입니다.");
			System.out.println("판독하고싶은 동물의 이름을 입력하세요");
			System.out.print(">>> ");
			String animal = inputStr.next();
			String kind = whoIsIt(animal);
			System.out.println(animal + "는(은) " + kind + "로 확인됩니다.");
			
		}// while문 종료
			
	}// main 메서드 종료

	static String whoIsIt(String animal) {
		
		String kind = null; // 초기의 kind는 아무 값도 없음
		switch(animal) {
		case "호랑이","사자","원숭이","강아지","고양이","코끼리" -> kind ="포유류";
		case "연어","고등어","갈치","참치","다금바리" -> kind="어류";
		case "독수리","참새","딱따구리","오리","비둘기" -> kind="조류";
		default -> kind = "알 수 없는 객체입니다.";
		
		}// switch문 종료
		
		return kind;
		
	}// whoIsIt(String animal 메소드 종료	
}// class 종료
