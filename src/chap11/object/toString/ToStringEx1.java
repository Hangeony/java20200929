package chap11.object.toString;

public class ToStringEx1 {
	public static void main(String[] args) {
		
		MyClass o1 = new MyClass();
		String s = o1.toString();
		System.out.println(s);
		
		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s2);
		//객체를 받으면 toString으로 결과를 받아줌
	}

}
//다른 참조값으라서 다른 결과값이 나옴