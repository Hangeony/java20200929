package chap15.lecture.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		//(Key , Value) 쌍  (Entry)으로 저장
		//dictionary

		Map<Integer, String> map = new HashMap<>();

		//추가 
		map.put(100, "Kim");
		map.put(30, "Hong");   
		map.put(22, "Lee");
		map.put(11, "Choi");
		map.put(200, "Jin");

		System.out.println(map.size());

		//수정
		map.put(200, "Park"); //이미 가지고 있다면 값을 덮어버림.
		System.out.println(map.size());

		//검색  key를 기준으로 value를 꺼내면된다.
		String v1= map.get(100); // key 타입을 value로 바꾼다.
		System.out.println(v1);
		System.out.println(map.get(200));

		//삭제  key를 기준으로 삭제
		map.remove(200);
		System.out.println(map.size());

		//전체 탐색  key의 특징이 순서가 없고 중복되지 않는다.
		System.out.println("향상된 For문 ");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : "+map.get(key));

		}
		System.out.println("향상된 For문 / entrySet");
		Set<Map.Entry<Integer, String>> entrys = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
