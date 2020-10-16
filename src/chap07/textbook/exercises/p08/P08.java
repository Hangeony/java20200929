package chap07.textbook.exercises.p08;

class A {}
class B extends A{}
class D extends B{}
class E extends B{}
public class P08 {
	public static void main(String[] args) {
		B b = (B) new A();
	}

}
