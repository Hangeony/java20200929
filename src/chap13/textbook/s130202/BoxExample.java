package chap13.textbook.s130202;

public class BoxExample {
	public static void main(String[] args) {
		Box<String>box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer>box2 =new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		
		System.out.println(str);
		System.out.println(value);
	}

}
// set method에 String도 넣고 형변환을 안해도 되고
// T의 값이 Integer 값으로 변경되서 안전하게 컴파일할떄 결정됨 