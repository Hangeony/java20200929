package chap09.lucture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i =3;
		System.out.println(i);
		
		
		class LocalClass{
			int i;
//			static int j;
			
			void method1() {}
//			static void method2() {}
		}
		LocalClass l1 = new LocalClass();
	}

}
//지역변수 이안에서만 쓰면 사라짐
