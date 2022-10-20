package ch01.ex03.case02;

import java.util.ArrayList;

import ch01.ex03.case01.Animal;
import ch01.ex03.case01.Falcon;
import ch01.ex03.case01.Human;
import ch01.ex03.case01.Lion;

public class Test {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}	
	
	public static void main(String[] args) {
		
		Animal lion = new Lion(); // up_casting(자동타입변환)
		Animal falcon = new Falcon();
		Animal human = new Human();
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(lion);
		list.add(human);
		list.add(falcon);
		
		for (Animal animal : list) {
			animal.move();
		}
	}
}
