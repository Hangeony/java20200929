package chap07.lecture.accesModifier.other;

import chap07.lecture.accesModifier.MyClass;

public class SubClass extends MyClass {
	void method1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);
	}
}
