package chap13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		
		Object o = box.get();
		
		if(o instanceof String) {
			
			String name =(String) o;
		}
		
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
/*	
	꺼낼땐 Object 상위 클래스라서 강제 형변환을 해줘야함.
	안전하게 쓸려면 Object o = box.get();

	if(o instanceof String) {

		String name =(String) o;
	}
 */
