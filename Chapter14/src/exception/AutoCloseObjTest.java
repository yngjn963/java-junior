package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
		/*
		 * ��� ����� ���� ���ҽ��� close() �޼��尡 ���� ȣ��ǰ� ���� ��� �κ��� ����Ǵ� ���� �� �� �ִ�.
		 * ��ó�� try-with-resources���� ����ϸ� close() �޼��带 ��������� ȣ������ �ʾƵ� ���� ����� ���� ���ܰ� �߻��� ��� ��� ���ҽ��� �� �����ȴ�.
		 * 
		 * ���� try-with-resources�� : �ڹ� 9���� ���
		 * �ڹ� 7������ AutoCloseable �������̽��� ������ ���ҽ��� ���� ������ try�� ��ȣ �ȿ��� �ؾ� �ߴ�.
		 * ���� ���ҽ��� �ܺο� ����ǰ� ������ ��쿡�� �ٸ� ���� ������ ��ȣ �ȿ� �ٽ� �����ؾ� �ߴ�.
		 * ������ �ڹ� 9���ʹ� ����ó�� try���� ��ȣ �ȿ��� �ܺο��� ������ ������ �� �� �ִ�.
		 * �̷��� ����ϸ� �������� ���� �ݺ��Ͽ� �����ϴ� �ϵ� �پ���.
		 * AutoCloseObj obj = new AutoCloseObj();
		 * try (obj) {
		 * 	throw new Exception();
		 * } catch (Exception e) {
		 * 	System.out.println("���� �κ��Դϴ�.");
		 * }
		 */
	}

}
