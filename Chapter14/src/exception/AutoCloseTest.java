package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) {
			
		} catch (Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
		/*
		 * try (A a = new A(); B b = new B()) {
		 * 	...
		 * } catch (Exception e) {
		 * 	...
		 * }
		 * �� ������ ���ܰ� �߻����� �ʰ� ���� ����Ǵµ� ��� ����� ���� close() �޼��尡 ȣ��Ǿ� ������ ��µ� ���� �� �� �ִ�.
		 * ���ҽ��� ���� �� �����ؾ� �Ѵٸ� ���� �ݷ����� �����Ѵ�.
		 */
	}

}
