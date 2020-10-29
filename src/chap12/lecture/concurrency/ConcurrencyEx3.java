package chap12.lecture.concurrency;

public class ConcurrencyEx3 {
	static int field = 0;
	static final Object mutex = new Object();

	public  static void inc() {
		synchronized(mutex) { 
			field++;
			}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i<100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i<100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			}; 
		};
		t1.start();
		t2.start();
	}

}
//mutex = lock  객체명을 넣어줘야함
//매소드의 일부부만 실행하게됨
//먼저 획득한 쓰레드만 실행시킴 
//획득하기전까지 실행시킬수 없음 놨다 실행시켰다가 반복함 
//다양하고 복잡한 해결책이 많다 이런일을 만들지 않겠다가 중요함