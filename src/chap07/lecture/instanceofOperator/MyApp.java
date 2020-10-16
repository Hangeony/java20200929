package chap07.lecture.instanceofOperator;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		
		//instanceof : 좌변이 참조 변수 , 우변이 타입
		//결과 : Boolean 타입으로 나온다
		
		System.out.println(o1 instanceof SuperClass);
		System.out.println(o1 instanceof SubClass);
		System.out.println(o1 instanceof SubClass2);
		// o1 의  Subclass의 값을 안줘서 false 나옴
		
		
		if(o1 instanceof SubClass) {
			SubClass o2 = (SubClass)o1;
		}
		if(o1 instanceof SubClass2) {
			SubClass2 o3 =(SubClass2)o1;
		}
//		SubClass o2 = (SubClass)o1;  //강제 클레스전환으로 결과값이 잘 안보일수 있음
//		SubClass2 o3 = (SubClass2)o1; // 강제 형변환 코드라 문법적 오류 x
	}

}
