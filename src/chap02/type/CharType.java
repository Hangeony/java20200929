package chap02.type;

public class CharType {
	public static void main(String[] args) {
		//char : 2byte  (문자로 표현 해서 음수로 표현 불가)
		//작은 따움표 이용해 하나의 문자를 표현
		
		char charValue;
		charValue ='a';
		System.out.println(charValue);
		
//		charValue='ab' /하나의 문자만 가능
//		charValue=''; /하나의 문자를 꼭 있어야함 
		charValue=' '; //space 도 문자임
	
		charValue = 44032; //16 비트를 값으로도 가질 수있음
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; //16진법 16 = ac00 
		System.out.println(charValue);
	
	
	}
	
	

}
