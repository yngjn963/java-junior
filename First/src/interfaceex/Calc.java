package interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	//인터페이스에 선언한 변수를 컴파일하면 상수로 변환한다.
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);//인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	
	/*
	 * 디폴트 메서드란 말 그대로 기본으로 제공되는 메서드.
	 * 디폴트 메서드는 인터페이스에서 구현하지만, 이후 인터페이스를 구현한 클래스가 생성되면 그 클래스에서 사용할 기본 기능이다.
	 */
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
//		myMethod();
	}
	
	/*
	 * 정적 메서드는 클래스 생성과 무관하게 사용할 수 있다.
	 * 정적 메서드를 사용할 때는 인터페이스 이름으로 직접 참조하여 사용한다.
	 */
	static int total(int[] arr) {
		int total = 0;
		
		for (int i : arr) {
			total += i;
		}
		
//		myStaticMethod();
		
		return total;
	}
	
	/*
	 * 자바 9부터 인터페이스에 private 메서드를 구현할 수 있다.
	 * private 메서드는 인터페이스를 구현할 클래스에서 사용하거나 재정의할 수 없다.
	 * 따라서 기존에 구현된 코드를 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우에 private 메서드로 구현하면 코드 재사용성을 높일 수 있다.
	 * 또한 클라이언트 프로그램에 제공할 기본 기능을 private 메서드로 구현하기도 한다.
	 */
//	private void myMethod() {
//		System.out.println("private 메서드입니다.");
//	}
//	
//	private static void myStaticMethod() {
//		System.out.println("private static 메서드입니다.");
//	}
}
