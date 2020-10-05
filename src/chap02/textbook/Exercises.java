package chap02.textbook;

public class Exercises {
	public static void main(String[] args) {
		// 1번 문제
//		int newVar;
//		System.out.println(newVar);
		//변수 선언 안하면 오류남
		
		//2번문제
		int modeName;
		int $value;
		int _age;
		
		//3번
		// byte  short ,char int  long
		//                   float double
		//boolean 
		
		// 4번문제
		int age;
		age = 10;
		double price = 3.14;
		//타 입 : int , double;
		//변수명 : age , price;
		// 리터럴  10 , 3.14 
		
		//5번 문제
		byte byteValue = 10;
		char charValue = 'A';
		
		//short shortValue = charValue ; => 
		
		//6번 문제 
		int intValue = 10 ;
		//char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
//    char var  = (char) strValue;  기본타입과 참조타입은 형변환이 안됨
		
		//7번 문제
		//char var3 = '' ; 공간을 띄워줘야함
		
	   //8번 문제
		//byte byteValue = 10;
		float floatValue =2.5F;
		//double doubeValue = 2.5;
		//byte result = byteValue +byteValue;
		byte result2 = (byte)(byteValue + byteValue);
	}

}
