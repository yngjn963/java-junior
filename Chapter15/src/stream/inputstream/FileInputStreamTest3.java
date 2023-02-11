package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
//				for (byte b : bs) {
				for (int j = 0; j < i; j++) { // ��ü �迭�� ����ϴ� ���� �ƴ� ����Ʈ ����ŭ, �� i ������ŭ ����ϵ��� �Ѵ�.
					System.out.println((char)bs[j]);
				}
				System.out.println(": " + i + "����Ʈ ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		/*
		 * �������� 6����Ʈ�� �о��µ� ��� ���� Z ���Ŀ� QRST�� �� ��µǾ���.
		 * bs �迭�� ���� �� ��° ���� �� K~T���� 10�� ���ĺ��� �����ߴ�.
		 * �׷��� ���� ���������� U~Z���� ������ �� ���� �о� ���� 6�� �ܿ� ���� 4�� �������� ���� �ڷᰡ ���� �ִ�.
		 * ���� 6���� �о��µ� bs ��ü�� ����ϸ� QRST�� �� ��µǴ� ���̴�.
		 */
	}

}
