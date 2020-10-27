package chap18.lecture.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "output.txt";
		OutputStream os = new FileOutputStream(path);
		
		os.write(65); 
		os.write(66);  //2 바이트
		
		byte[] datas = new byte[3]; //5바이트
		datas[0] = 67;
		datas[1] = 68;
		datas[2] = 69;
		
		os.write(datas);
		os.write(datas, 0, 2);
		
		os.close();
	}

}
//여러바이트 단위로 쓸수 있다
//String path = "output.txt"; 여기에 11~17줄 내용이 들어있다.