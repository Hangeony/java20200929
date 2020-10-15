package chap07.lecture.accesModifier;

public class MyClass {
	//public , protected, (default/ package private), private
	
	//public : 모두사용가능
	//protected : 다른패키지에 있는 상송받은 클래스
	//(default) : 같은 패키지 안에서 만 사용가능
	//private : 클래스 내에서만 사용 가능

	public int publicVar;
	protected int protectedVar;
	int defaultVar;
}
