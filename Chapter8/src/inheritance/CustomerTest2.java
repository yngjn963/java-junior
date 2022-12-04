package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer();	//하위 클래스 생성
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		/*
		 * 출력 화면을 보면 상위 클래스의 Customer() 생성자가 먼저 호출되고 그 다음에 VIPCustomer()가 호출되는 것을 알 수 있다.
		 * 정리하면 상위 클래스를 상속받은 하위 클래스가 생성될 때는 반드시 상위 클래스의 생성자가 먼저 호출된다.
		 * 그리고 상위 클래스 생성자가 호출될 때 상위 클래스의 멤버 변수가 메모리에 생성되는 것이다.
		 * 하위 클래스 VIPCustomer가 생성될 때 메모리 구조는
		 * 힙 메모리
		 * customerID	-|
		 * customerName	 |
		 * customerGrade |- 1. Customer() 생성자 호출 -> Customer 클래스의 멤버 변수가 메모리에 생성됨
		 * bonusPoint	 |
		 * bonusRatio	-|
		 * agentID		-|
		 * salesRatio	-|- 2. VIPCustomer() 생성자 호출 -> VIPCustomer 클래스의 멤버 변수가 메모리에 생성됨
		 */
	}

}
