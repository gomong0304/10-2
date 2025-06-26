package ch05.getter_setter;

public class Car2 {
	// 개인적인 필드
	private int speed;
	private boolean stop;
	
	// 공용메서드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		} // 스피드 값이 음수값이 되면 0을 입력
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}// stop 값이 true 이면 스톱을 진행하고 스피드를 0으로 조절
	
	//공용 메서드
	
}
