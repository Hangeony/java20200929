package chap14.lucture.api.function;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FunctionEx3 {
	public static void main(String[] args) throws Exception{
		String path ="src/chap14/lucture/api/function/FunctionEx3.java";
		FileReader fr = new FileReader(path);

		Map<Character, Integer> map = new HashMap<>();

		int ch;

		while((ch = fr.read()) != -1) {
			if(('a'< ch && ch <= 'z') || ('A' < ch && ch <= 'Z')) {
				char c = (char) ch;
				System.out.print(c);

				map.compute(c, (k, v) -> v == null ? 1  : v+1);
			}
		}
		map.forEach((k,v) -> System.out.println(k +":"+v));
		fr.close();

	}
}
/*for(String s : strings) {
map.compute(s, (k, v) -> v == null ? 1 : v+1);
 위에껀 요약본
if(map.containsKey(s)) {
	int v = map.get(s);
	map.put(s + v+1);
}else {
	map.put(s, 1);
}
return map;
}
 */
//c, (k, v) -> v == null ? 1  : v+1  (3 + 1 어떤케릭터값이 4개다 라고 업데이트됨)
//참조 타입과 기본타입의 값을 박싱 언박싱이 잘 완성됨