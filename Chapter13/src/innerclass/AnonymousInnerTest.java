package innerclass;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() { //익명 내부 클래스. Runnable 인터페이스 생성
			@Override
			public void run() {
				//num = 200; //지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				//i = 100; //매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				System.out.println(i);
				System.out.println(num);
			}
		}; //클래스 끝에 ;를 쓴다.
	}
	
	Runnable runner = new Runnable() { //익명 내부 클래스를 변수에 대입
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	}; //클래스 끝에 ;를 쓴다.
	//인터페이스나 추상 클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
	/*
	 * 익명 내부 클래스는 단 하나의 인터페이스 또는 단 하나의 추상 클래스를 바로 생성할 수 있다.
	 * 그런데 앞에서 인터페이스는 인스턴스로 생성할 수 없다고 했다.
	 * Runnable 인터페이스를 생성할 수 있으려면 인터페이스 몸체가 필요하다.
	 * 9~14행을 보면 Runnable 인터페이스에서 반드시 구현해야 하는 run() 메서드가 포함되어 있다.
	 * 마지막에 세미콜론(;)을 사용해서 익명 내부 클래스가 끝났다는 것을 알려 준다.
	 * 익명 내부 클래스는 18~23행처럼 인터페이스나 추상 클래스 자료형으로 변수를 선언한 후 익명 내부 클래스를 생성해 대입할 수도 있다.
	 * 여기에도 마찬가지로 추상 메서드나 인터페이스를 구현할 후 세미콜론으로 클래스 끝을 나타낸다.
	 * 마지막으로 28~31행은 익명 클래스를 사용하는 코드이며, 방법은 지역 내부 클래스와 동일하다.
	 * 즉 Runnable 인터페이스 자료형으로 변수를 선언하고, 인터페이스의 익명 내부 클래스가 구현된 메서드를 호출하면 인스턴스를 반환한다.
	 * 그리고 runnable.run() 또는 out.runner.run()으로 인터페이스의 메서드를 호출할 수 있다.
	 * 정리하면 익명 내부 클래스는 변수에 직접 대입하는 경우도 있고 메서드 내부에서 인터페이스나 추상 클래스를 구현하는 경우도 있다.
	 * 이때 사용하는 지역 변수는 상수화되므로 메서드 호출이 끝난 후에도 사용할 수 있다.
	 * 
	 * 익명 내부 클래스는 어디에 사용할까?
	 * 익명 내부 클래스는 예전에 자바 UI에서 이벤트를 처리하는 데 많이 사용했다.
	 * 현재는 안드로이드 프로그래밍에서 위젯의 이벤트를 처리하는 핸들러를 구현할 때 사용한다.
	 * 안드로이드에서 사용하는 버튼, 텍스트 상자 등을 위젯이라고 한다.
	 * 위젯은 사용자가 터치하거나 키 값을 입력하면 이벤트를 일으킨다.
	 * 발생한 이벤트를 처리해 주는 코드를 이벤트 핸들러라고 한다.
	 * 앞에서 말했듯이 안드로이드 이벤트 핸들러는 대붜분 익명 내부 클래스로 구현한다.
	 * 
	 * button1.setOnClickListener(new View.OnClickListener()) {
	 * 	public boolean onClick(View v) {
	 * 		Toast.makeText(getBaseContext(), "hello ", Toast.LENGTH_LONG).show();
	 * 		return true;
	 * 	}
	 * }
	 */

}
