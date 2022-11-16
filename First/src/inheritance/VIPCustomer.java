package inheritance;

public class VIPCustomer extends Customer {
//	private int customerID;			//고객 아이디
//	private String customerName;	//고객 이름
//	private String customerGrade;	//고객 등급
//	int bonusPoint;					//보너스 포인트
//	double bonusRatio;				//적립 비율
	
	private int agentID;		//VIP 고객 담당 상담원 아이디
	double saleRatio;			//할인율
	
	public VIPCustomer() {
//		customerGrade = "VIP";		//상위 클래스에서 private 변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);	//할인율 적용
//	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
//	}
}
