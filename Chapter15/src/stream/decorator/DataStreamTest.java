package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream�� DataOutputStream
 * ���ݱ��� ���캻 ��Ʈ���� ����� �а� ���� �ؽ�Ʈ ������ �ڷḦ �ٷ����.
 * ���ݺ��� ��� DataInputStream�� DataOutputStream�� �޸𸮿� ����� 0, 1 ���¸� �״�� �аų� ����.
 * �׷��� �ڷ����� ũ�Ⱑ �״�� �����޴�.
 * 
 * �ڷ����� �״�� �а� ���� ��Ʈ���̱� ������ ���� ������ �ڷ����� ���� �ٸ��� ó���Ѵ�.
 * �� writeByte(100)�� 1����Ʈ�� ���� 100�� �ǹ�������, writeInt(100)�� 4����Ʈ�� ���� 100�� �ǹ��Ѵ�.
 * ���� �ڷḦ �� �� ����� �޼���� ���� �ڷ����� �޼���� �о�� �Ѵ�.
 * �� ���� 100�� ���� �� writeInt(100)�� ���� readByte()�� ������ ���� ����� �޸� ũ�Ⱑ �޶� ���� ���� ������ �� ����.
 * �� �����̵� ��Ʈ��ũ�� �ڷḦ �� �� ����� �޼��� ������� �о�� �Ѵ�.
 */

public class DataStreamTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * �ڹ� ����� ��Ʈ���� ���ڷ����� �����̴�.
		 * ���� ��Ʈ���� �ڹ� ����� ��Ʈ�� Ŭ������ �������̰� ȿ�������� ����� �߰��ϰų� ������ �� �ִ� Ŭ�����̴�.
		 * �̷��� ������ ������ ���Ͽ����� '���ڷ����� ����'�̶�� �Ѵ�.
		 * �ڹ��� ����� ��Ʈ�� Ŭ������ ���ڷ����� ���� �����̴�.
		 * ���ڷ����� ���Ͽ��� Ŭ������ ������ ������� ������ Ŭ������ �׷��� ���� Ŭ������ ���еȴ�.
		 * �տ��� �̾߱��� Ŀ��, ����, �÷��� ������ ����.
		 * ������ �÷��� Ŀ�ǿ� �߰� ����� �����ϴ� ������ �ߴ�.
		 * �̷��� �߰� ����� �����ϴ� Ŭ������ ���� ������ �ϴ� Ŭ������ �����ؼ� �����ؾ� �Ѵ�.
		 * 
		 * �̷��� ����� �������� �߰��Ǵ� Ŭ������ ���ڷ�����(�����)��� �Ѵ�.
		 * �ڹ��� ��Ʈ�� Ŭ������ ���� ���ڷ����� Ŭ������ �߰��Ǵµ� �̵� ���ڷ����ʹ� �ϳ��� Ŭ������ �������� �ʰ� ���� Ŭ������ �پ��ϰ� ������ �� �ִ�.
		 * ���� ��� BufferedReader�� FileReader�� ���� ���� ������ �� �ٸ� ���� ��Ʈ�� InputStreamReader�� ���μ� ����� ���� �� �ִ�.
		 * �� ���� ��Ʈ���� �ڷ����� �´´ٸ� �� �ٸ� ���� ��Ʈ���� ����� ���� �� �� �ִ�.
		 * 
		 * WhippedCreadCoffee whippedCreamCoffee = new WhippedCreamCoffee(new MochaCoffee(new LatteCoffee(new KenyaCoffee())));
		 * ���� ���� ����� ���� ũ���� �ö� ��ī Ŀ�ǰ� ���������.
		 * ���� Ŀ�Ǵ� KenyaCoffee�̰� ������ Ŭ������ ���ڷ������̴�.
		 */
	}

}
