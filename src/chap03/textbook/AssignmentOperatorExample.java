package chap03.textbook;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
//		result = result +10 위에랑 같은 일을 함
		System.out.println("result = " + result);
		result -= 5;
//		result = result - 5;
		System.out.println("result = " +result);
		result *= 3;
//		result = result * 3;
		System.out.println("result = " +result);
		result /= 5;
//		result = result / 5;
		System.out.println("result = " +result);
		result %= 3;
//		result = result % 3;
		System.out.println("result = " +result);
	}

}