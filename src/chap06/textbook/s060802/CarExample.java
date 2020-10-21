package chap06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
//          ↑객체   		
		myCar.setGas(3);
		
		boolean gasState = myCar.isLeftGas();
		//                  ↑ return 값을 저장
		if(gasState) {
			System.out.println("출발함니다.");
			myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("가스 주입 할 필요가 있습니다.");
		}else {
			System.out.println("가스를 주입하세요.");
		}
	}

}
