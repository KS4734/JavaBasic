package ch01.sub02.case02;

public class Florist {

	public Flower sell(String flowerName) {
		Flower flower = null;
		
		switch (flowerName) {
		case "릴리": flower = new Lliy(); break;
		case "장미": flower = new Rose(); break;
		}
		
		return flower;
	}
}
