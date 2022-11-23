package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차  ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차  ===");
		Car hisCar = new ManualCar();
		hisCar.run();
		/*
		 * 템플릿 메서드의 역할은 메서드 실행 순서와 시나리오를 정의하는 것이다.
		 * 템플릿 메서드에서 호출하는 메서드가 추상 메서드라면 차종에 따라 구현 내용이 바뀔 수는 있다.
		 * 템플릿 메서드는 실행 순서, 즉 시나리오를 정의한 메서드이므로 바뀔 수 없다.
		 * 상위 클래스를 상속받은 하위 클래스에서 템플릿 메서드를 재정의하면 안 된다는 것이다.
		 * 그래서 템플릿 메서드는 final 예약어를 사용해 선언한다.
		 */
	}

}
