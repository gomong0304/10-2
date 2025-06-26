package ch05.LineageGame.DTO;

public class ElfDTO extends HumanDTO {
	// 필드
	private String bow;
	private String dress;
	private String arrow;

	// 생성자(기본 생성자...?)

	// 메서드
	// getter
	public String getBow() {
		return bow;
	}

	public String getDress() {
		return dress;
	}

	public String getArrow() {
		return arrow;
	}
	
	
	// setter
	public void setBow(String bow) {
		this.bow = bow;
	}

	public void setDress(String dress) {
		this.dress = dress;
	}

	public void setArrow(String arrow) {
		this.arrow = arrow;
	}

}
