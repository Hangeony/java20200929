package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		//double : 8byte
		
		double doubleValue =3.14;
		
		System.out.println(doubleValue);
		
		doubleValue = 3e6; // 3.0* 10의 6제곱
		System.out.println(doubleValue);
		
		//실수형 계산시 주의
		//컴퓨터가 가지고 있는 한계 컴퓨터가 2진법으로 저장해서 생긴문제 + 저장공간의 한계 정확한 값을 저장 근사치를보여줌
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 +d2;
		System.out.println(d3);
		
	}

}
