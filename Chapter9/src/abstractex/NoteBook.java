package abstractex;

public abstract class NoteBook extends Computer {
	//NoteBook 클래스는 추상 메서드를 하나 가지고 있기 때문에 추상 클래스가 된다.

	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}

}
