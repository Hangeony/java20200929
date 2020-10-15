package chap07.textbook.s070701;

class A {}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromtionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e;  반대로는 적용 안됨 자동형변환이 된거 아랫타입에서 윗타입으로 된것임
//		C c2 = d;
	}

}
