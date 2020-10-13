package chap06.textbook.exercises.p14;

public class MemberExample {
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "Hong");
		Member user2 = new Member("강자바", "Java");
		
		System.out.println(user1.name);
		System.out.println(user1.id);
		
		System.out.println(user2.name);
		System.out.println(user2.id);
	}

}
