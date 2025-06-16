package ch04;

public enum Ranking {
	// ranking enum을 만들어보자
	// 열거 타입은 자동으로 숫자 판단이 가능하다.
	// 열거 타입에 선언된 상수는 대문자로 사용한다.(여러문자인 경우 _으로 구분한다.)
	
	GUEST,     // 0 손님
	MEMBER,    // 1 회원
	MANAGER,   // 2 관리자
	ADMIN	   // 3 최고관리자
	
}
