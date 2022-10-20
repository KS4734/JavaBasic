package ch01.quiz02.case02;

public class Banana extends Fruit {
	
	int price = 1000;
	int amount = 10;
	
	@Override
	public void output() {
		System.out.println("가격: " + price);
		System.out.println("수량: " + amount);
	}
}
