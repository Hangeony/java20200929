package chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);
		
		MyClass<String> o2 = new MyClass<>(); //구체적인 타입이 완성됨 앞에있는 타입으로 추측 할수 있기때문에 뒤에있는 String , integer는 생략가능
		o2.method1();
		o2.method2("java");
//		o2.method2(new Object()); // 메소드 타입을 Sting으로 받아서 오브젝트를 할수 없음
		
		MyClass<Integer> o3 = new MyClass<Integer>();
		o3.method2(100);
//		o3.method2("java"); //integer 타입이여서 String으로 못받아짐
	}

}
