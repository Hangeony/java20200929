package chap18.textbook.s180501;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("file.txt");
		Writer writer =new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변경, 아 집에 가고싶다";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일저장이 완료 되었습니다.");
		
	}

}
//문자단위로 바꿔주는 것을 한것 String타입으로 바꾸는 작업을 한것