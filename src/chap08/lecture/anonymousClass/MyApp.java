package chap08.lecture.anonymousClass;

public class MyApp {
	public static void main(String[] args) {
		MyInterface o1 = new MyClass();
		o1.method1();
		
		MyInterface o2 = new MyInterface() {
			@Override
			public void method1() {
				System.out.println("anontmous class method1");
			}
		};
		o2.method1();
		
	}

}
//interface 안에 class interface로 한번에 만들고 싶을때
//interface 와 