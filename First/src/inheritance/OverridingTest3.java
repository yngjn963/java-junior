package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);	//VIPCustomer 인스턴스를 Customer형으로 변환
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(price) + "원입니다.");
		/*
		 * vc.calcPrice()가 호출되면, vc 변수를 선언할 때 사용한 자료형(Customer)의 메서드가 호출되는 것이 아니라 생성된 인스턴스(VIPCustomer)의 메서드가 호출된다.
		 * 이를 가상 메서드라고 한다.
		 * 자바의 모든 메서드는 가상 메서드이다.
		 */
	}

}
