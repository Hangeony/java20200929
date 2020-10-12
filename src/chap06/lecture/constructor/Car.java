package chap06.lecture.constructor;

public class Car {
	String name;
	int price; //두개의 필드를 가지게됨
	
	// 생성자 
	//클래스명 (파라미터목록){
	// 실행코드; 
	//} 생성자는 클레스 이름이랑 똑같음 파라미터 목록 함수 {}<안에 코드 블럭
	public Car() {
		System.out.println("생성자 실행됨");
	//해야될 일이 있으면 직접 만들어서 실행시키면됨
	// 필드를 초기화하는 일을 주로함 <<
	//생성자는 파라미터를 받을수있음
		name ="kia";
		price = 500;
	}
	
	public Car(String carName) { 
		System.out.println("Srtring 받는 생성자 실행됨 ");
		System.out.println(carName); //String Car에 volvo , benz 가 넣어져서 실행됨
		name = carName; //우리가 작성한 필드
	}
	public Car(String carName, int carPrice) {
		name = carName;
		price = carPrice;
	}

}
