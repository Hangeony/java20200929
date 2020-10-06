package chap03.binary;

public class BitOperatior {
	public static void main(String[] args) {
		// ~반전  (단항 연산자) 모든 비트를 반전 시킴
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		// 이항 연산자 (항이 두개)
		// & and  : 같은 자리의 bit가 1인 경우만 1, 나머진 0 ;
		// | or   : 같은 자리의 bit가 0인 경우만 0, 나머진 1;
		// ^ xor  : 같은 자리의 bit가 다를경우만 1, 같으면 0;
		// 피연산자 : integer 
		// 결과 : integer
		
		int a = 45;   // 0010 1101
		int b = 25;   // 0001 1001   0000 1001  9  
		int c = a & b;
		System.out.println(c);
		
		int d = 45;  // 0010 1101
		int e = 25;  // 0001 1001  0011 1101
		int f = d | e;
		System.out.println(f);
		
		c = a ^ b;   //0011 0100;
		System.out.println(c);
		
		//bit shift 연산자 (밀어내다 옆으로 옴기다)
		// << : 각 bit를 왼쪽으로 옮김 , 오른쪽으로 0으로 채움
		// >> : 각 bit를 오른쪽으로 옮김 , 왼쪽은 msb(Most Singnificant Bit) 최상위 비트로 채움 양수면0 음수면 1
		// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 무조건 0으로 채움
		
		int val = 1; // 0001 
		int res = val << 1;// 0010
		System.out.println(res);
		
		val = 97; //0001 0000 
		res = val >> 1; //나누기 2 하는 것과 동일 (2이면 2*2 4로 나눈것과 동일)
		System.out.println(res);
		
		val = -17;
		res = val >> 1;
		System.out.println(res);
		
		val = 97;
		res = val >>> 2;
		System.out.println(res);
		
		val = -17;
		res = val >>> 1;
		System.out.println(res);
		
		
		
		
	}

}
