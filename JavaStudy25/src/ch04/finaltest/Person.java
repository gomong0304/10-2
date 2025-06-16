package ch04.finaltest;

public class Person {
	// 필드 final을 붙이면 초기값 = 최종값
	
	public final String nation = "Korea";
	public final String ssn; // 초기값 없음
	public String name;
	
	// 생성자
	public Person() {
		ssn = null;
	}
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	// 메서드
}
