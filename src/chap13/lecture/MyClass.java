package chap13.lecture;

public class MyClass<T> {
	public void method1() {
		System.out.println("메소드 1");
	}
	
	public void method2(T s) {
		System.out.println(s);
	}

}

//제네릭 타입 타입 파라미터 안에서 실제 존재하는 것처럼 사용 할수 있고  실제로 사용할떄 결정된다.
