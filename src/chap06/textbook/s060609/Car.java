package chap06.textbook.s060609;

public class Car {
	int gas;

	void setGas(int gas) {
		this.gas =gas;
		//↑ 가스 필드를 지칭 인스턴스를 대칭하여 사용
	}

	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달림니다.(gas 잔량:"+ gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춤니다.(gas 잔량:"+ gas + ")");
				return;
				//↑ 종료 시키고 쓰임 void는 오른쪽에 값을 저장안해두됨
			}
		}
	}

}
