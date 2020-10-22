package chap13.textbook.s130501;

public class Util {
 public static<T extends Number> int compare(T t1, T t2) {
	 double v1 = t1.doubleValue();
	 double v2 = t2.doubleValue();
	 return Double.compare(v1, v2);
 }

}
//T가 Number의 하위 클래스일때만 적용