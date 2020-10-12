package chap05.textbook;

public class ArryInArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length;i++) {
			for(int k=0; k<mathScores[i].length;k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" +mathScores[i][k]);
			}
		}
		System.out.println();
		int[][]englishScores = new int[2][]; // 각원소는 null 로 저장
		englishScores[0] = new int[2];       //0번 인덱스에는 2인값
		englishScores[1] = new int[3];       //1번 인덱스에는 3인값을 저장
		for(int i =0; i <englishScores.length; i++) {  
			for(int k=0; k<englishScores[i].length;k++) { // i가 1번째일 때는 2개 i가 2일떄는 3배의 값을 가짐
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);

			}
		}
		System.out.println();

		int[][] javaScores = { {95,80},{92, 96, 80} };
		for(int i=0;i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length;k++) {   // i가 0일때 2번 i가 1일때는3번
				System.out.println("javaScores["+i+"]["+k+"]=" +javaScores[i][k]); //총5번 돌아감	
			}
		}

	}
}

