package chap06.method.overloding;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method1(3);
		o1.method1(3.14);
	}

}