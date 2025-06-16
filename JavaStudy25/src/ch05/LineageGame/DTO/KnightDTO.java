package ch05.LineageGame.DTO;

public class KnightDTO extends HumanDTO {
	// 필드
	private String sword;  // 칼
	private String armor;  // 갑옷
	private String shield; // 방패

	// 생성자 (기본 생성자..?)

	// 메서드
	// getter
	public String getSword() {
		return sword;
	}

	public String getArmor() {
		return armor;
	}

	public String getShield() {
		return shield;
	}

	// setter
	public void setSword(String sword) {
		this.sword = sword;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

}
