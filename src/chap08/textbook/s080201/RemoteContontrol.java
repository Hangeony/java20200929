package chap08.textbook.s080201;

public interface RemoteContontrol {
	int MAX_AOLUME = 10; //(public static final) 생략 가능
	int MIN_VOLUME = 0;
	
	void turnOn();  // public abstract 생략 가능하다.
	void turnOff();
	void setVolume(int volume);
	
	
	default void setMute(boolean mute) { //public 이 생략 가능. 필요하면 재정의 가능
		if(mute) {
			System.out.println("무음 처리한다.");
		}
		else {
			System.out.println("무음 해제한다.");
		}
	}
	
	static void changeBattery() { //public 생략 가능
		System.out.println("건전지를 교체한다.");
	}

}
