package chap13.lecture;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<>();
		MyClass2<Integer>o2 = new MyClass2<>();
//		MyClass2<Object>o3 = new MyClass3<>(); Number의 상위 클래스라서 안됨
	}

}
//왜 굳이 쓰느냐 
//넘버의 하위 클레스만 가지고 올수있으니 넘버가 가지고있는 
//하위클레스를 안전하게 실행시키기 위함.