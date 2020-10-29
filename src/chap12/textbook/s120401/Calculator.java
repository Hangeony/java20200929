package chap12.textbook.s120401;

public class Calculator {
	private int memory;

	public int getMonory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}

}
/*자기 필드에 setMemory를 넣어라 
  synchronized < 셋팅하고 읽는것까지 안전하게 해줌
  공유하고있는 쓰레드는 겹칠수있다 (원하는값 출력하기 복잡하다)
  밑에코드도 똑같은방법
    public void setMemory(int memory) {
	synchronized (this) {
	this.memory = memory;
	이하생략
 */