//집에 가고싶다.
package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap18\\lecture\\filterstream\\BufferedReaderEx1.java";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		System.out.println(line);
		
		br.close();
		fr.close();
	}
}
// window  디렉터리를 나누는 케릭터 \  윈도우식은 역슬레쉬 두개 \\
//br.readLine(); 한줄을 읽음