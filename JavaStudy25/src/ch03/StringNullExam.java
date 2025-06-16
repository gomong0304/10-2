package ch03;

public class StringNullExam {

	public static void main(String[] args) {
		String name = "박희진";
		String hobby = "컴퓨터 게임";
		
		System.out.println("박희진의 총 문자수 : " + name.length());
		System.out.println("컴퓨터 게임의 총 문자수 : " + hobby.length());
		
		String StrVar1 ="박희진";
		String StrVar2 ="박희진";
		String StrVar3 = new String("박희진");
		
		if(StrVar1==StrVar2) {
			System.out.println("StrVar1와 StrVar2의 참조는 같습니다.");
		}else {
			System.out.println("StrVar1와 StrVar2의 참조는 다릅니다.");
		}
		
		if(StrVar1.equals(StrVar2)) {
			System.out.println("StrVar1와 StrVar2의 문자열은 같습니다.");
		}else {
			System.out.println("StrVar1와 StrVar2의 문자열은 다릅니다.");
		}
		
		if(StrVar1==StrVar3) {
			System.out.println("StrVar1와 StrVar2의 참조는 같습니다.");
		}else {
			System.out.println("StrVar1와 StrVar2의 참조는 다릅니다.");
		}
		
		if(StrVar1.equals(StrVar3)) {
			System.out.println("StrVar1와 StrVar2의 문자열은 같습니다.");
		}else {
			System.out.println("StrVar1와 StrVar2의 문자열은 다릅니다.");
		}
		
		
		
		
		
	}
	

}
