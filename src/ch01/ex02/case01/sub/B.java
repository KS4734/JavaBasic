package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;

public class B {
	
	public void test() {
		A obj2 = new A();
		int x = 0;
		
//		x = obj2.a;
//		x = obj2.b;
//		x = obj2.c;
		x = obj2.d; // public
		
//		objs2.m1();
//		objs2.m2();
//		objs2.m3();
		obj2.m4();  // public		
	}
}
