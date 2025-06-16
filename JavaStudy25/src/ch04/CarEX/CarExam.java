package ch04.CarEX;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// car 주행 메인 메서드
		
		Scanner input = new Scanner(System.in);
		Car myCar = new Car(); // 새로운 객체 생성
		CarLogin member = new CarLogin();
		
		
		System.out.println("안녕하세요 차량 주행 프로그램입니다.");
		System.out.println("회원가입이 필요합니다.");
		System.out.println();
		System.out.println("====회원 가입====");
		member = member.login(input);
		System.out.println("==================================");
		
		boolean join = true;
		while(join) {
		System.out.println();
		System.out.println("====로그인====");
		System.out.println("id를 입력해주세요");
		System.out.print(">>> ");
		String id = input.next();
		System.out.println("pw를 입력해주세요");
		System.out.print(">>> ");
		String pw = input.next();
		if((member.id.equals(id)) && (member.pw.equals(pw))) {
			System.out.println("id와 pw가 일치합니다.");
			System.out.println("로그인에 성공하였습니다.");
			break;
		} else {
			System.out.println("id나 pw가 일치하지 않습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}// 로그인 검증 if-else 문 종료
		}// 회원가입 while문 종료
		
		System.out.println("================================");
		System.out.println("생성하실 차량 번호를 입력해주세요.");
		System.out.print(">>> ");
		myCar.number = input.next();
		System.out.println("생성하실 차량의 회사를 입력해주세요.");
		System.out.print(">>> ");
		myCar.company = input.next();
		System.out.println("생성하실 차량 색상을 입력해주세요.");
		System.out.print(">>> ");
		myCar.color = input.next();
		System.out.println();
		System.out.println("차량이 생성되었습니다.");
		
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("========================");
			System.out.println("1. 차량 정보 확인");
			System.out.println("2. 차량 시동 걸기");
			System.out.println("3. 차량 주행 시작");
			System.out.println("4. 차량 주행 종료");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>> ");
			String select = input.next(); // 원하는 메뉴 받음
			
			switch(select) {
			case "1" :
				System.out.println("등록된 차량 정보 확인 메뉴입니다.");
				System.out.print("차량 번호 : " + myCar.number + " ");
				System.out.print("차량 회사 : " + myCar.company + " ");
				System.out.print("차량 색상 : " + myCar.color + " ");
				System.out.println();
				System.out.println("이전메뉴로 돌아갑니다.");
				break;
				
			case "2" :
				System.out.println("차량에 시동을 겁니다.");
				System.out.println(CarDriveMode.DRIVE + "상태로 전환합니다.");
				myCar.start();
				break;	
				
			case "3" :
				System.out.println( myCar.number + "차량이 주행을 시작합니다.");
				drive(myCar.number, myCar.maxSpeed, myCar.minSpeed, myCar.speed, myCar.oil);
				break;
				
			case "4" :
				System.out.println("주행을 종료합니다.");
				System.out.println(CarDriveMode.STOP + "상태로 전환합니다.");
				break;	
			
			case "9" :
				System.out.println("프로그램을 종료합니다.");
				System.out.println(CarDriveMode.PARK + "상태로 전환합니다.");
				run = false;
				break;
				
			default : 
				System.out.println("잘못누르셨습니다.");
				System.out.println("다시 입력해주세요.");
				break;
			}// 메뉴 switch문 종료
		}// while문 종료
		
	}// main 메서드 종료

	static void drive(String number, int maxSpeed, int minSpeed, int speed, int oil) {
		// 차량 주행 보조 메서드
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("현재 차량의 상태입니다.");
		System.out.println("속도 : " + speed);
		System.out.println("주유량 : " + oil);
		
		boolean drive = true;
		while(drive) {
			System.out.println("--------------------------");
			System.out.println("1. 엑셀 | 2. 브레이크 | 3.정지");
			System.out.println("--------------------------");
			System.out.print("숫자만 >>> ");
			int mode = input.nextInt();
			
			switch(mode) {
			case 1 :
				System.out.println("속도를 올립니다.");
				speed+=50;
				oil-=10;
				if(speed >= maxSpeed) {
					speed=maxSpeed;
				}// 속도 올리는 if문 종료
				if(oil == 0) {
					System.out.println();
					System.out.println("앗!!!!!!! oil이 없습니다. 주유해주세요.");
					System.out.println("차량이 " + CarDriveMode.STOP + " 모드로 전환됩니다.");
					break;
					}// oil이 없을때 if문 종료
				System.out.println("현재 속도 : " + speed + "km/h");
				System.out.println("남은 oil의 양 : " + oil + "L");
				break;
			case 2 :
				System.out.println("속도를 감속합니다.");
				speed-=30;
				oil-=10;
				if(speed <= minSpeed) {
					speed=minSpeed;
				}
				if(oil == 0) {
					System.out.println();
					System.out.println("앗!!!!!!! oil이 없습니다. 주유해주세요.");
					System.out.println("차량이 " + CarDriveMode.STOP + " 모드로 전환됩니다.");
					break;
					}// oil이 없을때 if문 종료
				System.out.println("현재 속도 : " + speed + "km/h");
				System.out.println("남은 oil의 양 : " + oil + "L");
				break;	
			case 3 :
				System.out.println("차량을 정지합니다.");
				System.out.println(CarDriveMode.PARK + "상태로 전환합니다.");
				speed=minSpeed;
				break;
			default : 
				System.out.println("잘못입력하셨습니다.");
				System.out.println("차량이 자동 정지 됩니다.");
				System.out.println(CarDriveMode.STOP + "상태로 전환합니다.");
				speed=minSpeed;
				drive = false;
				break;
			}// 모드선택 스위치문 종료
			
		}// 주행 while문 종료
			
	}// 차량 주행 보조 메서드 종료

}// class 종료
