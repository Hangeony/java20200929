package chap06.textbook.s060901;

public class Car {
	String model;  //필드 2개 메소드 2개 
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
			//필드 or 메소드
	}
	
	void run() {
		for(int i=10 ; i <=50; i +=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달림니다.(시속 :"+this.speed + "km/h)"); //this 생략되도 상관없다 .
		}
	}

}
