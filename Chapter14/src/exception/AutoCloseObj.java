package exception;

/*
 * 자바 7부터 try-with-resources문을 제공하여 close() 메서드를 명시적으로 호출하지 않아도 try 블록 내에서 열린 리소스를 자동으로 닫도록 만들 수 있다.
 * try-with-resources 문법을 사용하려면 해당 리소스가 AutoCloseable 인터페이스를 구현해야 한다.
 * FileInputStream 클래스는 Closeable과 AutoCloseable 인터페이스를 구현했다.
 * 따라서 자바 7부터는 try-with-reources 문법을 사용하면 FileInputStream을 사용할 때 close()를 명시적으로 호출하지 않아도
 * 정상인 경우와 예외가 발생한 경우 모두 close() 메서드가 호출된다.
 * FileInputStream 이외에 네트워크(socket)와 데이터베이스(connection) 관련 클래스도 AutoCloseable 인터페이스를 구현하고 있다.
 */

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}

}
