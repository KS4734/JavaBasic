package ch01.quiz02.case04;

import java.util.Scanner;

public class SellService {
	
	Scanner sc = new Scanner(System.in);
	Fruit[] f = new Fruit[3];
	String[] fName = {"바나나", "사과", "오렌지"};
	
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
	
	public SellFruit[] sell(SellFruit[] sf) {
		for (int i=0; i<3; i++) {
			System.out.println((i+1) + ". " + fName[i]);
		}		
		System.out.print("과일 선택: ");
		int select = sc.nextInt();
		
		System.out.print("판매 수량 입력: ");
		int amount = sc.nextInt();
		int fruitAmount = f[select-1].getAmount();
		f[select-1].setAmount(fruitAmount - amount);
		
		sf[select-1].setTotalAmount(amount);
		
		int price = f[select-1].getPrice();
		sf[select-1].setTotalSales(price * amount);
		
		return sf;
	}
	
	public void sellInfo(SellFruit[] sf) {
		System.out.println("### 매출 보기 ###");
		for (int i=0; i<3; i++) {	
			System.out.println("과일 이름: " + fName[i]);
			System.out.println("총판매금액: " + sf[i].getTotalSales());
			System.out.println("총판매수량: " + sf[i].getTotalAmount());
		}
	}
	
	public void amount() {
		System.out.println("### 남은 수량 ###");
		for (int i=0; i<3; i++) {
			System.out.println(fName[i] + ": " + f[i].getAmount());
		}
		for (int i=0; i<3; i++) {
			System.out.println((i+1) + ". " + fName[i]);
		}		
		System.out.print("추가할 과일 입력: ");
		int addf = sc.nextInt();
		
		int fAmount = f[addf-1].getAmount();
		System.out.print("추가할 수량 입력: ");
		f[addf-1].setAmount(fAmount + sc.nextInt());
	}
	
}
