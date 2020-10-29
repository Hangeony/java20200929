package chap12.textbook.s120301;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i = 0; i <= 10 ; i ++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
//높은 숫자가 높아지는 숫자가 점유율할 확율이 높아지는 코드