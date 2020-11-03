package chap03.unary;

public class SignOperator {
	public static void main(String[] args) {
		// +, - 음수 양수를 결정해주는 부호
		int intVar1 = +3;
		int intVar2 = -3; // 부호를 변경시키고 싶을때
		
		int intVar3 = -intVar2;
		
		System.out.println(intVar3);
	}

}
	