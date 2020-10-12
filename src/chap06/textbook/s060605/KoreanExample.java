package chap06.textbook.s060605;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","011225-1234567");
		System.out.println("k1.name : " + k1.name );
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바","930525-0654321");
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
		
		//생성자를 만들때에 public Korean () 만든격인데 작성할때 없어서 오류가남
//		korean k3 = newKoeran();
	}

}
