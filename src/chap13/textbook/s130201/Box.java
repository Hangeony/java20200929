package chap13.textbook.s130201;

public class Box {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}

}
// get 과 set을 어떤 객체를 필드에 넣었다가 뺐다가 하는 용도로 만들어짐
// 어떤 타입으로 만들어질지 몰라서 Object로 만들어짐 (모든객체의 상위 맴버라서)