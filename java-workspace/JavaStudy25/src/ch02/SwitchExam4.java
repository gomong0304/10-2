package ch02;

import java.util.Scanner;

public class SwitchExam4 {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner inputStr = new Scanner(System.in); // Scanner는 반복문 밖에서 한 번만 생성

		while (run) {
			System.out.println();
		    System.out.println("동물 판독기입니다.");
		    System.out.println("판독하고싶은 동물의 이름을 입력하세요");
		    System.out.println("종료하려면 '종료' 또는 'exit' 입력");
		    System.out.print(">>> ");
		    String animal = inputStr.next();
		    
		    if(animal.equalsIgnoreCase("종료") || animal.equalsIgnoreCase("exit")) {
			    System.out.println("프로그램을 종료합니다.");
			    run = false;
			    break;
		    }// if문 종료
			    
			String kind = whoIsIt(animal);
			System.out.println(animal + "는(은) " + kind + "로 확인됩니다.");
		    
		}// while문 종료
		      
	}// main 메소드 종료

		   static String whoIsIt(String animal) {
		      String kind = null;
		      switch(animal) {
		         case "호랑이","사자","원숭이","강아지","고양이","코끼리" -> kind = "포유류";
		         case "연어","고등어","갈치","참치","다금바리" -> kind = "어류";
		         case "독수리","참새","딱따구리","오리","비둘기" -> kind = "조류";
		         default -> kind = "알 수 없는 객체입니다.";
		      }// switch문 종료
		      
		      return kind;
		 }// 사용자 정의 메소드 종료
		
}// class 종료


