package ch01.sub.case06;

class Parent {
	int a = 10;
	int b = 20;
}

class Child extends Parent {
	int c = 30;
	
	public void output() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}


public class CastingMain {
	public static void main(String[] args) {
		
		Parent c = new Child();  // up_casting
		
		System.out.println(c.a);
		System.out.println(c.b);
//		System.out.println(c.c);
		
//		Child p = (Child) new Parent();  // down_casting
		
		Child p = (Child) c;  // down_casting
		System.out.println(p.c);
		System.out.println(p.a);
		System.out.println(p.b);
		
		Object o = new String("홍길동");  // up_casting
		System.out.println(o);
		
		String s = (String) o;  // down_casting
		System.out.println(s);
	}
}
