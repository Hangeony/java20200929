package chap14.lucture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () ->{
			int outterField = 3;
			System.out.println("익명 클래스의 객체 (local Class");
			System.out.println(this);
			System.out.println(outterField);
			System.out.println(NestedEx2.this.outterField);
		};
	}
	public static void main(String[] args) {
		
	}
}
