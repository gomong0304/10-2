package ch03;

import java.util.Scanner;

public class VMachinePraticeExam {

	public static void main(String[] args) {
		// 자판기 프로그램을 구현해보자...

		Scanner input = new Scanner(System.in);
		String[] drinks = new String[3]; // 자판기의 음료수를 저장할 배열 (최대 3개 음료수)
		int[] prices = new int[3]; // 음료수의 가격(최대 3개)
		String[] userIds = new String[1];
		String[] userPws = new String[1];
		String Id = "phj";
		String Pw = "1234";

		boolean run = true;
		while (run) {
			System.out.println("=====자판기를 실행합니다.=====");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. 관리자 모드");
			System.out.println("2. 사용자 모드");
			System.out.println("3. 프로그램 종료");
			System.out.print("1~3 >>> ");
			int num1 = input.nextInt(); // 메뉴 처리

			switch (num1) {
			case 1:
				System.out.println();
				System.out.println("관리자 모드로 실행합니다.");
				System.out.println();
				System.out.println("로그인이 필요합니다.");
				System.out.println("관리자 id를 입력해주세요.");
				System.out.print(">>> ");
				String id = input.next();
				System.out.println("입력하신 id는 " + id + " 입니다.");
				System.out.println("관리자 pw를 입력해주세요.");
				System.out.print(">>> ");
				String pw = input.next();
				System.out.println("입력하신 id는 " + pw + " 입니다.");
				System.out.println("===========검증 중===========");
				
				if((Id.equals(Id)) && (Pw.equals(pw))) {
					System.out.println("id와 pw가 일치합니다.");
					System.out.println("로그인에 성공하였습니다.");
				}else {
					System.out.println("id나 pw가 일치하지 않습니다.");
					System.out.println("다시 시도해주세요.");
				}// if-else 문 종료
				
				boolean subrun = true;
				while(subrun) {
				
				System.out.println("=====관리자 모드=====");
				System.out.println("a. 음료 등록");
				System.out.println("b. 음료 보기");
				System.out.println("c. 음료 수정");
				System.out.println("d. 음료 삭제");
				System.out.println("z. 관리자 모드 종료");
				System.out.print("a~z >>> ");
				char word = input.next().charAt(0);

				switch (word) {
				case 'a':
				case 'A':
					System.out.println();
					System.out.println("음료 등록 메뉴입니다.");
					System.out.println();
					System.out.println("등록하실 음료를 입력해주세요.");
					for (int i = 0; i < drinks.length; i++) {
						System.out.println((i + 1) + "번째 음료와 가격을 입력하세요.");
						System.out.print("음료명 >>> ");
						drinks[i] = input.next(); // nextline에 엔터가 포함되어있어서 생략이 된다.
						System.out.print("가격 >>> ");
						prices[i] = input.nextInt(); // 첫번째 음료 가격 입력
					} // for문 종료
					System.out.println("자판기에 등록된 음료 : ");
					for (int i = 0; i < drinks.length; i++) {
						System.out.println((i + 1) + "번째 음료 : " + drinks[i] + ", 가격 : " + prices[i]);
					} // for문 종료
					System.out.println();
					System.out.println("음료가 등록완료되었습니다.");
					System.out.println("이전 화면으로 돌아갑니다.");
					break;

				case 'b':
				case 'B':
					System.out.println();
					System.out.println("등록된 음료 보기 메뉴입니다.");
					for (int i = 0; i < drinks.length; i++) {
						System.out.println((i + 1) +"번째 음료 : " + drinks[i] + ", 가격  : " + prices[i] + "원 입니다.");
					} // for문 종료
					System.out.println();
					System.out.println("이전 화면으로 돌아갑니다.");
					break;

				case 'c':
				case 'C':
					System.out.println();
					System.out.println("===음료 수정 메뉴입니다.===");
					drinkList(drinks, prices);
					break;

				case 'd':
				case 'D':
					System.out.println();
					System.out.println("===음료 삭제 메뉴입니다.===");
					drinkDelete(drinks, prices);
					break;
					
				case 'z':
				case 'Z':
					System.out.println();
					System.out.println("관리자 메뉴를 종료합니다.");
					System.out.println("이전 페이지로 돌아갑니다.");
					subrun = false;
					break;	

				default:
					System.out.println();
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("다시 입력해주세요.");

				}// 관리자 모드 스위치 종료
				
			}// subrun while문 종료
				break;

			
			case 2:
				System.out.println();
				System.out.println("사용자 모드로 실행합니다.");
				System.out.println("사용자 모드를 사용하시려면 회원가입하셔야 합니다.");
				System.out.println();
				System.out.println("가입하실 id를 입력해주세요.");
				System.out.print(">>> ");
				String userId1 = input.next();
				for(int i =0; i<userIds.length; i++) {
				userIds[i] = userId1;
				}
				System.out.println("가입하실 pw를 입력해주세요.");
				System.out.print(">>> ");
				String userPw1 = input.next();
				for(int z=0; z<userPws.length; z++) {
				userPws[z] = userPw1;
				}
				
				System.out.println();
				System.out.println("회원 가입이 성공적으로 완료되었습니다.");
				System.out.println("입력하신 id : " + userId1 + " ,입력하신 pw : " + userPw1);
				System.out.println("=========================================");
				System.out.println("로그인해 주세요");
				System.out.print("id를 입력해 주세요>>> ");
				String user1id = input.next();
				System.out.print("pw를 입력해 주세요>>> ");
				String user1pw = input.next();
				System.out.println("================검증중입니다================");
				if((userId1.equals(user1id)) && (userPw1.equals(user1pw))) {
					System.out.println("id와 pw가 일치합니다.");
					System.out.println("로그인에 성공하였습니다.");
				}else {
					System.out.println("id와 pw가 일치하지않습니다.");
					System.out.println("로그인에 실패하였습니다.");
					System.out.println("다시 시도해주세요.");
					break; // 다시 로그인하는 곳으로 가고 싶은데....ㅠㅠ
				}// 로그인 if-else 문 종료
				
				
				boolean userRun = true;
				while(userRun) {
				System.out.println();
				System.out.println("=====사용자 모드=====");
				System.out.println("가. 요금 충전");
				System.out.println("나. 음료 선택");
				System.out.println("다. 요금 계산");
				System.out.println("라. 사용자 모드 종료");
				System.out.println("하. 관리자 호출");
				System.out.print(">>> ");
				String user = input.next(); // 사용자 모드 개행
				
				switch(user) {
				
				case "가" :
					System.out.println("요금 충전 메뉴입니다.");
					
					break;
					
				case "나" :
					System.out.println("음료 선택 메뉴입니다.");
					break;
					
				case "다" :
					System.out.println("요금 계산 메뉴입니다.");
					break;
					
				case "라" :
					System.out.println("사용자 모드를 종료합니다.");
					System.out.println("이전 페이지로 돌아갑니다.");
					userRun = false;
					break;
					
				case "하" :
					System.out.println("관리자를 호출합니다");
					break;
					
				default :
					System.out.println();
					System.out.println("메뉴에 없는 항목입니다.");
					System.out.println("다시 입력해주세요");
					break;
					}// 사용자 switch문 종료
				}// 사용자 모드 while문 종료
				
			case 3:
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				System.out.println("이용해 주셔서 감사합니다.");
				run = false ;
				break; // 프로그램 종료

			default:
				System.out.println();
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("다시 입력해주세요");
				break;
			}// 전체 스위치문 종료

		} // 전체 while문 종료
		
	}// main 메서드종료

	static void drinkDelete(String[] drinks, int[] prices) {
		// 음료 삭제 메서드
	
		boolean delete = true;
		while(delete) {
		Scanner input = new Scanner(System.in);
		System.out.println("아래 목록 중 삭제하실 음료를 선택해주세요.");
		for(int i =0; i<drinks.length; i++) {
			System.out.println((i+1) + "번째 음료 : " + drinks[i] + ", 가격 :" + prices[i] + "원 ");
			} // 음료 목록 for문 종료
		System.out.print(">>> ");
		int num1 = input.nextInt();
		System.out.println(num1 + "번째 음료인 " + drinks[num1-1] + "을 삭제 하시겠습니까?");
		System.out.println("삭제를 원하시면 yes를 입력해주세요");
		System.out.println("이전 메뉴로 돌아가시려면 아무키나 눌러주세요");
		System.out.print(">>> ");
		String answers = input.next();
		String answer = "yes";
		if(answer.equalsIgnoreCase(answers)) {
			drinks[num1-1] = " ";
			prices[num1-1] = 0;
			System.out.println(num1 + "번째 음료가 성공적으로 삭제되었습니다.");
		}else {
			System.out.println("음료 삭제를 취소합니다.");
			System.out.println("이전 화면으로 돌아갑니다.");
			delete = false;
		}// 반복 할껀지 묻는 if-else문 종료
		
	  }// 음료삭제 while문 종료
	
	}// 음료 삭제 메서드 종료

	static void drinkList(String[] drinks, int[] prices) {
		// 음료 목록 수정 메서드
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("등록되어 있는 음료 목록입니다.");
		for(int i =0; i<drinks.length; i++) {
		System.out.println((i+1) + "번째 음료 : " + drinks[i] + ", 가격 :" + prices[i] + "원 ");
		} // 음료 목록 for문 종료
		
		boolean change = true;
		while(change) {
		System.out.println();
		System.out.println("수정할 음료 번호를 알려주세요");
		System.out.print("1~3 >>> ");
		int num = input.nextInt();
		System.out.println();
		System.out.println(num + "번째 음료 " + drinks[num-1]+"을(를) 수정합니다.");
		System.out.println("----------------------");
		System.out.println("변경될 음료명을 입력해주세요");
		System.out.print(">>> ");
		String newDrink = input.next();
		drinks[num-1] = newDrink; // 기존 음료 새로운 음료로 변경 완료
		System.out.println("변경될 음료의 가격을 입력해주세요");
		System.out.print(">>> ");
		int newPrices = input.nextInt();
		prices[num-1] = newPrices; // 기존 음료 가격 새로운 음료가격으로 변경 완료
		System.out.println("----------------------");
		System.out.println(num + "번째 음료가 " + newDrink + ", " + newPrices + "원으로 수정되었습니다.");
		System.out.println();
		System.out.println("추가 수정하시려면 yes를 입력해주세요");
		System.out.println("추가 수정을 원하시지 않으시면 아무키나 눌러주세요");
		System.out.print(">>> ");
		String answers = input.next();
		String answer = "yes";
		if(answer.equalsIgnoreCase(answers)) {
			change = true;
		}else {
			change = false;
			System.out.println("이전 메뉴로 돌아갑니다.");
		}// 반복 할껀지 묻는 if-else문 종료
		
	  }// 수정 while문
	
	}// 음료 목록 수정 보조 메서드 종료

}// class 메서드 종료
