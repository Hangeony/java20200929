package chap18.textbook.s180501;

import java.io.Reader;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExample  {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;                  
		Reader reader = new InputStreamReader(is);

		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
	}
}
//문자단위로 100개씩 읽어서 배열에 넣어서 String으로 바꾼뒤 출력함