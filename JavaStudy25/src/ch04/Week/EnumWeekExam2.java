package ch04.Week;

import java.util.Calendar; // 자바에 내장되어있는 클래스를 활용한다.

public class EnumWeekExam2 {

	public static void main(String[] args) {
		// enum 활용2
		
		Week today = null; // week 타입에 today 변수를 선언하고 연결은 나중에 하겠음
		
		Calendar cal = Calendar.getInstance(); // 캘린더 인스턴스를 생성한다.
		int year = cal.get(Calendar.YEAR); // 년도를 가져온다
		int month = cal.get(Calendar.MONTH)+1; // 월을 가져온다. 특이하게 월만 0부터 시작이라 +1을 해준다
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일을 숫자로 출력한다. 일요일이 1부터 시작~ 토요일 7
		int day = cal.get(Calendar.DATE); // 날짜
		int week2 = cal.get(Calendar.WEEK_OF_MONTH); // 몇째주
		
		System.out.println(year + " " + month + " " + week + " " + day);
		System.out.println(week2);
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY; break;
		case 2 :
			today = Week.MONDAY; break;
		case 3 :
			today = Week.TUESDAY; break;
		case 4 :
			today = Week.WEDNESDAY; break;
		case 5 :
			today = Week.THURSDAY; break;
		case 6 :
			today = Week.FRIDAY; break;
		case 7 :
			today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일입니다. 집에서 쉽니다");
		}else if(today == Week.MONDAY) {
			System.out.println("월요일입니다. 학원와서 공부하고 끝나면 운동갔다가 집가서 쉽니다.");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일입니다. 학원와서 공부하고 끝나면 운동갔다가 집가서 쉽니다.");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("수요일입니다. 학원와서 공부하고 끝나면 운동갔다가 집가서 쉽니다.");
		}else if(today == Week.THURSDAY) {
			System.out.println("목요일입니다. 학원와서 공부하고 끝나면 운동갔다가 집가서 쉽니다.");
		}else if(today == Week.FRIDAY) {
			System.out.println("금요일입니다. 학원와서 공부하고 끝나면 운동갔다가 집가서 쉽니다.");
		}else if(today == Week.SATURDAY) {
			System.out.println("토요일입니다. 선우랑 놉니다.");
		}

	}// main 메서드 종료

}// class 종료
