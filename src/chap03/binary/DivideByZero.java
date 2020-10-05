package chap03.binary;

public class DivideByZero {
	public static void main(String[] args) {
//		int x = 5;       0으로 나눴을 때 주의 할점 
//		int y = 0;
//		
		
//		int z = x / y ;
		System.out.println("어떤 실행문 ......"); // 어떤 실행문이건 출력이 안됨 정수로 나눴을때
		
		double a = 5.0;
		double b = 0.0; // 
		
		double c = a / b;
		System.out.println(c);
		
		double d = -5.0;
		double e = 0.0;
		
		double f = d / e;
		System.out.println(f); //음수로 인피니티가 나옴
		
		double g = d % e ;  // 이런 수는 없다 NaN (Not a Number)  if 문으로 사용해야됨  
		System.out.println(g);
	}

}
