package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		//순서가 없고 중복되지 않음.
		Set<String>set = new HashSet<>();

		//추가 list랑 동일
		set.add("java");
		set.add("Html");
		set.add("css");
		set.add("jsp");
		set.add("dbms");
		set.add(new String("java")); //중복되는 값은 들어가지 않는다.
		//해쉬태그로 값도 같다.
		System.out.println(set.size());

		//삭제
		set.remove("jquery");            //같은 값이 없어서 삭제 안됨
		System.out.println(set.size());
		set.remove("Html");
		//	set.remove(new String("Html")); // 해쉬태그가 같아서 삭제됨
		System.out.println(set.size());

		//검색(모두 탐색) 순서가 없어서 순서 대로 나올 보장X

		for (String s : set) {
			System.out.println(s);
		}

		Iterator<String> iter = set.iterator();       //둘다 순서 보장 x
//		iter.hasNext(); // boolean타입으로 결과값 보여줌
//		iter.hasNext(); // 다음값을 보여줌?
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

	}
}
