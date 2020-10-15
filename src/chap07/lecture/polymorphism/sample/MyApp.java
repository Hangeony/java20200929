package chap07.lecture.polymorphism.sample;

public class MyApp {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.getGun(new FireGun());
		
		hero.attack();
		
		hero.getGun(new WaterGun());
		hero.attack();
	}

}
