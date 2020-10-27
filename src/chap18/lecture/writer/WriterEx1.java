package chap18.lecture.writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		
		writer.write('으'); // 자동 형변환이 된것 
		
		char[] arr = new char [6];
		arr[0] = '집';
		arr[1] = '에';
		arr[2] = '가';
		arr[3] = '고';
		arr[4] = '싶';
		arr[5] = '다';
		
		writer.write(arr);
//		writer.write(arr, 2, 3);
		writer.write("\r\n 조퇴각인가");
		
		
		
		writer.close();
	}

}
//영어가 아니여서 1byte 가 아닐수도 있음
//		writer.write(arr, 2, 3); arr 에서 몇번째까지 확인

