package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteContontrol;

public class Audio implements RemoteContontrol{
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteContontrol.MAX_VOLUME) {
			this.volume = RemoteContontrol.MAX_VOLUME;
		}
		else if (volume<RemoteContontrol.MIN_VOLUME) {
			this.volume =RemoteContontrol.MIN_VOLUME;
		}
		else {
			this.volume =volume;
		}
		System.out.println("현재 Audio볼륨 : " +this.volume);
	}

}


