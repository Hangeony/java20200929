package chap02.textbook;

public class PrimotionExample {
	public static void main(String[] args) {
		byte byteValue =10;
		int intValue = byteValue;    //int <- byte  자동 형변환 
		System.out.println(intValue);
		
		char charValue ='가';
		intValue = charValue;     //int <-char
		System.out.println("가의 문자="+charValue);
		System.out.println("가의 유니코드="+intValue);
		
		intValue = 500;    
		long longValue = intValue;   //long <-int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;   //double <- int
		System.out.println(doubleValue);
		
	}

}
