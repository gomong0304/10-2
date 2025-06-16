package ch05.getter_setter;

public class setter {
	private int speed;
	
	void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
}
