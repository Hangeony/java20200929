package chap06.textbook.s060401;

public class StudentExample {
	public static void main(String[] args) {  //메인 메소드를 가지고 있던거
		Student s1 = new Student();          //인스턴스를 만들었다. 
		System.out.println("s1 변수가 Student 객제를 참조함니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조함니다.");
	}

}
