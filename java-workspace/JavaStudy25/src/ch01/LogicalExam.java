package ch01;

import java.util.Scanner; // 외부라이브러리에서 가지고온다

public class LogicalExam {

	public static void main(String[] args) {
		// 논리적인 연산자는 크게 5가지 유형이 있다.
		// & : 논리 곱 -> ~이고 (2가지 변수가 모두 참일 경우에 참)
		// | : 논리 합 -> ~이거나 (2가지 중 한개라도 참일 경우에 참)
		// ! : 논리 부정 -> 참과 거짓을 반전함
		// ^ : 배타적 논리 합 -> 논리합의 마지막인 1 + 1 = 0 으로 결론이 남 
		
		String loginid = "abc";
		String loginpw = "1234";
		
		Scanner input = new Scanner(System.in);
		// 콘솔에 키보드로 값을 밀어 넣을 객체를 생성함
		
		System.out.println( "로그인할 ID를 입력해주세요 : " );
		String id = input.nextLine();
		System.out.println("입력하신 ID는 : " + id + " 입니다.");
		
		System.out.println("로그인할 PW를 입력해주세요 : ");
		String pw = input.nextLine();
		System.out.println("==검증중==");
		
		
		if ( (loginid.equals(id)) & (loginpw.equals(pw)) ) {
			System.out.println("ID와 PW가 모두일치합니다.");
			System.out.println("로그인 성공!");
		}	else { 
			System.out.println("ID나 PW가 일치하지않습니다.");
			System.out.println("로그인 실패");
			}//if문 종료		
	}//main 메서드 종료
}//Class 종료
