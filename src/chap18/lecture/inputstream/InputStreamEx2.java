package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap18/lecture/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[10];
		
		int readCnt = 0;
		int loopCnt = 0;
		while ((readCnt = is.read()) != -1) {
			loopCnt++;
		}
		System.out.println(loopCnt);
		
		is.close();
	}

}
//Ex1 와 동일 
//Reader <문자 단위로 읽는 클래스 
//abstract 로 만들지못해서 하위클래스로 만들어야함