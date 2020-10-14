package chap06.lecture.thisKeyword;

public class MyClass {
	int var;
	
	MyClass(){
		
	}
	
	MyClass(int var){
		this.var=var;
	}
	
	void method1(){
		int var = 5;
		System.out.println(this.var); //인스턴스를 대체해서 사용
		System.out.println(var); // 숫자 5를가르킴
	}
	
	void method2() { //인스턴스 메소드
		this.method1();   // 참조변수를 대신하는 this
	}                    //인스턴스 
	

}
