package chap07.lecture.superKeyWord;

public class ChildClass extends ParentClass {
	@Override
	void method1() {
		super.method1();
		//상위 클레스에서 하는일을 같이하고싶다 = super
		System.out.println("child methode");
		
	}

}
