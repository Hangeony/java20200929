package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
	static final long serialVersionUID = 1L;
	
	
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;

}
//static은 직렬화되지 않음
//transient  직렬화 되자 않음
//static final long serialVersionUID = 1L; 시리얼을 목적으로 적어둔 코드