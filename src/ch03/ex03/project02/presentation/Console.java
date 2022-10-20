package ch03.ex03.project02.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static int inNumber(String message) {
		boolean isGoodValue = false;
		String line = "";
		int number = 0;
		
		while(true) {
			int menu = ms.menu();
			switch (menu) {
			case 1: 
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
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
