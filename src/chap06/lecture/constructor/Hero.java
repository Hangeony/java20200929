package chap06.lecture.constructor;

public class Hero {
	String name;
	int power;

	public Hero(String name, int power) {
		this.name = name;  //적절한 이름이 필드이름이랑 똑같음 파라미터 네임을 가르킴 
		this.power = power;  //this 생성자로 인스턴스를 대체하는 키워드를 가짐
	}
	public Hero(String name) { 
		this.name = name;
		this.power = 100;   //power의 초기값을 100으로 지정 
	}
//	public Hero(String name) {
//		this(name, 100); // 두개의 값이 동일할 때 줄여 쓰는법
//	}
}
