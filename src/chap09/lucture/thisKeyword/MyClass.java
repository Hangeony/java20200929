package chap09.lucture.thisKeyword;

public class MyClass {
	int feild1;
	
	class Nested{
		int feild1;
		
		void method() {
			int feild1 =3;
			System.out.println(feild1);
			System.out.println(this.feild1);
			System.out.println(MyClass.this.feild1);
		}
		
	}

}
