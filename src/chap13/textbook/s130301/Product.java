package chap13.textbook.s130301;

public class Product<T, M> {
	
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}

}
//여러개의 파라미터를 쓰고싶을때 <> 안에 ,쓰고 쓰면 된다.