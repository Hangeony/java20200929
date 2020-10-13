package chap06.textbook.s060611;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double avg(int x , int y) {
		double sum =plus(x,y);
		double result = sum/2;
		return result;
	}
	void execute() {       // 자기 자신이 메소드 
		double result = avg( 7 , 10);
		System.out.println("실행 결과 : "+ result); //String 타입으로 받아서 실행시킴
	}
	void println(String message) {
		System.out.println(message);
	}
}
