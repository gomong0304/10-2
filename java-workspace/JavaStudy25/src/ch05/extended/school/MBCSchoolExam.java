package ch05.extended.school;

import java.util.Scanner;

public class MBCSchoolExam {
	// 필드
	
	// 생성자
	
	// 메인 메서드
	public static void main(String[] args) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputint = new Scanner(System.in);
		
		// 선생님 테스트
		Teacher teacher = new Teacher();
		// 선생님 부모 객체
		System.out.print("선생님 이름 >>> ");
		teacher.setName(inputStr.next());
		
		System.out.print("선생님 키 >>> ");
		teacher.setHeight(inputint.nextInt());
		
		System.out.print("선생님 몸무게 >>> ");
		teacher.setWeight(inputint.nextInt());
		
		System.out.print("선생님 나이 >>> ");
		teacher.setAge(inputint.nextInt());
		
		// 선생님 자식 객체
		System.out.print("선생님 교직원 번호 >>> ");
		teacher.setTeacherID(inputStr.next());
		
		System.out.print("선생님 담당 학년 >>> ");
		teacher.setGrade(inputint.nextInt());
		
		System.out.print("선생님 담당 교실 >>> ");
		teacher.setRoom(inputint.nextInt());
		
		System.out.print("선생님 담당 학생수 >>> ");
		teacher.setStCount(inputint.nextInt());
		
		System.out.println("입력하신 선생님의 정보 : " + teacher);
		System.out.println("================================");
		
		// 학생 테스트
		// 학생 부모 객체
		System.out.print("학생 이름 >>> ");
		String name = inputStr.next();
		
		System.out.print("학생 키 >>> ");
		int height = inputint.nextInt();
		
		System.out.print("학생 몸무게 >>> ");
		int weight = inputint.nextInt();
		
		System.out.print("학생 나이 >>> ");
		int age = inputint.nextInt();
		
		// 학생 자식 객체
		System.out.print("학생 학번 >>> ");
		String studentID = inputStr.next();
		
		System.out.print("학생 학년 >>> ");
		int grade = inputint.nextInt();
		
		System.out.print("학생 학점 >>> ");
		int gpa = inputint.nextInt();
		
		Student student = new Student(name, height, weight, age, studentID, grade, gpa);
		// 생성자를 통해서 값을 넣음
		
		student.show();
	}// main 메서드 종료

}// class 종료
