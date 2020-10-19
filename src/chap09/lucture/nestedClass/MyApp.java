package chap09.lucture.nestedClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass.Class2 o1 = new MyClass.Class2();
		
		MyClass c1 = new MyClass();
		MyClass.Class1 o2 = c1.new Class1(); //인스턴스는 먼저 감싸고 있는 인스턴스가 존재해야함
	}

}
