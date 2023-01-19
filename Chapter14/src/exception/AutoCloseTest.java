package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) {
			
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
		/*
		 * try (A a = new A(); B b = new B()) {
		 * 	...
		 * } catch (Exception e) {
		 * 	...
		 * }
		 * 위 예제는 예외가 발생하지 않고 정상 종료되는데 출력 결과를 보면 close() 메서드가 호출되어 문장이 출력된 것을 알 수 있다.
		 * 리소스를 여러 개 생성해야 한다면 세미 콜론으로 구분한다.
		 */
	}

}
