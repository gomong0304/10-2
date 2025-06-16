package ch05.LineageGame.DTO;

public class HumanDTO {
	// 필드
	private String name;
	private String sex;
	private String level;
	private int hp;
	private int mp;
	private int money;

	// 생성자(기본 생성자를 쓸건가?)

	// 메서드
	// getter (출력용 메서드)
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getLevel() {
		return level;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getMoney() {
		return money;
	}
	
	
	// setter (입력용 메서드)
	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
