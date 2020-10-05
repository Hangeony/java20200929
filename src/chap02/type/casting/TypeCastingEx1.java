package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개
		
		
		//1byte   2byte  4byte   8byte
		//boolean char
		//byte    short  int      long
		//               float    double
		
		byte byteValue= 3;
		short shortValue=129;
		int intValue=1000000;
		long longValue = 10000000000L;
		
		//자동 타입 변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		//강제 형변환  0과 1의 변환이 안됨  //큰범위에서 작은범위 일때는 둥근가로 안에 꼭 써줘야함.
		longValue =2300000000L;
		intValue = (int) longValue; // 이값으로 변경하겠다고 명시를 꼭 해줘야함 
		System.out.println(intValue);
		
		//자동형변환 (정수 -> 실수)
		float floatValue =0.0F;
		double doubleValue = 0.0;
		
		System.out.println(doubleValue);
		
		doubleValue = intValue;
		floatValue = intValue;
		
		longValue = 9223372036854775807L;
		floatValue = longValue;
		System.out.println(floatValue);
		
		doubleValue = longValue;
		
		// 강제 형변환 (실수->정수)
		intValue = (int) floatValue;
		
		
	}

}
