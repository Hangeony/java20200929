package chap09.lucture.localClass;

public class MyApp2LocalVariable {
	public static void main( String[] args) {
		final int i = 1;          //암묵적으로 final  
		
		class LocalClass{
			void method1() {
				System.out.println(i);
				System.out.println(args);
//				i += 1; 지역변수의 값을 바꿀수없다. 있는 그대로 써야함 final
			}
		}
//		args = new String[3];
//		i += 1;  밖에 넣어두 안됨 결론 final 변수만 사용 가능
	}

}
