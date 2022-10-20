package ch01.sub02.case03;

public class Main {
	public static void main(String[] args) {

		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();
		shooter.setGun(rifle);
		shooter.fire();
	}

}
