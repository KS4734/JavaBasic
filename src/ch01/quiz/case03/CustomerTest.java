package ch01.quiz.case03;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cLee = new Customer(1001, "이병헌");
		cLee.bonusPoint = 1000;
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer(1002, "김우빈");
		cKim.bonusPoint = 2000;
		System.out.println(cKim.showCustomerInfo());
		
		System.out.println();
		
		// 구매 후 (보너스 포인트 적립, 가격 할인율 적용)
		int priceLee = cLee.calcPrice(10000);
		int priceKim = cKim.calcPrice(10000);
		
		System.out.println(cLee.showCustomerInfo() + " 그리고 지불금액은 " + priceLee + "원입니다.");
		System.out.println(cKim.showCustomerInfo() + " 그리고 지불금액은 " + priceKim + "원입니다.");
		
		System.out.println();
				
		// 형 변환(하위->상위_업캐스팅)
		Customer vc = new VIPCustomer(1003, "none");
		vc.bonusPoint = 10000;
		int priceNone = vc.calcPrice(10000); // vc하면 Customer 타임만 보이나, calcPrice()는 오버라이딩된 게 우선하여 호출된다.
		System.out.println(vc.showCustomerInfo() + " 그리고 지불금액은 " + priceNone + "원입니다.");
	}
}
