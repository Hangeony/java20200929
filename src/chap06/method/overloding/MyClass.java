package chap06.method.overloding;

public class MyClass {
	void method1() {
		System.out.println("method ......");
	}
	
	void method1(int i) {  // 같은 이름을 가졌지만 파라미터 값이 다름으로 실행이된다 같으면 컴파일 오류
		System.out.println("method######");
	}
	
	void method1(double j) { // 같은 타입이여도 컴파일 오류가 남. 
		System.out.println("method*******");
	} 
	void method1(int i, int j) {  // 같은 타입이여도 파라미터의 갯수가 달라야한다.
		System.out.println("method1 int,int");
	}
	void method1(int i , double j) {
		System.out.println("method int, double");
	}
	void method1(double i , int j) {      // 오버로딩 파라미터의 조합으로 다른 메소드를 만들수있다.
		System.out.println("method double, int");
	}
	
//	int method1(double i , int j) {              리턴값을 주어도 위에랑 같은 문장이므로 컴파일 에러가 남
//		System.out.println("mthod1 double, int , return int");
//		return 3;
//	}
	
	

}
