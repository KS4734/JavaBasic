package ch01.quiz02.case04;

public class SellFruit {
	
	private int totalSales;
	private int totalAmount;
	
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int sales) {
		this.totalSales += sales;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int amount) {
		this.totalAmount += amount;
	}
}
