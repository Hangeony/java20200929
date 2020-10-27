package chap18.textbook.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "src/chap18/textbook/s180403/FileOutputStreamExample.java";
		String targetFileName= "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte [ ] readBytes = new byte[100];
		
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
	}

}
//fos.flush(); 채워놨던 데이터를 다써라 좋은 습관 
//파일 복사하는 예제 byte 단위로 쓰임
