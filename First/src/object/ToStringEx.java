package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	/*
	 * toString() 메서드는 인스턴스 정보를 문자열로 반환하는 메서드이다.
	 * toString() 메서드의 원형은 생성된 인스턴스의 클래스 이름과 주소 값을 보여준다.
	 */

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
