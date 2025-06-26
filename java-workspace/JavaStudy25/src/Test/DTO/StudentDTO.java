package Test.DTO;

public class StudentDTO {
	// 필드
	private String name; 	// 이름
	private int studentID;  // 학번
	private int grade; 		// 학년
	private int room;		// 반
	
	// 커스텀생성자
	public StudentDTO(String name, int studentID, int grade, int room) {
		// super();
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.room = room;	
	}

	// 기본생성자
	public StudentDTO() {
		// super();
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", studentID=" + studentID + ", grade=" + grade + ", room=" + room + "]";
	}

	// 메서드
	// getter
	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	// getter
	public void setName(String name) {
		this.name = name;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	
	
}
