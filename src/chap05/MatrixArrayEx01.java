package chap05;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix =new int[3][2]; // intger 배열을 저장 할 수 있는 배열 행열과 유사 
		
		int[] arr = new int[3];  //3개의 공간을 가진 배열을 arr이 가지도록 하는것
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length); //배열을 저장한 배열이라 속성과 기능이 있음
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length); //참조 타입은 인스턴스의 참조값을 가짐
		
		
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		//행열의 배열을 쓰일때 주로 쓰임 
		matrix[0][0] = 9; // 1번째의 첫번째
		matrix[2][0] = 1; // 3번째의 첫번째     
			// ^행^열 번호
//		matrix[3][0] = 3; 4번째의 값이라 없음;
//		matrix[2][2] = 13; 3번쨰의 3번째값이라 없음
	}
}
