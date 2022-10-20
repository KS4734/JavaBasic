package ch03.ex03.case05.presentation;

import java.util.Scanner;

public interface Console {

	Scanner sc = new Scanner(System.in);
	
	static int inNumber(String message) {
		boolean isGoodValue = false;
		String line = "";
		int number = 0;
		
		do {
			System.out.print(message + ": ");
			line = sc.next();
			
			if (line.length() > 0 && line.matches("[0-9]*")) {
				number = Integer.parseInt(line);
				if (0 <= number && number <= 100) {
					isGoodValue = true;
				}
				if (!isGoodValue)
					System.out.println("ERROR] 0 이상 100 이하의 숫자만 입력가능합니다.");
				
			}
		} while (!isGoodValue);
		
		return number;
	}
	
	static void outNumber(int number) {
		System.out.print(number + ": ");
	}
	
	static void showInfo(String message) {
		System.out.println("\n" + message);
	}
	
	static void showInfo(Object object) {
		System.out.println(object);
	}
}
