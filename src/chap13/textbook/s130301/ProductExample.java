package chap13.textbook.s130301;

class Tv{}
class Car{}

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}
//다른 타입으로 결정될때 안에 값을 잘 적어줘야함.
//Product<Tv, String> product1 = new Product<Tv, String>();
//유추가 가능할땐 뒤에있는 <>안에 있는 내용 제거 해두 됨