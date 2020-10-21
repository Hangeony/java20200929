package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name());
		System.out.println(e1.ordinal());
		
		MyEnum e2 = MyEnum.valueOf("VALUE3");
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2);
		System.out.println(diff);
		
		MyEnum[] arr = MyEnum.values();
		System.out.println(arr.length);
	}

}
//e1.name() < 우리가정한 enum 을 String으로 바꿔줌
//e1.ordinal() < 우리가 지정한 ordinal은 0,1,2,3,4로 순번의 번호를 지정해줌
//int diff = e1.compareTo(e2); 더 낮은놈이다 , 더 나중에 지정된놈이다 를 알수 있음
//MyEnum[] arr = MyEnum.values(); 배열로 저장시킴