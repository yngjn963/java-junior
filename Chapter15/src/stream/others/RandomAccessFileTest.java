package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile Ŭ����
 * RandomAccessFile�� ����� Ŭ���� �� �����ϰ� ���� ������� ���ÿ� �� �� �ִ� Ŭ�����̴�.
 * ���� ���ݱ��� ��� ��Ʈ���� ó������ ���ʷ� �ڷḦ �о����� RandomAccessFile�� ������ ��ġ�� �̵��Ͽ� �ڷḦ ���� �� �ִ�.
 * RandomAccessFile���� ���� �����Ͱ� �ִµ�, ���� �� ������ ��� ��ġ���� �а� ������ �� ��ġ�� ����Ű�� �Ӽ��̴�.
 * ��Ʈ���� �������� �ʰ� �����ϰ� ���Ͽ� �ڷḦ ���ų� ���� �� ����ϸ� �����ϴ�.
 * ���� �����Ͱ� �̵��ϴ� ��ġ�� ���� �ڷḦ �аų� ���̴� ��ġ�̹Ƿ� ���� �������� ��ġ�� �� �����ϸ� �����ؾ� �Ѵ�.
 * 
 * RandomAccessFile�� ������ ��ġ�� �аų� ���� ��� �ܿ��� �پ��� �ڷ��� ���� �аų� �� �� �ִ�.
 * �� ������ �����ϱ� ���� RandomAccessFile�� � �������̽��� �����ߴ��� JavaDoc���� ���캸��,
 * ������ �������̽��� DataInput, DataOutput�� �ִ�.
 * �̷� �������̽��� �����ϸ� RandomAccessFile Ŭ������ DataInputStream �� DataOutputStream�� ���� �پ��� �ڷ����� �ٷ�� �޼��带 ����� �� �ִ�.
 */

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		
		rf.seek(0); // �ڷḦ �б� ���� ������ �� ó������ �̵��Ͽ� ó������ ���ʷ� ���� �о�� �� �ִ�.
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		
		int i = rf.readInt(); // �ڷḦ �о�� ���� ������ �� ����� �ڷ����� �´� �޼���� �о�� �Ѵ�.
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		/*
		 * ������ �����ϱ� ���� ���� ���� �����Ϳ� ���� �˾ƺ���,
		 * ���Ͽ� �ڷḦ �аų� ���� ���� �����Ͱ� �̵��Ѵ�.
		 * ó�� RandomAccessFile Ŭ������ �����ϸ� ���� ������ ��ġ�� �� ��, �� 0�� ��ġ�� ����Ų��.
		 * int ���� �ϳ� ���� int ũ��� 4����Ʈ�̹Ƿ� ���� ������ ��ġ�� 4�� �̵��Ѵ�.
		 * �ٽ� ���� ���� �ڷḦ �аų� ����� ��ġ�� ��� �̵��ϴ� ���� ���� �������̴�.
		 * 
		 * RandomAccessFile�� ������ �� rw ��带 ����ߴ�.
		 * ���� �� ������ �а� ���Ⱑ ��� �����ϴ�.
		 * �پ��� �ڷ��� �޼��带 Ȱ���Ͽ� ���Ͽ� �ڷḦ ����ߴ�.
		 * �� �࿡�� �ڷḦ ����� ���� ���� ������ ��ġ�� Ȯ���ϸ�, �� �޼��尡 ȣ������ν� �̵��� ���� �������� ����
		 * rf.writeInt(100);		// int 4����Ʈ
		 * rf.writeDouble(3.14);	// double 8����Ʈ
		 * rf.writeUTF("�ȳ��ϼ���");	// ������ UTF-8 ��� �ѱ�(3����Ʈ) * 5 + null ����(2����Ʈ) = 17����Ʈ
		 * 
		 * ���Ⱑ ���� �� ���� ������ ��ġ�� 4 + 8 + 17 = 29�̴�.
		 * �׷��� ���⿡�� read() �޼��带 �ٷ� ȣ���ϸ� ������ ����.
		 * �ֳ��ϸ� ���� ������ ��ġ�� 29�� �ֱ� �����̴�.
		 * �츮�� �о�� �� ���� ��ġ�� �� ó���� 0�����̴�.
		 * ���� ���� ������ ��ġ�� �̵��� �ִ� seek() �޼��带 Ȱ���Ͽ� �� ó������ �̵��ؾ� �Ѵ�.
		 * 
		 */
	}

}
