package chap07.lecture.polymorphism.sample;

public class Hero {
	private Gun gun;
	
	public Gun getGun() {
		return gun;
	}
	public void getGun(Gun gun) {
		this.gun = gun;
	}
	public void attack() {
		gun.fire();
	}

}
