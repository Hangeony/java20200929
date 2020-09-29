package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		//byte -> 정수형
		//크기 -> 1byte (8bit) 양수 음수 0 
		
		//-128 : 1000 0000
		//   :
		//-3 : 1111 1101
		//-2 : 1111 1110
		//-1 : 1111 1111
		
		//+1
		
		//   1 0000 0000
		
		
		//0 : 0000 0000 
		//1 : 0000 0001 
		//2 :0000 0010
		//127 : 0111 1111 < 양수로 제일 큰수  맨 앞에 비트가 1이면 음수 맨앞에 0이면 0또는 양수 
	
		//+1
		
		//-1281000 0000 < 음수 
		
		byte byteValue;
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue =127;
		System.out.println(byteValue);
		
		byteValue++;
		System.out.println(byteValue);
		
	}

}
