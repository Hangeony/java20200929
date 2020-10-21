package chap06.textbook.s060803;

public class Car {
	int speed;
	int downSpeed;
	
	int getSpeed() {
		return speed;
	}
	int getDownSpeed() {
		return downSpeed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌림니다.");
	}
	void run() {
		for(int i = 0 ; i <=50; i +=10) {
			speed = i;
			System.out.println("달림니다 (시속:" + speed +"km/h)");
		}
	}
	void down() {
		for(int i = 50 ; i >= 0; i -=10) {
			downSpeed = i;
			System.out.println("감속함니다. (시속:" + downSpeed +"km/h)");
		}
	}
	
	void keyTurnOff() {
		System.out.println("시동을 끔니다.");
	}
	

}
