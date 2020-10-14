package chap06.lecture.method;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();    //안만들어도 자동으로 추가됨 
		o1.var1=3;
		o1.myMethod();
//		o1.yourMethod();          //아무것도 설정 안해줘서 컴파일 에러 뜸
		
		MyClass o2 = new MyClass();  //같은 설계도 안에 있어서 같은 기능을함
		o2.myMethod();
		
		o2.myMethod2(5);            //설계도에 값을 안받아서 오류 둥근가로안에 int값을 넣어줘야함
									// 호출할때 값을 받음
		o1.myMethod2(7);
		
		o1.myMethod2(7);
		
		
	}                 

}
