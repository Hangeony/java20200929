package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	static int field = 0;


	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i<100_0000; i++) {
					field++;
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i<100_0000; i++) {
					field++;
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			}; 
		};
		t1.start();
		t2.start();
	}

}

//field를 1씩더하는데 값은 cpu를 더하고 저장한값은 메모리가함
//가끔 일을 나눠서 해서 쓰레드가 동시에 실행 공유하는 객체가 일관성 보장x
//이걸 해결하는 방법은 굉장히 많음 (완벽하게 해결하기위해 여러가지 해결방안이 생겨남)
//공유하지 않게 최선 (가능하면 이렇문제가 안생기게 하는게 문제)
//같은 값을 쓰지 못하게 하는것을 익숙해져야함
