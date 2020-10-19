package chap08.textbook.s080303;
import chap08.textbook.s080201.RemoteContontrol;

public class SmartTelevision implements RemoteContontrol, Searchable{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteContontrol.MAX_VOLUME) {
			this.volume =RemoteContontrol.MAX_VOLUME;
		}
		else if(volume <RemoteContontrol.MIN_VOLUME) {
			this.volume=RemoteContontrol.MIN_VOLUME;
		}
		else {
			this.volume =volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
