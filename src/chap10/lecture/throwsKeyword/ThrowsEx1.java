package chap10.lecture.throwsKeyword;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsEx1 {
	public static void main(String[] args) throws ClassNotFoundException {
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		try {
			method3();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void method3() throws ClassNotFoundException, FileNotFoundException {
		Class.forName("java.lang.String");
		FileReader fr = new FileReader("file.txt");
	}
}

//예외처리 짬때리는 키워드