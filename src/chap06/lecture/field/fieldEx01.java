package chap06.lecture.field;

public class fieldEx01 {
	public static void main(String[] args) {
		int i;      //변수 선언 하듯이 만들면됨
		i = 3;
		
		Car c1 = new Car(); 
		c1.name = "kia";
		c1.model ="k7";
		c1.price = 500;     //값을 넣거나 꺼내올 수 있음 .
		
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		Car c2 = new Car();// 각각의 인스턴스가 만들어짐 클레스 뒤에는 '.' 을 붙힌다.
		c2.name ="ford";
		c2.price =700;
									     // 필드는 값을 초기화 하지 않아도 값이 초기화 값으로 저장되어 있음
		System.out.println(c2.name);      // 필드는 값을 각각 가지고 있다 .
		System.out.println(c2.price);
	}

}
