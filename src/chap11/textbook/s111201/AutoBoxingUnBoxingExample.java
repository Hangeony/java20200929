package chap11.textbook.s111201;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동Boxing
		Integer obj = 100;
		System.out.println("value : " +obj.intValue());
		
		//대입 시 자동 UnBoxing
		int value = obj;
		System.out.println("value" + value);
		
		//연산시 자동 unBoxing
		int result = obj + 100;
		System.out.println("result : "+ result);
	}

}