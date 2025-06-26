package ch05.extended.school;

public class Teacher extends Person {
	// 필드
	private String teacherID;
	private int grade;
	private int room;
	private int stCount;
	
	
	// 기본 생성자
	public Teacher() {
		super();
	}

	// 메서드
	// getter
	public String getTeacherID() {
		return teacherID;
	}


	public int getGrade() {
		return grade;
	}


	public int getRoom() {
		return room;
	}


	public int getStCount() {
		return stCount;
	}

	
	// setter
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public void setStCount(int stCount) {
		this.stCount = stCount;
	}

	@Override
	public String toString() {
		return "Teacher [getTeacherID()=" + getTeacherID() + ", getGrade()=" + getGrade() + ", getRoom()=" + getRoom()
				+ ", getStCount()=" + getStCount() + ", getName()=" + getName() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAge()=" + getAge() + "]";
	}

	


}
