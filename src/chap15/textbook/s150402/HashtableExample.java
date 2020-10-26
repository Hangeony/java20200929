package chap15.textbook.s150402;
import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String>map = new Hashtable<>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();

			System.out.print("비밀 번호 : ");
			String password = scanner.nextLine();
			System.out.println();

			if(map.containsKey(id)) {// 5개중에 존재하는지 확인해보고 담긴게 있으면 안쪽 코드블럭 , 없으면 밖에 꺼
				if(map.get(id).equals(password)){
					System.out.println("로그인이 되었습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			else {
				System.out.println("입력하신 아이디가 존재 하지 않습니다.");
			}
		}
	}

}
//Hashtable = HashMap 
//if(map.containsKey(id)) {// 5개중에 존재하는지 확인해보고 
//담긴게 있으면 안쪽 코드블럭 , 없으면 밖에 코드 블럭이 실행된다.
//get은 값을 넣지 않을 때 null로 리턴함.
//abc를 넣었을때 contains(id)로 저장되고 밖에 쪽 코드블럭이 실행된다.
