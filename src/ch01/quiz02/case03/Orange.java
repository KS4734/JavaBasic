package ch01.quiz02.case03;

public class Orange extends Fruit {
	
	private int price = 1500;
	private int amount = 5;
	
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
		System.out.println("### 오렌지 ###");
		System.out.println("수량: " + amount);
	}
}
