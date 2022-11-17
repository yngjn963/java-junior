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
		/*
		 * 하위 클래스 생성자만 호출했는데 상위 클래스 생성자가 호출되는 이유는 하위 클래스 생성자에서 super()를 자동으로 호출하기 때문이다.
		 * super()를 호출하면 상위 클래스의 디폴트 생성자가 호출된다.
		 * 하위 클래스의 디폴트 생성자는 바이트 코드로 변환되기 전에 자동으로 변경된다.
		 */
		super();	//컴파일러가 자동으로 추가하는 코드. 상위 클래스의 Customer()가 호출됨.
//		customerGrade = "VIP";		//상위 클래스에서 private 변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출 ");	//하위 클래스 생성할 때 콘솔 출력문
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);	//할인율 적용
//	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showVIPInfo() {
//		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	/*
	 * 상위 클래스에서 선언한 멤버 변수나 메서드를 하위 클래스에서 참조할 때도 super를 사용한다.
	 * super 예약어는 상위 클래스의 참조 값을 가지고 있으므로 위 코드처럼 사용하면 고객 정보를 출력하는 showCustomerInfo() 메서드를 새로 구현하지 않고 상위 클래스의 구현 내용을 활용할 수 있다.
	 * 물론 위 코드의 showVIPInfo() 메서드에서는 굳이 super.showCustomerInfo()라고 호출하지 않아도 상위 클래스의 메서드가 잘 호출된다.
	 * 하위 클래스에서 동일한 이름의 상위 클래스 메서드를 가리킬 때 super.showCustomerInfo()라고 써야 한다.
	 */
//		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
//	}
	
	/*
	 * Customer vc = new VIPCustomer(); 문장이 실행되면 VIPCustomer 생성자가 호출되므로 클래스 변수가 메모리에 만들어진다.
	 * 그런데 클래스의 자료형이 Customer로 한정되었다.
	 * 클래스가 형 변환이 되었을 때는 선언한 클래스형에 기반하여 멤버 변수와 메서드에 접근할 수 있다.
	 * 따라서 이 vc 참조 변수가 가리킬 수 있는 변수와 메서드는 Customer 클래스의 멤버뿐이다.
	 * 
	 * 이렇게 클래스 형 변환을 사용하는 이유는 메서드 오버라이딩과 다형성.
	 * 하위 클래스의 인스턴스가 상위 클래스로 형 변환되는 과정이 묵시적으로 이루어진다를 이해하면 된다.
	 */
}
