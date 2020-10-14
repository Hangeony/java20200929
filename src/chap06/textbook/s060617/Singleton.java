package chap06.textbook.s060617;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}

}
