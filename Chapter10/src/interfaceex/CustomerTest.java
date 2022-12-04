package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		//Buy형으로 변환되었지만, Buy에서 구현한 디폴트 메서드가 아닌 Customer 클래스에서 재정의한 메서드가 호출된다.
		//이는 상속에서 설명한 자바 가상 메서드 원리와 동일하다.
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
