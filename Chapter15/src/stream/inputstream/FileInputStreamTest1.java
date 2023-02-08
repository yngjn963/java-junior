package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream
 * ����Ʈ ������ �д� ��Ʈ�� �� �ֻ��� ��Ʈ���̴�.
 * InputStream�� �߻� �޼��带 ������ �߻� Ŭ�����μ� ���� Ŭ���� ��Ʈ�� Ŭ������ ��ӹ޾� �� Ŭ���� ���ҿ� �°� �߻� �޼��� ����� �����Ѵ�.
 * (OutputStream, Reader, Writer�� �߻� Ŭ�����̰�, ���� Ŭ������ �����ؾ� �� �߻� �޼��尡 ����Ǿ� �ִ�.)
 * �ַ� ����ϴ� ���� Ŭ����
 * 	   ��Ʈ�� Ŭ����							����
 * FileInputStream			���Ͽ��� ����Ʈ ������ �ڷḦ �д´�.
 * ByteArrayInputStream		Byte �迭 �޸𸮿��� ����Ʈ ������ �ڷḦ �д´�.
 * FilterInputStream		��� ��Ʈ������ �ڷḦ ���� �� �߰� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ�����̴�.
 * 
 * InputStream�� ����Ʈ �ڷḦ �б� ���� ���� �޼��带 �����Ѵ�.
 * 		�޼���													����
 * int read()							�Է� ��Ʈ�����κ��� �� ����Ʈ�� �ڷḦ �д´�. ���� �ڷ��� ����Ʈ ���� ��ȯ�Ѵ�.
 * int read(byte b[])					�Է� ��Ʈ�����κ��� b[] ũ���� �ڷḦ b[]�� �д´�. ���� �ڷ��� ����Ʈ ���� ��ȯ�Ѵ�.
 * int read(byte b[], int off, int len)	�Է� ��Ʈ�����κ��� b[] ũ���� �ڷḦ b[]�� off ���� ��ġ���� �����ϸ� len��ŭ �д´���. ���� �ڷ��� ����Ʈ ���� ��ȯ�Ѵ�.
 * void close()							�Է� ��Ʈ���� ����� ��� ���ҽ��� �ݴ´�.(��: FileInputStream�� ��� ���� ����)
 * read() �޼����� ��ȯ���� int�̴�.
 * �� ����Ʈ�� �д� �� ��ȯ���� int�� ������ �� �̻� �о� ���� �ڷᰡ ���� ��쿡 ���� -1�� ��ȯ�Ǳ� �����̴�.
 * ���Ͽ��� �ڷḦ �д� ��� ������ ���� �����ϸ� -1�� ��ȯ�ȴ�.
 * 
 * FileInputStream
 * FileInputStream�� ���Ͽ��� ����Ʈ ������ �ڷḦ �о� ���� �� ����ϴ� ��Ʈ�� Ŭ����
 * FileInputStream ������
 * 			������									����
 * FileInputStream(String name)	���� �̸� name(��� ����)�� �Ű������� �޾� �Է� ��Ʈ���� �����Ѵ�.
 * FileInputStream(File f)		File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ���� �����Ѵ�.
 */

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
