package chap11.textbook.s110303;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		String s = "java";
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(s.toString());
	}
}
//적절하게 toString정보를 쓸 수있음.