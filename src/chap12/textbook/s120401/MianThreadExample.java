package chap12.textbook.s120401;

public class MianThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
// setMemomy는 동시에 실행됨
//왜 100이 아니고 50으로 나오나면 
//user1         user2
//set100        set50  거의 동시에 생긴일
//먼저 실행     나중에 실행
//50으로 교체된걸 읽음 50
