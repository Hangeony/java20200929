package chap05.textbook;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java"); //새로운 인스턴스 만듬  
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);   //1 번이랑 2번이랑다른 것을 가르킴.
		System.out.println(strArray[0].equals(strArray[2])); //안에 있는 문자열을 가져서 true가 나옴.
	}

}
