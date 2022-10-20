package ch01.quiz.case03;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double salesRatio;  // 할인율(VIP만)
	
	public VIPCustomer(int customerID, String customerName) {
//		super(0, "");
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override  // 오버라이딩됨을 알려주는 annotation
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;  // 보너스 포인트 적립		
		return price - (int)(price * salesRatio);  // 할인율만큼 가격을 깍아줌
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}

// 오버라이딩: 메소드 정의부가 똑같다. 그리고 블록 안 내용을 재정의(덮어씀)