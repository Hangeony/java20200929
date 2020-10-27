package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;


public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des);
		
		int data;
		
		while((data = reader.read()) != -1) {
			writer.write(data);
		}
	
		
		System.out.println("파일이 복사되었습니다.");
		reader.close();
		writer.close();
	}

}
//아깝다  ㅠ 읽고 쓰는 것만 잘 알면 됨 Stream