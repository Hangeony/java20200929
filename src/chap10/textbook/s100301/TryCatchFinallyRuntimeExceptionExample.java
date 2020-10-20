package chap10.textbook.s100301;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
		} //쓴다고 문제될것 없음 체크드는 무조건 써줘야함
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		try {
			int value1 = Integer.parseInt(data1); //언체크 블록
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 +  "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변형할수 없습니다.");
		}
		finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
