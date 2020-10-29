package chap12.textbook.s120203;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름" + mainThread.getName());
		
		ThreadA threadA = new ThreadA(); // 0번 
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB(); //1번
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}

}
// ThreadA 는 이름을 정의 했음 B는 안했으므로 Thread1이 출력됨
