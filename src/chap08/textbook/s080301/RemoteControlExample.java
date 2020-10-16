package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteContontrol;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteContontrol rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(57);
		
		rc.setMute(false);
		
		RemoteContontrol.changeBattery();
	}

}
