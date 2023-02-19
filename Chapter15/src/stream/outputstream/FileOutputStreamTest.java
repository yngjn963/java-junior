package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * OutputStream
 * ����Ʈ ������ ���� ��Ʈ�� �� �ֻ��� ��Ʈ��
 * 	    ��Ʈ�� Ŭ����						����
 * FileOutputStream			����Ʈ ������ ���Ͽ� �ڷḦ ����.
 * ByteArrayOutputStream	Byte �迭�� ����Ʈ ������ �ڷḦ ����.
 * FilterOutputStream		��� ��Ʈ������ �ڷḦ �� �� �߰� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ�����̴�.
 * 
 * FileOutputStream
 * ������ �Ű������� ������ ������ ��ο� ������ FileOutputStream�� ������ ���� �����Ѵ�.
 * ���Ͽ� �ڷḦ �� �� ���� ������ ������ �ִ��� ó������ ���� ����(overwrite), �ƴϸ� ���� ���� �� �ڿ� �����ؼ� �� ������(append) ���θ� FileOutputStream �������� �Ű������� �����Ѵ�.
 * ��Ʈ�� �����ڿ��� append ���� ����Ʈ�� false�̴�.
 */

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65); // FileOutputStream�� ���Ͽ� ���ڸ� ���� �ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ��
			fos.write(66);
			fos.write(67);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
