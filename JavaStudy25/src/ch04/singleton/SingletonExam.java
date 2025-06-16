package ch04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤 객체 생성 테스트
		// Singleton obj1 = new Singleton();
		// The constructor Singleton() is not visible
		// 생성자는 있지만 private이기 때문에 생성이 안된다.
		
		Singleton obj2 = Singleton.getInstance();
		// 1개의 객체가 생성이 된다.
		Singleton obj3 = Singleton.getInstance();
		// 객체의 주소가 연결이 됨.
		
		System.out.println("obj2와 obj3이 같은가? " + (obj2 == obj3));
		
		
	}

}
