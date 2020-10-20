package chap10.textbook.s100501;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();    // 발생 시킬 수 있는 스트리먼트 
		}
		catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
