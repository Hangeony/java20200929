package chap18.textbook.s180404;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr 
		= new FileReader("src/chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNo;
		char [ ] cbuf =new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0 , readCharNo);
			System.out.println(data);
		}
		fr.close();
	}

}
//문자단위를 읽어서 char 단위로 읽음
//(readCharNo = fr.read(cbuf)) != -1) 더이상 읽을게 없으면 -1 이됨
// 몇개 읽었는지 리턴해줌
//new String(cbuf, 0 , readCharNo); 문자의 배열에서 몇개의 케릭터를 가지고 있는지 확인시켜줌 