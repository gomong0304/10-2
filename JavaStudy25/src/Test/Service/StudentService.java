package Test.Service;

import java.util.Scanner;

import Test.DTO.StudentDTO;

public class StudentService {
	// 학생 메뉴 진입했을때 사용할 보조메뉴
	// 필드
	
	// 생성자
	
	// 메서드
	public void menu(Scanner inputStr, Scanner inputint, StudentDTO[] students) {
		boolean subrun = true;
		while(subrun) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1.학생등록 | 2.학생목록 | 3.학생수정 | 4.메인메뉴");
			System.out.print("1~4 >>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" :
				System.out.println("학생 등록 메뉴입니다.");
				regStudent(inputStr, inputint, students);
				break;
			case "2" :
				System.out.println("학생 목록 메뉴입니다.");
				for(int i =0; i<students.length; i++) {
					if(students[i] != null) {
						System.out.print("이름 : " + students[i].getName() + "\t");
						System.out.print("학번 : " + students[i].getStudentID() + "\t");
						System.out.print("학년 : " + students[i].getGrade() + "\t");
						System.out.print("반 : " + students[i].getRoom() + "\n");
					}// if문 종료
				}// for문 종료
				break;
			case "3" :
				System.out.println("학생 수정 메뉴입니다.");
				stCorrection(inputStr, inputint, students);
				break;
			case "4" :
				System.out.println("메인 메뉴로 돌아갑니다.");
				subrun = false;
				break;
			default :
				System.out.println("없는 메뉴입니다. 다시 선택해주세요");
				break;
			}// 보조 메뉴 switch문 종료
		}// 보조 메뉴 while문 종료
	}

	public void stCorrection(Scanner inputStr, Scanner inputint, StudentDTO[] students) {
		// 학생 수정 메뉴
		System.out.print("수정을 원하시는 학생의 이름을 입력해주세요 : ");
		String name = inputStr.next();
		int i = 0;
		for(i =0; i<students.length; i++) {
			if (students[i] == null) continue;
			else if(students[i].getName().equals(name)) {
				System.out.println(students[i].getName() + "학생의 정보를 수정합니다.");
				System.out.println("------------------------------------");
				System.out.println(students[i].getName() + "학생의 저장 되어있던 정보 목록");
				System.out.println("이름 : " + students[i].getName());
				System.out.println("학번 : " + students[i].getStudentID());
				System.out.println("학년 : " + students[i].getGrade());
				System.out.println("반  : " + students[i].getRoom());
				System.out.println("------------------------------------");
				System.out.println("수정하실 정보를 입력해주세요.");
				System.out.print("이름 : ");
				students[i].setName(inputStr.next());
				System.out.print("학번 : ");
				students[i].setStudentID(inputint.nextInt());
				
				System.out.print("학년 : ");
				students[i].setGrade(inputint.nextInt());
				
				System.out.print("반 : ");
				students[i].setRoom(inputint.nextInt());
				System.out.println("---------------------------");
				System.out.println("학생 정보 수정이 완료되었습니다.");
				System.out.println(students[i].getName() + "학생의 수정 후 정보 : ");
				System.out.println("이름 : " + students[i].getName());
				System.out.println("학번 : " + students[i].getStudentID());
				System.out.println("학년 : " + students[i].getGrade());
				System.out.println("반  : " + students[i].getRoom());
				break;
				}
		}// for문 종료
		if (i == students.length) {
			System.out.println("존재하지 않는 학생입니다.");
		}
	}// 학생 수정 메뉴 종료

	public StudentDTO[] regStudent(Scanner inputStr, Scanner inputint, StudentDTO[] students) {
		
		StudentDTO regStudent = new StudentDTO();
		
		System.out.print("등록하실 학생의 이름을 입력해주세요 : ");
		regStudent.setName(inputStr.next()); 
		
		System.out.print("등록하실 학생의 학번을 입력해주세요 : ");
		regStudent.setStudentID(inputint.nextInt());
		
		System.out.print("등록하실 학생의 학년을 입력해주세요 : ");
		regStudent.setGrade(inputint.nextInt());
		
		System.out.print("등록하실 학생의 반을 입력해주세요 : ");
		regStudent.setRoom(inputint.nextInt());
		
		for(int i = 0; i< students.length; i++) {
			if(students[i] == null) {
				students[i] = regStudent;
				break;
			}//if문 종료
		}// for문 종료
		return students;
	}// 학생 등록 메뉴 종료
}
