package chap18.textbook.s180504;

public class VarArgEx1 {
	public static void main(String[] args) {
		method();
		method(1);
		method(1, 2);
	}
	
	public static void method(int ...nums) {
		System.out.println("mothod 실행");
		System.out.println(nums.length);
		
		for (int i = 0; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
//0개 넣어도 실행되고 1개 넣어도 실행된다 0개 이상 넣을 수있음
//int ... 인티저 타입을 여러개 작성할수 있음