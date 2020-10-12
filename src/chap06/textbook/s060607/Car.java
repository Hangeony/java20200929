package chap06.textbook.s060607;

public class Car {
	String company ="현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){		
	}
	
	Car(String model){
		this(model, "은색", 250); //스트링 스트링 인티저 
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){   
		this.model = model;
		this.color = color;            
		this.maxSpeed = maxSpeed;
	}

}