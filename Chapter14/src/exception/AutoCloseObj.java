package exception;

/*
 * �ڹ� 7���� try-with-resources���� �����Ͽ� close() �޼��带 ��������� ȣ������ �ʾƵ� try ��� ������ ���� ���ҽ��� �ڵ����� �ݵ��� ���� �� �ִ�.
 * try-with-resources ������ ����Ϸ��� �ش� ���ҽ��� AutoCloseable �������̽��� �����ؾ� �Ѵ�.
 * FileInputStream Ŭ������ Closeable�� AutoCloseable �������̽��� �����ߴ�.
 * ���� �ڹ� 7���ʹ� try-with-reources ������ ����ϸ� FileInputStream�� ����� �� close()�� ��������� ȣ������ �ʾƵ�
 * ������ ���� ���ܰ� �߻��� ��� ��� close() �޼��尡 ȣ��ȴ�.
 * FileInputStream �̿ܿ� ��Ʈ��ũ(socket)�� �����ͺ��̽�(connection) ���� Ŭ������ AutoCloseable �������̽��� �����ϰ� �ִ�.
 */

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}

}
