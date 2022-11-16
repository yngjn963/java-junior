package inheritance;

public class Customer {
	//상위 클래스에서 작성한 변수나 메서드 중 외부 클래스에서 사용할 수 없지만 하위 클래스에서는 사용할 수 있도록 지정하는 예약어가 바로 protected이다.
//	private int customerID;			//고객 아이디
	protected int customerID;		//고객 아이디
//	private String customerName;	//고객 이름
	protected String customerName;	//고객 이름
//	private String customerGrade;	//고객 등급
	protected String customerGrade;	//고객 등급
	int bonusPoint;					//보너스 포인트
	double bonusRatio;				//적립 비율
	
	public Customer() {
		customerGrade = "SILVER";	//기본 등급
		bonusRatio = 0.01;			//보너스 포인트 기본 적립 비율
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	//protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
}
