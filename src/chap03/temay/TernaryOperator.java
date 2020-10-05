package chap03.temay;

public class TernaryOperator {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항
		// a ? b : c
		//위 연산의 결과는 b 또는 c  ( a 의 결과값에 따라 b 와 c의 결과값이 달라진다.)
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a?b:c);
	}

}
