package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); // �迭�� �� ��° ��ġ���� 10�� ����Ʈ ���
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
	/*
	 * flush() �޼���� close() �޼���
	 * ��� ��Ʈ������ flush() �޼����� ����� ������ �ڷḦ ����ϴ� ���̴�.
	 * write() �޼���� ���� ��ٰ� �ص� �ٷ� �����̳� ��Ʈ��ũ�� ���۵��� �ʰ� ����� ���� �ڷᰡ ���̴� ��� ���ۿ� ��� ���� �ڷᰡ �𿩾� ��µȴ�.
	 * ���� �ڷ��� ���� ����� ��ŭ ���� ������ write() �޼���� ����߾ ���Ͽ� ������ �ʰų� ���۵��� ���� �� �ִ�.
	 * �̷� ��� flush() �޼��带 ȣ���Ѵ�.
	 * ��� ��Ʈ���� close() �޼��� �ȿ��� flush() �޼��带 ȣ���Ͽ� ��� ���۰� ������鼭 ���� �ִ� �ڷᰡ ��� ��µȴ�.
	 */

}
