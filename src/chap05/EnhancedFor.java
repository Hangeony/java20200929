package chap05;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8};
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	System.out.println("=====================");
	for(int n : arr) {  //arr 0이라는 변수가 코드 블럭이 실행됨 
						//배열에 있는 첫번째부터 마지막까지 순서대로 한번만 실행됨
		System.out.println(n);
	}
	
	}

}
