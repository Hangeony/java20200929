package chap04.textbook;
import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그렘 종료 하려면 q 버튼을 누르세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그렘 종료");
	}

}
