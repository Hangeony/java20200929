package chap03.binary;

public class CompareOperatorWithRefType {
	public static void main(String[] args) {
		String s = "Java"; //참조타입
		String t = "Java";
		
		String u = "Ja";
		String v = "va";
		String w = u + v;
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(w);
		
		System.out.println(s == t); //같은 인스턴스를 가지고있는 참조값
		System.out.println(s == w); //참조 타입에서 비교연산해보면 참조값을 비교함  string이 같지만 다른 참조값을 가지고 있음 연산되어서 + 값이 없어짐 
		                            // 서로다른 참조 값을 가지고 있기에 flase가 나온것임
	                                	
		
	}

}
