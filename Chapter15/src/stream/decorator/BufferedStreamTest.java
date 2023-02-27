package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		
		try (FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
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
		/*
		 * Buffered ��Ʈ���� ��� ������ 8,192����Ʈ �迭�� ������ �ִ�.
		 * �� �� �� �ڷḦ ���� �� 8KB ������ �� ������ �а� �� �� �����Ƿ� 1����Ʈ�� �а� �� ������ �ξ� ���� ������ �����Ѵ�.
		 * �迭�� ũ��� Buffered ��Ʈ�� ������ �Ű������� ������ ���� �ִ�.
		 */
		
		/*
		 * ���� ��ſ��� ��Ʈ�� ����ϱ�
		 * ä�� ���α׷��� ����ٰ� ����.
		 * ä���� �Ϸ��� ������ ä�� Ŭ���̾�Ʈ ���α׷��� ���� ����� �ؾ� �Ѵ�.
		 * �ڹٴ� ����� ���� ���� Ŭ������ �����Ѵ�.
		 * ���� �����ϰ� ���� ����� �Ѵٰ� ������ ����.
		 * �����̶� ��ſ� ����ϴ� ��Ʈ��ũ ���� ���ҽ��̴�.
		 * ���� ����� ���� �ڹٴ� Socket Ŭ������ �����Ѵ�.
		 * Socket Ŭ�������� ��Ʈ���� ����ϴ� ����� ������ ����.
		 * Socket socket = new Socket();
		 * InputStream is = socket.getInputStream();
		 * 
		 * ���� ����� �ϱ� ���� ��Ʈ���� ������ ���� getInputStream()�̳� getOutputStream()�� ����ؾ� �Ѵ�.
		 * getInputStream() �޼��带 ȣ���ϸ� InputStream�� ��ȯ�ȴ�.
		 * �׷��� InputStream�� ����Ʈ ���� ��Ʈ���̹Ƿ� �ѱ��� ���� ������.
		 * ���� �̸� ���ڷ� ��ȯ�ؾ� �Ѵ�.
		 * �׸��� ���⿡ ���۸� ����� �߰��� �ָ� �� ������ �а� �� �� �ִ�.
		 * ������ �� ����� �߰��� ����� ��Ʈ�� �ڵ��̴�.
		 * Socket socket = new Socket();
		 * BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		 */
	}

}
