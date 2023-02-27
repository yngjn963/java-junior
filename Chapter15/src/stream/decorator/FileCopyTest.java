package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������� �� ����Ʈ�� ���� ������ �̷������ �׸�ŭ ���α׷� ���� �ӵ��� ��������.
 * Buffered ��Ʈ���� ���������� 8,192����Ʈ ũ���� �迭�� ������ ������ �̹� ������ ��Ʈ���� �迭 ����� �߰��� �� ������ ������� ������ �� �ִ� ���۸� ����� �����Ѵ�.
 * �翬�� �� ����Ʈ�� �� ���� ������ ó���� ������ �ξ� ������ ó���� �� �ִ�.
 * ���۸� ����� �����ϴ� ��Ʈ�� Ŭ����
 * BufferedInputStream	: ����Ʈ ������ �д� ��Ʈ���� ���۸� ����� �����Ѵ�.
 * BufferedOutputStream	: ����Ʈ ������ ����ϴ� ��Ʈ���� ���۸� ����� �����Ѵ�.
 * BufferedReader		: ���� ������ �д� ��Ʈ���� ���۸� ����� �����Ѵ�.
 * BufferedWriter		: ���� ������ ����ϴ� ��Ʈ���� ���۸� ����� �����Ѵ�.
 */

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		
		try (FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("copy.zip")) {
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}

}
