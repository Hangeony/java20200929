package chap06.method;

public class MyClass {
	int var1;

	
	//메소드는  : 이름이 있는 코드블럭 
	//메소드의 이름 : lowerCamelCase
	//메소드는 파라미터 : 코드블럭 안에서 사용되는 값을 저장
	//                    메소드 호출할 때 값 할당
	//메소드 리턴타입 : 메소드가 반환(return)해야 하는 값의 타입
	
	void myMethod(){ //중가로 안에 있는 코드 블럭
	//   ↑메소드 이름
		System.out.println("마이 메소드 실행1");
		System.out.println(var1);
	}
	//<파라미터> 둥근가로 안에 들어가는 것 값을 받을 준비가 됨
	void myMethod2(int param) {     
		System.out.println("마이 메소드 실행2");
		System.out.println(param);
		System.out.println(param+var1);
	}
	void myMethod(int param, int param2) { //둥근가로안에 여러개 사용가능
		
	}
}
