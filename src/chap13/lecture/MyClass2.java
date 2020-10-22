package chap13.lecture;

public class MyClass2 <T extends Number> {
	
	void method(T t) {
		System.out.println(t.doubleValue());
	}

}
