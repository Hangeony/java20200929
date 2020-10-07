package chap04.textbook;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score > 90) {
			System.out.println("점수가 90점 보다 큽니다");
			System.out.println("A등급입니다.");
		}else {
			System.out.println("점수가 90점보다 낮습니다.");
			System.out.println("B등급 입니다.");
		}
	}

}
