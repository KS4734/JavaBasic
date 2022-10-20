package ch01.sub.case02;

public class Child extends Parent {
	
	int a = 10;
	
	// 오버라이딩
	@Override
	void output() {
		super.a = 20;
		System.out.println("a: " + a);
		
		System.out.println("부모 a: " + super.a);
		System.out.println("자식 a: " + this.a);
	}
	
	// 오버로딩(overload): 같은 메소드 이름이지만, 매개변수를 다르게 해서 사용하는 기술(생성자, 메소드)
	void output(int a) {
		System.out.println("a: " + a);
	}	
	void output(String a) {		
	}	
	void output(int a, int b) {		
	}
}
