package chap05.lecture;

public class MatrixArrayEx02 {
	public static void main(String[] args) {
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][]; // 배열값을 설정해주지않아 초기값은 null(없음);
		mat2[0] =new int[2];
		mat2[1] =new int[2];         //배열의 값을 나중에 설정해 줄 수있음. 나중에 만들 때에는 같은 값을 안주어도 상관없음

		int[]arr1 =null;
		arr1 = new int[4];
	}

}
