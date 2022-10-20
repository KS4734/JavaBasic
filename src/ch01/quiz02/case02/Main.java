package ch01.quiz02.case02;

public class Main {
	public static void main(String[] args) {
		
		Fruit apple = new Apple();  // up_casting
		Fruit banana = new Banana();
		Fruit orange = new Orange();
		
		apple.output();
		banana.output();
		orange.output();
	}
}
