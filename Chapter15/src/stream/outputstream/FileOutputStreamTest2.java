package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
//		FileOutputStream fos = new FileOutputStream("output2.txt", true); // �ڹ� 9���� �����ϴ� ���� try-with-resource��
//		try (fos) {
		try (FileOutputStream fos = new FileOutputStream("output2.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A'�� �ƽ�Ű ��
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs); // �迭�� �Ѳ����� ���
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
