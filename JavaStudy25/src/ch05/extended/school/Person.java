package ch05.extended.school;

public class Person {
	// 필드
	// 부모 클래스로 자식이 상속 받을 예정
	private String name; // 이름
	private int height;  // 키
	private int weight;  // 몸무게
	private int age;     // 나이

	// 커스텀생성자
	public Person(String name, int height, int weight, int age) {
		// super(); 자바의 최상위 부모객체
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	// 기본 생성자
	public Person() {
		// super();
	}
	
	
	// 메서드(private로 설정했기 때문에 getter setter 사용)
	// getter
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// 주소가 아닌 객체가 나올수있게끔 테스트 하는 소스
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", age=" + age + "]";
	}
		
}
