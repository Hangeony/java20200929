package chap15.textbook.s150301;

public class Member {
	public static final int studentNum = 0;
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; //형변환 코드
			return member.name.equals(this.name) && (member.age == age);
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
//두개의 해쉬코드가 같게 나오게끔 하고 싶었음