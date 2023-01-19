package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
		/*
		 * 출력 결과를 보면 리소스의 close() 메서드가 먼저 호출되고 예외 블록 부분이 수행되는 것을 알 수 있다.
		 * 이처럼 try-with-resources문을 사용하면 close() 메서드를 명시적으로 호출하지 않아도 정상 종료된 경우와 예외가 발생한 경우 모두 리소스가 잘 해제된다.
		 * 
		 * 향상된 try-with-resources문 : 자바 9에서 향상
		 * 자바 7에서는 AutoCloseable 인터페이스를 구현한 리소스의 변수 선언을 try문 괄호 안에서 해야 했다.
		 * 따라서 리소스가 외부에 선언되고 생성된 경우에도 다른 참조 변수로 괄호 안에 다시 선언해야 했다.
		 * 하지만 자바 9부터는 다음처럼 try문의 괄호 안에서 외부에서 선언한 변수를 쓸 수 있다.
		 * 이렇게 사용하면 가독성도 좋고 반복하여 선언하는 일도 줄어든다.
		 * AutoCloseObj obj = new AutoCloseObj();
		 * try (obj) {
		 * 	throw new Exception();
		 * } catch (Exception e) {
		 * 	System.out.println("예외 부분입니다.");
		 * }
		 */
	}

}
