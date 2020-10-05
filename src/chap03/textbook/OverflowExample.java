package chap03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long q = 1000000;
		long p = 1000000;
		long w = q * p;
		System.out.println(w);
	}

}
