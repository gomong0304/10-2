package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		// 필드에 final을 붙인 객체를 사용해보자
		Person person = new Person("970702-2222222", "박희진");
		// 새로운 값을 밀어넣음
		
		System.out.println("국가명 : " + person.nation);
		System.out.println("주민번호 : " + person.ssn);
		System.out.println("이름 : " + person.name);
		
		// person.nation = "usa"; // final로 지정해 뒀기 때문에 값이 변하지 않는다.
		// person.ssn = "970721-1222222"; // final로 지정해 뒀기 때문에 값이 변하지 않는다.
		person.name = "지선우";
		
		System.out.println("국가명 : " + person.nation);
		System.out.println("주민번호 : " + person.ssn);
		System.out.println("이름 : " + person.name);
		
		// 생성자
		
		
		// 메서드

	}

}
