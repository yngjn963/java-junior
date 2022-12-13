package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200; //지역 변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				//i = 100; //매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		
		return new MyRunnable(); //지역 내부 클래스 이름은 클래스를 생성하여 반환할 때만 사용한다.
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	//MyRunnable을 사용하려면 이 클래스를 직접 생성하는 것이 아니라 getRunnable() 메서드 호출을 통해 생성된 객체를 반환받아야 한다.
		runner.run();
		/*
		 * 지역 내부 클래스에서 지역 변수의 유효성
		 * run() 메서드는 getRunnable() 메서드의 지역 변수 i와 num을 사용한다.
		 * 그런데 지역 내부 클래스를 가지고 있는 getRunnable() 메서드 호출이 끝난 후에도 run() 메서드가 정상적으로 호출된다.
		 * 이는 getRunnable() 메서드 호출이 끝나고 스택 메모리에서 지워진 변수를 이후에 또 참조할 수 있다는 것이다.
		 * 즉 지역 내부 클래스에서 사용하는 지역 변수는 상수로 처리된다.
		 * 상수를 처리하기 위해 자바 7까지는 final 예약어를 꼭 함께 써주어야 했지만, 자바 8부터는 직접 써 주지 않아도 코드를 컴파일하면 final 예약어가 자동으로 추가된다.
		 * 그러므로 15~16행처럼 num과 i 변수의 값을 다른 값으로 바꾸려고 하면 오류가 발생한다.
		 */
	}

}
