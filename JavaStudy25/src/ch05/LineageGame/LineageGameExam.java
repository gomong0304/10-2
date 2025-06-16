package ch05.LineageGame;

import java.util.Scanner;

import ch05.LineageGame.DTO.ElfDTO;
import ch05.LineageGame.DTO.KnightDTO;
import ch05.mbcBank.DTO.AccountDTO;

public class LineageGameExam {
	// PPT 318~ 리니지 게임을 만들어보자...
	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputint = new Scanner(System.in);
	public static Account[] accounts = new Account[10];
	public static Account LoginAccount; // 로그인 성공시 객체 (섹션 역할)
	public static KnightDTO knightdto = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	static { // 더미네티어로써 임시로 지정해 놓은 값
		// 기사 자식 클래스
		knightdto.setSword("양손검");
		knightdto.setArmor("튼튼한값옷");
		knightdto.setShield("튼튼한방패");
		// 기사 부모 클래스
		knightdto.setName("콧고몽");
		knightdto.setSex("남성");
		knightdto.setLevel("50");
		knightdto.setHp(100);
		knightdto.setMp(100);
		knightdto.setMoney(0);
		
		// 엘프 자식 클래스
		elfDTO.setBow("목재 활");
		elfDTO.setDress("튼튼한 옷");
		elfDTO.setArrow("목재 화살");
		// 엘프 부모 클래스
		elfDTO.setName("돔도빗");
		elfDTO.setSex("여성");
		elfDTO.setLevel("50");
		elfDTO.setHp(100);
		elfDTO.setMp(100);
		elfDTO.setMoney(0);
		
		Account account = new Account(); // 테스트용 계정
		account.setId("phj");
		account.setPw("970702");
		account.setNickName("콧고몽");
		
		accounts[0] = account; // 배열 0 번에 테스트용 계정을 넣음
	}
	// 생성자
	
	// 메서드
	public static void main(String[] args) {
	

	}// main 메서드 종료

}// class 종료
