package mbcboard.DTO;

import java.sql.Date;
import java.util.Objects;

public class MemberDTO {
	// 회원용 객체를 담당
	// 필드
	private int mno;
	private String bwriter;
	private String id;
	private String pw;
	private Date regidate;
	
	// 생성자
	
	// 메서드
	// 게터	
	public int getMno() {
		return mno;
	}
	public String getBwriter() {
		return bwriter;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public Date getRegidate() {
		return regidate;
	}
	
	// 세터
	public void setMno(int mno) {
		this.mno = mno;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		return Objects.equals(id, other.id);
	}
}
