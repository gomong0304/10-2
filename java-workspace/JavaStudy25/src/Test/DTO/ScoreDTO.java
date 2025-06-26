package Test.DTO;

public class ScoreDTO {
	// 필드
	private int kor;
	private int mat;
	private int eng;
	private int total;
	private double avg;
	
	// 생성자
	public ScoreDTO(int kor, int mat, int eng) {
		// super();
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	
	public ScoreDTO() {
		super();
	}


	// 메서드
	@Override
	public String toString() {
		return "ScoreDTO [kor=" + kor + ", mat=" + mat + ", eng=" + eng + ", total=" + total + ", avg=" + avg + "]";
	}

	// getter
	public int getKor() {
		return kor;
	}


	public int getMat() {
		return mat;
	}


	public int getEng() {
		return eng;
	}


	public int getTotal() {
		total = kor + mat + eng;
		return total;
	}


	public double getAvg() {
		avg = total / 3;
		return avg;
	}

	// setter
	public void setKor(int kor) {
		this.kor = kor;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public void setTotal(int total) {
		total = kor + mat + eng;
		this.total = total;
	}


	public void setAvg(double avg) {
		avg = total / 3;
		this.avg = avg;
	}
	
	
}
