package ch05.mbcBank.DTO;

public class AccountDTO {
	// 필드
	private String ano; // 계좌번호
	private String owner;
	private String bankName;
	private int balance;
	
	// 커스텀생성자
	public AccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankName = bankName;
		this.balance = balance;		
	}// 4개의 입력을 받는 생성자, 모든 필드를 사용한 생성자
	
	// 기본생성자
	public AccountDTO() {
	
	}
	
	// 메서드 (private여서 getter setter를 사용함)
	// getter
	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public String getBankName() {
		return bankName;
	}

	public int getBalance() {
		return balance;
	}
	
	
	// setter
	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 테스트용으로 사용함
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", bankName=" + bankName + ", balance=" + balance + "]";
	}
	
	
}// class 종료
