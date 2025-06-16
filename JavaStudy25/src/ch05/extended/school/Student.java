package ch05.extended.school;

public class Student extends Person{
	// Person 객체의 자식 클래스
	// Student 객체를 생성하면 Person 객체부터 생성하고 Student가 나중에 생성됨
	
	// 부모 클래스 외적으로 추가된 필드
	private String studentID; // 학번
	private int grade; // 학년
	private int gpa; // 학점
	
	
	// 커스텀생성자 부모 생성자 + 자식 생성자
	public Student(String name, int height, int weight, int age, String studentID, int grade, int gpa) {
		super(name, height, weight, age);
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}

	// 자식 기본 생성자 + 부모 생성자
	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
	}
	// 자식 기본 생성자
	public Student() {
		super();
	}

	
	// 메서드
	// getter
	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}

	// setter
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	// 추가 메서드
	public void show() { // student 클래스에 show라는 메서드
		// 입력된 필드를 출력하는 메서드
		System.out.println("------부모 필드값------");
		System.out.print("학생 이름 : " + getName() + "\t");
		System.out.print("학생 나이 : " + getAge() + "\t");
		System.out.print("학생 키 : " + getHeight() + "\t");
		System.out.print("학생 몸무게 : " + getWeight()+ "\n");
		System.out.println("------자식 필드값------");
		System.out.print("학생 학번 : " + getStudentID() + "\t");
		System.out.print("학생 학년 : " + getGrade() + "\t");
		System.out.print("학생 학점 : " + getGpa() + "\t");
	}	
}
