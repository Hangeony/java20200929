package chap11.textbook.s110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override //필요한대로 제정의해서 사용 할 수있음. 
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	@Override  
	public int hashCode() {
		return id.hashCode();
	}

}
