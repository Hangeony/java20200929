package chap12.lecture.Thread;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

