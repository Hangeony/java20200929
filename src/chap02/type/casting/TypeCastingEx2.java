package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
		//int intValue2= intValue + longValue;
		long longValue2 = intValue + longValue;
		
		double doubleValue =3.14;
		
		//int intValue3 = intValue + doubleValue; 
		
		double doubleValue2 = intValue + doubleValue;
		
		//정수형의 연산결과는 int 
		
		short shortValue1 = 3;
		short shortValue2 = 5;
		
		//short shortValue3 = shortValue + shortValue2;
		int intValue4 = shortValue1 + shortValue2;
		// short 과 short 의 결과는 항상 int의 결과물로 나옴
		// int 는 short 로 바꿀수 없다.
		//long으로는 int 결과값을 받을 수 있다.
	}

}