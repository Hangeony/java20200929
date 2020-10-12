package chap05.textbook;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};

		int sum = 0;               //향상된 for 문 
		for (int score : scores) { //콜론으로 모든 배열에 있는 값이 한번씩 들어가면서 실행 
			sum = sum + score;     //모든값이 score 에 저장되어서 더한 값을 보기 위한것.
		}
		System.out.println("점수 총합 = " +sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수 평군 = " + avg);
	}

}
