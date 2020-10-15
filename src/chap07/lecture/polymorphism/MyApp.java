package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindaCat k1 = t1;
//		t1 = k1  반대로 는 안됨
		k1.cry();
		
		
		Cat c1 = new Cat();
		c1.cry();
		KindaCat k2 = c1;
		k2.cry();
//		c1 = k2  반대로는 안됨
		
//		c1 = t1; 할당 할 수가 없음
//		t1 = c1
	}

}
