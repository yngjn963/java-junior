package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer("10030", "나몰라", 2000);
//		vc.calcPrice(10000);
		/*
		 * calcPrice()는 하위 클래스에서 재정의된 메서드이며 Customer 클래스와 VIPCustomer 클래스에 모두 존재한다.
		 * 그렇다면 vc.calcPrice(10000)은 어떤 클래스의 메서드를 호출할까?
		 */
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		/*
		 * 멤버 변수와 메서드는 선언한 클래스형에 따라 호출된다.
		 * 그러면 vc.calcPrice(10000)은 당연히 선언한 클래스형인 Customer 클래스의 calcPrice() 메서드를 호출해야 한다.
		 * 그런데 출력 결과는 9,000원이다.
		 * VIPCustomer 클래스의 calcPrice() 메서드, 즉 재정의된 메서드가 호출되었다.
		 * 
		 * 상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할 때 호출되는 메서드는 인스턴스에 따라 결정된다.
		 * 다시 말해 선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출하는 것이다.
		 * 이렇게 인스턴스의 메서드가 호출되는 기술을 '가상 메서드'라고 한다.
		 * 가상 메서드가 실행되는 원리를 이해하면 왜 vc.calcPrice(10000)이 Customer 클래스의 메서드가 아닌 생성된 인스턴스, 즉 VIPCustomer의 메서드를 호출하는지 이해할 수 있다.
		 */
	}

}
