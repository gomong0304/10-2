package ch05.getter_setter;

public class Car {
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setSpeed (int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	private boolean stop;
	
	//Getter
	public boolean isStop() {
		return stop;
	}
	
	//Setter
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
