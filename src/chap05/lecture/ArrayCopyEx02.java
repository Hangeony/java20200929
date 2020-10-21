package chap05.lecture;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = {{3,4},{88,99},{2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr1 [0][0] =100;                // arr2 에서는 3이 저장되어 있었으나 변경된 0번째 참조값을 바꿔서 참조값을 변경함.
		
		for (int[] arr : arr2) {
			for(int n : arr) {
				System.out.println(n);
			}
		}
	}

}
