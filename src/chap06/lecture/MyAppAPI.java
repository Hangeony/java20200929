package chap06.lecture;
import java.util.Comparator;

public class MyAppAPI {
	public static void main(String[] args) {
		String s = new String("java");
		Comparator<String> a = s.CASE_INSENSITIVE_ORDER;
		//따로 클라스는 내장된 클라스로 되어있음 따로 클라스를 생성 안해도됨
		//String은 클라스인 클라스의 필드 매소드생성자 새용가능
		
		String t = new String(new char[] {'h','t','m','l'});
		System.out.println(t);
		char c = t.charAt(1);
		System.out.println(c);
	}

}
