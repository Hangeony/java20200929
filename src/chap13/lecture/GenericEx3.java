package chap13.lecture;

public class GenericEx3 {
	public static void main(String[] args) {
		GenericEx3.<String> method("java");
		method("hello");
		method(3);
		
		String s = method2();
		Integer i = method2();
	}
	
	
	public static <T> T method2() {
		return null;
	}

	public static <T> void method(T t) {
		System.out.println(t);

	}

}
// 유추할수 있으면 생략하면 된다.
//제네릭 타입이 유추 되면 생략하면된다.