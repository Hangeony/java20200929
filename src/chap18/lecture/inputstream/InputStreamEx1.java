package chap18.lecture.inputstream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int cnt = 0;
		int r = 0 ;
		while ((r = is.read()) != -1) {
			System.out.print((char)r);
			cnt++;
		};
		System.out.println(cnt);
		
		is.close();
	}

}
//is.read(); -1 동안 계속 읽어줄수 있음.  한바이트 씩 읽을수 있음.
//is.close(); 항상 꼭 닫아줘야함.
//11 ~12번째 줄 r이 몇번 쓰이는지 확인
//System.out.print((char)r); 더이상 읽은 글자가 없으면 -1 