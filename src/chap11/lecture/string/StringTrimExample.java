package chap11.lecture.string;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "    02";
		String tel2 = "-123        ";
		String tel3 = "   -1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim(); // +는 양변에 스트링이 있으면 연결 시켜줌
		System.out.println(tel);
	}

}
