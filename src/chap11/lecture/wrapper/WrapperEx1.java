package chap11.lecture.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte , short , int , long
		//float, double, char, boolean
		
		//Byte, Short , Integer, Long
		//Float, Double, Character, Boolean  참조 타입처럼 쓰고싶을때.
		
		
		int i = 1;
		
		Integer in = Integer.valueOf(i); //참조타입
		
		method(in);
		
		int j = 2;
		method(j);
		
		int l = in.intValue();
		int k = in;    //boxing을  unBoxing이 자동으로 된것.
		
		Integer in2 = 3;
		int m = in2;        //자동으로 해줘서 쓸 수 있음.
	}
	
	public static void method(Object o) {
		System.out.println(o);
	}
}

// 기본타입을 참조타입으로  바꾸는 과정