package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("�ȳ��ϼ���. �� �����׿�");	// ���ڿ� ���
			fw.write(buf, 1, 2);			// ���� �迭�� �Ϻ� ���
			fw.write("65");					// ���ڸ� �״�� ���
			/*
			 * �տ��� FileOutputStream�� ������� �� ���� 65�� ����ϸ� 65�� �ƽ�Ű �ڵ� ���� �ش��ϴ� A�� ������.
			 * �̴� �� ����Ʈ�� �ؼ��Ǿ� ��µǱ� �����̴�.
			 * ���� �׳� ���� 65�� ����ϰ� �ʹٸ� 15��� ���� FileWriter�� Ȱ���Ѵ�.
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
