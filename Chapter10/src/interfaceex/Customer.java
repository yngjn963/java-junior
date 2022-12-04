package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
	}
	
	/*
	 * 디폴트 메서드가 중복되었으니 두 인터페이스를 구현하는 Customer 클래스에서 재정의한다.
	 * Customer 클래스에서 디폴트 메서드를 재정의하면, Customer 클래스를 생성하여 사용할 때 재정의된 메서드가 호출된다.
	 */
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
