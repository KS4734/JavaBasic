package ch01.quiz02.case03;

import java.util.Scanner;

public class SellService {
	
	Scanner sc = new Scanner(System.in);
	Fruit[] f = new Fruit[3];
	
	public SellService() {
		f[0] = new Banana();
		f[1] = new Apple();
		f[2] = new Orange();
	}
	
	public int menu() {
		System.out.println("1. 판매");
		System.out.println("2. 매출정보보기");
		System.out.println("3. 재고보기");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		return sc.nextInt();		
	}	
	
	public SellFruit sell(SellFruit sf) {
		System.out.println("1. 바나나");
		System.out.println("2. 사과");
		System.out.println("3. 오렌지");
		System.out.print("과일 선택: ");
		int select = sc.nextInt();
		
		System.out.print("판매 수량 입력: ");
		int amount = sc.nextInt();
		int fruitAmount = f[select-1].getAmount();
		f[select-1].setAmount(fruitAmount - amount);
		
		sf.setTotalAmount(amount);
		
		int price = f[select-1].getPrice();
		sf.setTotalSales(price * amount);
		
		return sf;
	}
	
	public void sellInfo(SellFruit sf) {
		System.out.println("### 매출 보기 ###");
		System.out.println("총판매금액: " + sf.getTotalSales());
		System.out.println("총판매수량: " + sf.getTotalAmount());
	}
	
	public void amount() {
		f[0].output();
		f[1].output();
		f[2].output();
	}
}
