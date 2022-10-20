package ch01.quiz.case01;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cLee = new Customer();
		cLee.setCustomerName("이병헌");
		cLee.setCustomerID(1001);
		cLee.bonusPoint = 1000;
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer();
		cKim.setCustomerName("김우빈");
		cKim.setCustomerID(1002);
		cKim.bonusPoint = 2000;
		System.out.println(cKim.showCustomerInfo());
	}
}
