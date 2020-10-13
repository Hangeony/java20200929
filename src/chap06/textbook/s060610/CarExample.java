package chap06.textbook.s060610;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : "+ speed +"km/h");
		myCar.down();
		speed = myCar.getDownSpeed();
		System.out.println("현재속도 : "+ speed +"km/h");
		myCar.keyTurnOff();
	}

}
