package chap09.lucture.nestedClass;

public class MyClass {
	
	class Class1{ 
		int i; 
//		static int j
		
		Class1(){
			
		}
		Class1(int i){
			
		}
		void method() {
			
		}
		
		
	} //인스턴스 클레스  필드 메소드를 가질수있다 . 인스턴스에는 스테틱 메소드를  가질수 없다.
	static class Class2{
		int i;
		static int j;
		Class2(){
			
		}
		Class2(int i){
			
		}
		
		void method() {
			
		}
		
	}//스테틱 클레스

}
//클레스 안에 클레스를 만들 수 있다.