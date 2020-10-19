package chap09.lucture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("anonymous - method1");
			}//익명 클래스
			
		};// class 몸통 인스턴스 동시에 된다.
		p2.method1();
		
		Parent p3 = new Parent() {
			
		};
	}

}
