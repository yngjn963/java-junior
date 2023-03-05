package stream.others;

import java.io.File;
import java.io.IOException;

/*
 * File Ŭ����
 * File Ŭ������ ���״�� �����̶�� ������ �߻�ȭ�� Ŭ�����̴�.
 * ���Ͽ� ���� ������� ���ݱ��� ��� ��Ʈ���� ����Ͽ� �����Ѵ�.
 * ���� File Ŭ������ ������ ����� ����� ������ ���� ��ü�� ��γ� ������ �� �� �ְ� ������ ������ ���� �ִ�.
 */

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\easyspub\\JAVA_LAB\\Chapter15\\newFile.txt"); // �ش� ��ο� File Ŭ���� ����. ���� ���� ������ ������ ���� �ƴ�
		file.createNewFile(); // ���� ���� ������
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite()); // ������ �Ӽ����� ���캸�� �޼��� ȣ���Ͽ� ���
		
		file.delete(); // ���� ����
	}

}
