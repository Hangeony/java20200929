package chap18.textbook.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample{
	public static void main(String[] args) throws Exception {
		String filePath = 
			"src/chap18/textbook/exercise/p07/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int lineNum =0;
		while((line = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + " " + line );
		}
		
		br.close();
		fr.close();
	}

}
//while((line = br.readLine()) != null) 값이 null 때까지 반복 함 .
//닫는순서는 연거 반대로 하면됨