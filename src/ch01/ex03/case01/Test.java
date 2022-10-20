package ch01.ex03.case01;

public class Test {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}	
	
	public static void main(String[] args) {
		
		Animal lion = new Lion(); // up_casting(자동타입변환)
		Animal falcon = new Falcon();
		Animal human = new Human();
		
		Test t = new Test();
		t.moveAnimal(lion);
		t.moveAnimal(human);
		t.moveAnimal(falcon);
	}
}
