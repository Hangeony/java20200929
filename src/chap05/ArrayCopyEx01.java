package chap05;

public class ArrayCopyEx01 {
	public static void main(String[] args) {
		int[] arr1 = {5,6,7};
		
		int[] arr2 = new int[arr1.length];  //
		
//		arr2[0] =arr1[0];               
//		arr2[1] =arr1[1];
//		arr2[2] =arr1[2];             값만 복사되니 주의
//		                              배열 복사하는 법 ,  간결하게 쓰는법 ↓ 
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] =arr1[i];
		}
		for(int n : arr2) {               // 상향 for문 
			System.out.print(n);
		}
	}

}
