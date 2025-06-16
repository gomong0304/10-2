package ch03;

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용해서 성적표를 만들어보자
		// 학생수를 파악
		// 점수를 입력
		// 총점과 평균을 구하여 출력
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("====성적표====");
		System.out.println("학생수를 입력하세요.");
		System.out.print(">>> ");
		int count = input.nextInt(); // 학생수를 키보드로 입력받음
		
		int[] scores = new int[count]; // int 타입 배열 변수 scores에 int[count]라는 배열 길이로 생성
		System.out.println("배열의 길이 : " + scores.length); // 인덱스 번호로 0~9까지 10개의 배열이 생성됨
		System.out.println();
		
		for(int i = 0; i<scores.length; i++) { // 정수타입 변수 i가 0부터 배열의 길이 10까지 더해짐 
		System.out.println((i+1) + "번째 학생의 점수를 입력하세요.");
		System.out.print(">>> ");
		scores[i] = input.nextInt(); // i번째에 키보드로 입력받은 점수가 들어간다. 0~9까지 반복
		} // 점수입력 for문 종료
		
		System.out.println("=====점수 확인=====");
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}// 점수확인 for문 종료
		
		System.out.println();
		System.out.println("====점수 수정====");
		System.out.print("몇번째 점수를 수정할껀지 입력 >>> ");
		int select = input.nextInt(); // 몇번째 점수를 수정할꺼냐? select번째
		System.out.print("수정할 점수 입력 >>> ");
		int score = input.nextInt(); // 수정할 점수를 입력해라 score 점수로 수정
		
		scores[select-1] = score; // scores 배열에서 select-1번째 있는 점수를 score로 수정한다.
		
		System.out.println("점수 수정 확인");
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}// 수정한 점수 확인용
		
		
		System.out.println("================================");
		System.out.println("====총점 확인====");
		int sum = total(scores);
		System.out.println(count + "명의 총점은 : " + sum);// 총점 for문 종료
		
		double avg = average(sum,count);
		System.out.println("평균은 : " + avg);
		
		
	}// main 메서드 종료

	static double average(int sum, int count) {
		// 평균 구하는 용도
		
		double avg = 0;
		avg = sum/count;
		return avg;
	}

	static int total(int[] scores) {
		// 총점 구하는 용도
		
		int sum = 0; // 정수 타입 sum 변수 초기 값 0
		for(int i = 0; i<scores.length; i++) {
			sum+=scores[i] ; // scores의 모든 값을 sum에 누적시킴
		}
		return sum;
	}

}// class 종료
