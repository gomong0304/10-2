package ch05.LineageGame;

public class Account {
	// 필드
	private String id;
	private String pw;
	private String nickName;
	
	
	// 생성자 (생성안하면 기본적으로 기본생성자 생성됨)
	
	// 메서드
	// getter
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickName() {
		return nickName;
	}
	
	// setter
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", pw=" + pw + ", nickName=" + nickName + "]";
	}
	
	
	
}
