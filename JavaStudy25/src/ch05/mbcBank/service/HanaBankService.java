package ch05.mbcBank.service;

import java.util.Scanner;

import ch05.mbcBank.DTO.AccountDTO;

public class HanaBankService { // 여기는 메서드 위주로 생성을 한다.
	// 필드
	// 생성자
	// 메서드 (부메뉴, 계좌생성, 입금, 출금, 이체 등...)
	public void menu(Scanner inputint, Scanner inputStr, AccountDTO[] hanaBank) {
		boolean subrun = true;
		while(subrun) {
			System.out.println("-----------------------------");
			System.out.println("환영합니다. 하나은행 계좌 관리 메뉴입니다.");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.계좌개설 | 2.계좌목록 | 3.입금 | 4.출금 | 5.이체 | 6.종료");
			System.out.print("1~6 >>> ");
			String select = inputStr.next();
			System.out.println("-----------------------------");
			switch(select) {
			case "1" :
				System.out.println("하나은행 계좌 개설 메뉴입니다.");
				creatAccount(inputStr, inputint, hanaBank);
				break;
			case "2" :
				System.out.println("하나은행 계좌 목록 메뉴입니다.");
				accountList(inputStr, inputint, hanaBank);
				break;
			case "3" :
				System.out.println("하나은행 입금 메뉴입니다.");
				deposit(inputStr, inputint, hanaBank);
				break;
			case "4" :
				System.out.println("하나은행 출금 메뉴입니다.");
				withdraw(inputStr, inputint, hanaBank);
				break;
			case "5" :
				System.out.println("하나은행 이체 메뉴입니다.");
				break;
			case "6" :
				System.out.println("하나은행 메뉴를 종료합니다.");
				System.out.println("이전 메뉴로 돌아갑니다.");
				subrun = false;
				break;
			default :
				System.out.println("없는 메뉴입니다.");
				System.out.println("다시 입력해주세요.");
				break;
			}//메뉴선택 switch문 종료
		}// 메뉴선택 while문 종료
	}// 하나은행 메뉴선택 메서드 종료

	private void withdraw(Scanner inputStr, Scanner inputint, AccountDTO[] hanaBank) {
		// 출금 메서드
		System.out.println("-----출금 메뉴입니다.-----");
		System.out.println("출금 진행하실 계좌번호를 입력해주세요.");
		System.out.println(">>> ");
		String ano = inputStr.next();
		System.out.println("출금할 금액을 입력해주세요.");
		System.out.print(">>> ");
		int money = inputint.nextInt();
		AccountDTO outputAccount = findAccount(ano, hanaBank);
		if(outputAccount == null) {
			System.out.println("입력하신 계좌는 존재 하지 않습니다. ");
			return;
		}// 원하는 계좌 찾는 if문 종료
		outputAccount.setBalance(outputAccount.getBalance() - money); // 출금하고싶은 금액이 기존 금액보다 크면 안된다는 메소드를 넣고 싶다.
		if(money>outputAccount.getBalance()) {
			System.out.println("보유 금액보다 큰 금액을 인출할 수 없습니다.");
		}else {
			System.out.println(outputAccount.getOwner() + "님, " + money + "원이 정상 출금되었습니다.");
			System.out.println("잔액 : " + outputAccount.getBalance() + "원");
		}// 금액인출 if문 종료			
	}// 출금 메서드 종료

	private void deposit(Scanner inputStr, Scanner inputint, AccountDTO[] hanaBank) {
	// 입금 메서드
	System.out.println("-----입금 메뉴입니다.-----");
	System.out.println("입금할 하나은행 계좌번호를 입력해주세요.");
	System.out.print(">>> ");
	String ano = inputStr.next();
	System.out.println("입금할 금액을 알려주세요.");
	System.out.print(">>> ");
	int money = inputint.nextInt();
	AccountDTO inputAccount = findAccount(ano, hanaBank);// findAccount 메서드가 배열에서 객체를 찾아주고 리턴해줌
	if(inputAccount == null) {
		System.out.println("입력하신 계좌는 존재 하지 않습니다.");
		return;
	}
	inputAccount.setBalance(inputAccount.getBalance() + money);
	System.out.println(inputAccount.getOwner() + "님, " + money + "원이 성공적으로 입금완료 되었습니다.");
	System.out.println("잔액 : " + inputAccount.getBalance() + "원");
	
}// 입금 메서드 종료

	private AccountDTO findAccount(String ano, AccountDTO[] hanaBank) {
		// 계좌 찾는 메서드
		AccountDTO account = null;
		for(int i = 0; i<hanaBank.length; i++) {
		if(hanaBank[i] != null) {
			String dbAno = hanaBank[i].getAno();
			if(dbAno.equals(ano)) {
				account = hanaBank[i];
				break;
			}// 번호 같은지 판단 if문 종료
			}// 빈객체가 아닌지 판단 if문 종료
		}// for문 종료
		return account;
	}// 계좌 찾기 메서드 종료

	private void accountList(Scanner inputStr, Scanner inputint, AccountDTO[] hanaBank) {
	// 하나은행 배열에 있는 계좌의 목록보기
	System.out.println("------하나은행 계좌 목록입니다.------");
	for(int i = 0; i< hanaBank.length; i++) {
		AccountDTO accountList = hanaBank[i];
		if(accountList != null) {
			System.out.print(accountList.getAno());
			System.out.print("\t");
		
			System.out.print(accountList.getOwner());
			System.out.print("\t");
			
			System.out.print(accountList.getBalance());
			System.out.print("\t\n");
			System.out.println("----------------------------------");
		}
	}//  계좌 목록 for문 종료	
}// 계좌 목록 보기 종료

	private void creatAccount(Scanner inputStr, Scanner inputint, AccountDTO[] hanaBank) {
	// 하나은행 배열에 새로운 객체를 넣자.-> 변수를 만들어서 넣거나 객체를 만들어서 넣거나...?
	System.out.println("------계좌를 생성합니다.------");
	AccountDTO myAccount = new AccountDTO(); // AccountDTO 클래스에 myAccount변수라는 빈객체를 생성했음.
	System.out.print("계좌 생성 >>> ");
	myAccount.setAno(inputStr.next());
	
	System.out.print("계좌주 >>> ");
	myAccount.setOwner(inputStr.next());
	
	System.out.print("초기 입금액 >>> ");
	myAccount.setBalance(inputint.nextInt());
	
	myAccount.setBankName("하나"); // 초기에 아예 지정해버림.
	
	for(int i = 0; i < hanaBank.length; i++) {
		if(hanaBank[i] == null) {
			hanaBank[i] = myAccount;
			// System.out.println("계좌입력 완료 테스트 : " + hanaBank[i]);
			break; // 빈곳에 넣고 멈춘다. 아하~
		}
	}// 하나뱅크 계좌 빈곳에 myAccount 객체를 넣는다.
	System.out.println("계좌가 정상적으로 생성되었습니다.");
		
}// 계좌 개설 메서드 종료
}// class 종료
