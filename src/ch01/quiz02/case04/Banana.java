package ch01.quiz02.case04;

public class Banana extends Fruit {
	
	private int price = 1000;
	private int amount = 10;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void output() {
		System.out.println("### 바나나 ###");
		System.out.println("수량: " + amount);
	}
}
