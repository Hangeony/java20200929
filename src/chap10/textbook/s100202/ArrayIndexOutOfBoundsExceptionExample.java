package chap10.textbook.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if(args.length >= 2 ) {
			String data1 = args[0]; //0번 index 범위값이 없는데 사용해서 사용됨
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		}
		System.out.println("프로그램 종료");
	}
}
//배열에 존재하지 않는것을 실행시킬때의 오류대처법
