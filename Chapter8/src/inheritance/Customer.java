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
		System.out.println("Customer() 생성자 호출 ");	//상위 클래스 생성할 때 콘솔 출력문
	}
	/*
	 * Customer 클래스의 디폴트 생성자를 없애고 새로운 생성자를 작성하면, Customer 클래스를 상속받은 VIPCustomer 클래스에서 오류가 발생한다.
	 * 오류가 발생한 디폴트 생성자에 마우스를 올려 보면 다음과 같은 오류 메시지가 보인다.
	 * Implicit super constructor Customer() is undefined. Must explicitly invoke another constructor.
	 * 이 오류 메시지는 묵시적으로 호출될 디폴트 생성자 Customer()가 정의되지 않았기 때문에, 반드시 명시적으로 다른 생성자를 호출해야 한다는 뜻이다.
	 * Customer 클래스를 새로 생성할 때 고객 ID와 고객 이름을 반드시 지정하여 생성하기로 했으니 VIPCustomer 클래스를 생성할 때도 이 값이 필요하다.
	 * -> 명시적으로 상위 클래스 생성자를 호출해야 한다. super(customerID, customerName);
	 */
	
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
