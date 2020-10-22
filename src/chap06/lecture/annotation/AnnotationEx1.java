package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	@MyAnnotation
	private int i;
	//주석들 ....
	
	//annotation 
	//다른 프로그렘 실행할 때 영향을 미칠수있는 정보
	
	@Override // 메소드에서만 붙힐수 있음
	@MyAnnotation //어디에도 쓸수 있음
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	@MyAnnotation(vlue = "abc" , number=5 ,names= {"C", "D"})
	public static void mymethod() {
		
	}
}
