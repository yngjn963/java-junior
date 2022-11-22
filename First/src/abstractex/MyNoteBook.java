package abstractex;

public class MyNoteBook extends NoteBook {
	//모든 추상 메서드가 구현된 클래스이므로 abstract 예약어를 사용하지 않는다.

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
	/*
	 * 모든 추상 메서드를 구현한 클래스에 abstract 예약어를 사용한다면?
	 * 모든 추상 메서드를 구현한 클래스는
	 * 이 클래스만으로 완벽한 객체의 기능이 구현된 것이 아니고 공통 기능만을 구현해 놓을 때, 이 클래스는 생성해서 사용할 목적이 아닌 상속만을 위해 만든 추상 클래스이다.
	 * 이 경우에 new 예약어로 인스턴스를 생성할 수 없다.
	 */
}
