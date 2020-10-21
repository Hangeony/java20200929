package chap11.object.toString;

public class MyClass{
	private int age;
	private String name;
	private String password;

	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}
	//인스턴스의 정보를 얻는데 주로 사용함
	@Override
	public String toString() {
		return "MyClass [age=" + age + ", name=" + name + ", password=" + password + "]";
	}

}
