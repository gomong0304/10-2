package ch04.MarioKart.DTO;

public class CharacterDTO {
	// 필드
	public String name; // 캐릭터명
	public double weight; // 캐릭터 무게
	public double speed; // 캐릭터 기본 속도
	public double acceleration; // 캐릭터 기본 가속도
	public double handing; // 캐릭터 핸들링
	public double friction; // 캐릭터 기본 마찰력
	
	// 생성자 -> 기본 생성자 new CharacterDTO();
	// 사용자가 임의로 생성자를 만들면 기본생성자는 자동으로 만들지 않는다.
	// 생성자 -> 객체 생성시 값을 넣으면서 생성한다.
	public CharacterDTO(String name, double weight, double speed, 
		double acceleration, double handing, double friction) {
		this.name = name;
		this.weight = weight;
		this.speed = speed;
		this.acceleration = acceleration;
		this.handing = handing;
		this.friction = friction;
		}// 생성자 this.() -> 변수 밖으로 글로벌 영역으로 나올때 사용.
	
	// 메서드
	
	
	
	
	
}
