package ch05.mbcBank;

import java.util.Scanner;

import ch05.mbcBank.DTO.AccountDTO;
import ch05.mbcBank.service.HanaBankService;

public class BankExam {
	// 필드
	static AccountDTO[] hanaBank = new AccountDTO[4];
	static AccountDTO[] sinBank = new AccountDTO[2];
	static AccountDTO[] tossBank = new AccountDTO[2];
	static AccountDTO session = null; // 로그인했으면 저장하는 객체 생성
	static Scanner inputStr = new Scanner(System.in);
	static Scanner inputint = new Scanner(System.in);
	
	// 생성자 -> 정적 블럭 사용 (메인메서드 초기화 값)
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234567","박희진","하나",1500000);
		hanaBank[0] = accountDTO0;
		
		AccountDTO accountDTO1 = new AccountDTO("7654321","지선우","신한",1500000);
		sinBank[0] = accountDTO1;
		
		AccountDTO accountDTO2 = new AccountDTO("9876543","김시찬","토스",1500000);
		tossBank[0] = accountDTO2;
	}
	
	// 메인 메서드
	public static void main(String[] args) {
		// 은행 3개를 만들고 그안에 계좌도 만들어서 관리하는 프로그래밍
		// 테스트 코드 작성
		/*
		 * System.out.println("하나은행 더미데이터 출력 데스트 : " + hanaBank[0]);
		 * System.out.println("신한은행 더미데이터 출력 데스트 : " + sinBank[0]);
		 * System.out.println("토스뱅크 더미데이터 출력 데스트 : " + tossBank[0]);
		 */
		
		boolean run = true;
		while(run) {
			System.out.println("=======================");
			System.out.println("은행 시스템에 오신걸 환영합니다.");
			System.out.println("=======================");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1.하나은행 | 2.신한은행 | 3.토스뱅크 | 4.프로그램 종료");
			System.out.print("1~4 선택 >>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" :
				System.out.println("하나은행으로 진입합니다.");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "2" :
				System.out.println("신한은행으로 진입합니다.");
				break;
			case "3" :
				System.out.println("토스뱅크로 진입합니다.");
				break;
			case "4" :
				System.out.println("프로그램을 종료합니다.");
				System.out.println("이용해주셔서 감사합니다.");
				run = false;
				break;
			default : 
				System.out.println("존재하지 않는 메뉴입니다.");
				System.out.println("1~4까자만 입력해주세요.");
				break;
			}// 주메뉴 switch문 종료
				
		}// 주메뉴 while문 종료

	}// main 메서드 종료
}// class 종료
