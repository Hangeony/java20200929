package chap14.lucture.parameter;

import chap14.lucture.lambda.MyInterface;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a + b);
		o1.method(3, 10);
		
		MyInterface2 o2 = (x, y) -> System.out.println(x + y);
		o2.method(15, 5);
		
//		MyInterface2 o3 = a, b -> System.out.println(a + b); 
	}

}
//두개 쓸경우에는 둥근가로가 생략이 안된다.
