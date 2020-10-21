package chap11.textbook.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // 기본타입을 리턴
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		Integer i = Integer.valueOf("30");//참조타입을 리턴
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	}

}
//참조타입을 기본타입으로 변경할때 쓰임