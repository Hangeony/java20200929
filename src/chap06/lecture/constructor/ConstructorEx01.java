package chap06.lecture.constructor;

public class ConstructorEx01 {
	public static void main(String[] args) {
		Car car1 = new Car();  // 인스턴스가 생성될 때 new Car(); < 
		Car car2 = new Car();  // 두개의 코드로 되어있음 new / Car(); new = 연산자 Car();< 생산자 , 새로운 인스턴스가 생성되고 실행됨
							// 그다음으로 실행되는것이 = <가 실행됨 
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		
		Car car3 = new Car("volvo");
		Car car4 = new Car("benz");
		
		System.out.println(car3.name);  
		System.out.println(car4.name);
		
		System.out.println(car3.price); //class 를 안넣어서 여전히 0으로 가지고있음
		System.out.println(car4.price);
		
		Car car5 = new Car("hyundai", 700); //파라미터의 갯수와 내용을 보고 판단해서 넣어줌
		System.out.println(car5.name);
		System.out.println(car5.price);
		
		Car car6 = new Car("samsung",600);
		System.out.println(car6.name);
		System.out.println(car6.price);
	}

}
