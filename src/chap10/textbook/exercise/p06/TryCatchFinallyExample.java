package chap10.textbook.exercise.p06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i = 0; i < 3; i++) {
			try {
				value =Integer.parseInt(strArray[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음.");
			}
			catch(NumberFormatException e) {
				System.out.println("숫자로 변형할수 없음.");
			}
			finally {
				System.out.println(value);
			}
		}
	}
}
// for i = 0  => 10 => finally = > 10 =>
//for i = 1 => 2a => 숫자...=> value => 
//for i =2 => 값이 없음 => 인덱스 초기화 = > 
//for i = 3 = > 값이 없어서 finally = > 10 
