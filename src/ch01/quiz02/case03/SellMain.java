package ch01.quiz02.case03;

public class SellMain {
	public static void main(String[] args) {
		
		SellService ss = new SellService();
		SellFruit sf = new SellFruit();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				sf = ss.sell(sf);
				break;
			case 2:
				ss.sellInfo(sf);
				break;
			case 3:
				ss.amount();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
