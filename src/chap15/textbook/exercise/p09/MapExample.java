package chap15.textbook.exercise.p09;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; //최고점수 아이디
		int maxScore = 0;   //최고점수
		int totalScore = 0; //점수합

		Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {              //entry SetEntry<String, Integer>  이값을 불러옴
			if(entry.getValue() > maxScore) {              //토탈 값을 가져오고 아이디를 변경함 
				name = entry.getKey();                 //key를 얻는 메소드
				maxScore = entry.getValue();           //value를 얻은 매소드
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore/ map.size();
		System.out.println("평균점수 : " + avgScore);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);

	}

}
/* Set<String>keys = map.keySet(); 
 * for(String key : keys){  맵에서 value를 얻어올수있음
 * 	int value = map.get(key);
 * 	
 * totalScore += value;       순서에 보장하지 않지만 합계를 구할수있다.
 * if(value > maxScore){
 * maxScore = value;
 * name= key;
 * }
 * }
 * double avg= (double) totalScore / map.size(); 
 * 
 * list set map을 쓸수 있다는 자신감을 가져야함.
 * keySet< 으로 구한것
 */
