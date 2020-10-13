package chap06.method;

public class MyClassReturn {
	int var1;
	void method1() {
		System.out.println("메소드1 실행");
	}
	int method2() {
		System.out.println("메소드2 실행");
		
		// return : 메소드를 종료, 오른쪽에 있는 값을 호출 한 곳으로 돌려줌
		//          해당하는 값만 리턴 시켜주면됨
		//리턴 되는 타입을 꼭 명시해 주어야함 
		// void 는 아무 값도 없을 때 사용
		//종료 시키고 쓰임 void는 오른쪽에 값을 저장안해두됨
		return var1 * 2;               
	}
}