package chap08.textbook.s080302;
import chap08.textbook.s080201.RemoteContontrol;
public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteContontrol rc = new RemoteContontrol() {

			@Override
			public void turnOn() {}

			@Override
			public void turnOff() {}

			@Override
			public void setVolume(int volume) {}
		};
	}
}
