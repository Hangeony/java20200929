package chap11.textbook.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String>hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1),"홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
/*  hashMap 다른 인스턴스를 모아서 저장한다.
 *  Key와 벨류를 같이 저장 <단어 값>
 *  Key<1 , 홍길동>을 넣어둠
 *  new Key(1) new Key(1)이랑 해쉬태그를 정의하지 않아 다른 결과값이나옴.
 *  
 *  ↆ  위에있는 코드의 해시태그가 똑같은지 확인하려고 쓴코드 
 *  Key k1 = new Key(1);
 *  hashMap.put(k1, "홍길동");
 *  Key k2 = new Key(1);
 *  String value = hashMap.get(k2);
 *  System.out.println(value);
 */
