package chap07.lecture.override;

public class ChildClass extends ParentClass{
	void method2() {
		System.out.println("child method");
	}
	//프로그렘에 실행되지 않는 주석
	@Override   // 이메소드가 상위 메소드를 덮어쓴다 자식이 부모클레스를 고친다
	void method1() {
		System.out.println("child method1!!!!!!!!!");
	}

}
