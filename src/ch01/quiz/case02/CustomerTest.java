package ch01.quiz.case02;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cLee = new Customer(1001, "이병헌");
		cLee.bonusPoint = 1000;
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer(1002, "김우빈");
		cKim.bonusPoint = 2000;
		System.out.println(cKim.showCustomerInfo());
		
		// 형 변환(하위->상위_업캐스팅)
		Customer vc = new VIPCustomer(1234, "none");
//		vc.  // 검색되는 걸 보면, Customer(부모) 꺼만 쓸 수 있는 거 확인
	}
}
