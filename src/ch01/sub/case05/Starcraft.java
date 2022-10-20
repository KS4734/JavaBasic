package ch01.sub.case05;

public class Starcraft {
	public static void main(String[] args) {
		
		Protoss p = new Protoss();
		Protoss dragoon = new Dragoon();
		Protoss zealot = new Zealot();
		
		dragoon.attack();
		dragoon.depense();
		
		zealot.attack();
		zealot.depense();
	}
}
