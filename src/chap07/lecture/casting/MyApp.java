package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();
		method3(new SubClass());
		
		o1.method1();
		
		SubClass o2 = (SubClass)o1;          // 슈퍼는 서브다 하는건 안됨
											 //큰타입에서 작은 클레스로 변환할떄 쓰임
		o2.mehtod2();
	}
	
	public static void method3(SuperClass s) {
		s.method1();                             //실제 실행되는 메소드
	}

}
