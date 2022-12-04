package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();//오류 발생. 클래스를 인스턴스로 생성할 수 없음
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();//오류 발생. 클래스를 인스턴스로 생성할 수 없음
		Computer c4 = new MyNoteBook();
		//추상 클래스는 인스턴스로 생성할 수 없다.
	}

}
