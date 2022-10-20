package ch02.quiz_sub;

import java.util.ArrayList;
import java.util.Scanner;

public class ddd {

	private static ddd instance = null;
	private int count = 0;

	static public ddd getInstance() {
		if (instance == null) {
			instance = new ddd();
			return instance;
		}
		return instance;
	}

	public void count() { count++; }
	
	public int getCount() { return count; }

	
	public static void main(String[] args) {
		ddd s1 = ddd.getInstance();
		s1.count();

		ddd s2 = ddd.getInstance();
		s2.count();

		ddd s3 = ddd.getInstance();
		s3.count();

		System.out.println(s1.getCount());
	}

}
