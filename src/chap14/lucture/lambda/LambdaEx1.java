package chap14.lucture.lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
		//추상 메소드가 하나인 인터페이스의 객체를 만들 때  주로 사용함
		
		MyInterface o1 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("추상 매소드 재정의");
				
			}
		};
		MyInterface o2 = () -> System.out.println("추상매소드 재정의2");
		o1.method();
		o2.method();
	} 

}
//둘다 매소드라는 것을 잘 실행시킬 수있음
//MyInterface o2 = () -> System.out.println 
// 본체  -> 코드블럭