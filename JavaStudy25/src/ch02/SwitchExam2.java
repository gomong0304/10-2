package ch02;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// 개선된 switch문을 사용해보자 -> 람다식이 적용되어있다.
		// 람다식이라는 것은 -> 화살표를 이용하여 값을 전달하는것
		// 메서드는 동작에 해당하는 기능을 main 메서드 바깥쪽에 만든다.
		// whoIsIt() 메서드를 호출해서 처리할 수 있도록 해보자
		
		Scanner inputStr = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("확인하고자 하는 동물이름을 입력해주세요");
			System.out.print(">>> ");
			String animal = inputStr.next();
			// 키보드로 입력한 동물을 문자열 타입의 animal 변수에 넣음.
			// 이제 내가 만든 메소드를 호출해보자
			
			whoIsIt(animal); // 지금 메소드가 없어서 호출이 안됨
		}// while문 종료
				
	}//main 메서드 종료

	static void whoIsIt(String animal) {
		// 사용자 정의 메서드,내가 직접 만든 메소드를 추가했음
		// void는 리턴값이 없을때 사용
		
		String kind=null;
		
		switch(animal) {
		case "호랑이","사자","원숭이","강아지","고양이","코끼리" -> kind ="포유류";
		case "연어","고등어","갈치","참치","다금바리" -> kind="어류";
		case "독수리","참새","딱따구리","오리","비둘기" -> kind="조류";
		}// switch문 종료
		
		System.out.println(animal + "는 " + kind + "로 판단됩니다");
		
		
	}// whoIsIt(String animal) 메서드 종료
	
}//class 종료
