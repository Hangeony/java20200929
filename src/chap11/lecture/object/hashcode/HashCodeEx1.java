package chap11.lecture.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		System.out.println("---------------------");
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
//hashCode는 언제쓰이느냐 ?
//어떤 인스턴스를 카테고리로 분류하는데 쓰임 (케비넷의 서랍으로 생각)

//16진법 15db9742 10진법 366712642
//16진법 6d06d69c 10진법 1829164700
//문자열 java는 같지만 참조값이 다르다.
//String은 오버라이드가 재정의 해서 해쉬테그의 결과값은 같게 나온다.