package chap04.textbook;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("90점보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		if (score < 90) {
			System.out.println("90점 보다 낮습니다.");
			System.out.println("등급은 B등급입니다.");
		}
	}

}
