package chap06.textbook.s060618;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");
		
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	 // final 은 뒤에 추가해도 안됨
	p1.name ="을지문덕";
	}

}