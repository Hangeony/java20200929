package chap06.textbook.s060704;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){                               //생성자를 사용할 때 적절하게 잘 선택하게 해둠
		
	}
	
	Car(String model){
		this.model = model;             //인스턴스를 관련된 필드 , 매소드에서 쓸수 있음
	}
	Car(String model, String color){
		this.model = model; 
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
