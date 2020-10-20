package chap10.textbook.s100203;

public class NumberFormExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";//인티저 타입으로 변경 불가하므로 잘 변경해줘서 써야함
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" +data2 + "=" + result);
	}

}
