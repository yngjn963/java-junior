package virtualfunction;

public class TestA {

	/*
	 * 가상 메서드
	 * 자바의 클래스는 멤버 변수와 메서드로 이루어져 있다.
	 * 클래스를 생성하여 인스턴스가 만들어지면 멤버 변수는 힙 메모리에 위치한다.
	 * 그렇다면 메서드는 어디에 위치할까?
	 * 변수가 사용하는 메모리와 메서드가 사용하는 메모리는 다르다.
	 * 변수는 인스턴스가 생성될 때마다 새로 생성되지만, 메서드는 실행해야 할 명령 집합이기 때문에 인스턴스가 달라도 같은 로직을 수행한다.
	 * 즉 같은 객체의 인스턴스를 여러 개 생성한다고 해서 메서드도 여러 개 생성되지 않는다.
	 */
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}
	/*
	 * 힙 메모리  --  스택 메모리  --  메서드 영역
	 * a1의 num -     a1     - aaa() 호출 aaa() 메서드 영역
	 * a2의 num -     a2     -|
	 *              args
	 */
	/*
	 * 가상 메서드의 원리
	 * 가상 메서드의 경우에는 '가상 메서드 테이블'이 만들어진다.
	 * 가상 메서드 테이블은 각 메서드 이름과 실제 메모리 주소가 짝을 이루고 있다.
	 * 어떤 메서드가 호출되면 이 테이블에서 주소 값을 찾아서 해당 메서드의 명령을 수행한다.
	 */
}
