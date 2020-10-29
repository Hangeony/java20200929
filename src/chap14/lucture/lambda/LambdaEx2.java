package chap14.lucture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {
			System.out.print("안녕 ");
			System.out.println("하세요");
		};
		MyInterface o2 = ()->{System.out.println("java");};
		MyInterface o3 = ()->{System.out.println("jsp");};
		
		o1.method();
		o2.method();
		o3.method();
	}

}
//메소드에 한줄이 아니여도 중가로를 통해서 여러줄 생성가능