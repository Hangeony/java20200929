package chap03.textbook;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 =" +result1);
		System.out.println("result2 =" +result2);
		System.out.println("result3 =" +result3);
		
		short char1 = 'A';
		short char2 = 'B';
		char char3 = '\u263a';
		boolean result4 = (char1 < char2);
		System.out.println(result4);
		System.out.println(char3);
	}

}
