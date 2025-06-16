package ch02;

import java.util.Scanner;

public class DoWhileExam2 {

	public static void main(String[] args) {
		// 업앤다운 게임 확장판
		// 컴퓨터가 랜덤 숫자를 생성한다. 1~50
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 입력한 숫자를 랜덤숫자와 비교 판단하여 up,dowm을 알려준다
		// 사용자가 입력한 숫자와 랜덤 숫자가 일치하면 프로그램을 종료하고, 당첨 사실을 알려준다.
		
		int number = (int)(Math.random()*50)+1; 
		// 컴퓨터가 1~50까지의 랜덤한 숫자를 생성해서 int 타입의 number변수에 넣음
		
		Scanner input = new Scanner(System.in);
		// 키보드로 객체를 입력 할수 있게 만듬
		
		int answer = 0; // 사용자가 대답한 숫자 보관용 초기값=0
		int hits = 0; // 도전횟수 초기값=0
		
		System.out.println("============================");
		System.out.println("UP & DOWM 게임에 오신걸 환영합니다.");
		System.out.println("3번안에 맞추면 상품을 제공합니다!!!!");
		System.out.println("============================");
		
		do {
			System.out.println("1~50 사이의 숫자를 입력하세요");
			System.out.print(">>>> ");
			answer = input.nextInt(); // 사용자가 숫자를 입력함
			hits++; // 한번 입력할때 마다 +1씩 늘어남
			if(answer>number) {
				System.out.println("down");
			}else if(answer<number) {
				System.out.println("up");
			}// if문 종료	
		}while(answer!=number); // 랜덤 숫자와 대답이 맞을때까지 반복
		
		System.out.println("정답 : " + answer);
		System.out.println("시도하신 횟수 : " + hits);
		
		if(hits<=3) {
			System.out.println("축하드립니다! 상품을 받아가세요" );
		}else {
			System.out.println("상품 수령에 실패했습니다.");
			System.out.println("다음에 다시 도전해주세요ㅜ.");
		}// 상품수령 if문 종료

	}// main 메소드 종료

}// class 종료
