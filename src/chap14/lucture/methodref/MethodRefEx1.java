package chap14.lucture.methodref;

import java.util.Random;
import java.util.function.Supplier;

class Car{
	
}

public class MethodRefEx1 {
	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		Supplier<Double> ran2 = Math::random;
		
		Random rand = new Random();
		System.out.println(rand.nextDouble()); 
		System.out.println(rand.nextInt()); //모든 숫자
		
		Supplier<Integer> nextInt = () -> rand.nextInt();
		Supplier<Integer> nextInt2 = rand::nextInt;
		
		Supplier<Car> nextCar = () -> new Car(); 
		Supplier<Car> nextCar2 = Car::new; //생성자도 줄일 수 있음 
		
	}

}
//파라미터와 리턴값이 똑같다면 
//그냥 매소드 참조 문법으로 클라스명과 매소드명을 적어주면 된다