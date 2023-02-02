package stream.others;

import java.io.Console;

/*
 * Console Ŭ����
 * System.in�� ������� �ʰ� ������ �ܼ� ������ ���� �� �ִ� Console Ŭ������ �ִ�.
 * ���� �ܼ� â���� �ڷḦ �Է¹��� �� �� Ŭ������ ����ϴµ�, ��Ŭ�����ʹ� �������� �ʴ´�.
 * 		�޼���							����
 * String readLine()		���ڿ��� �д´�.
 * char[] readPassword()	����ڿ��� ���ڿ��� ���� ���� �ʰ� �д´�.
 * Reader reader()			Reader Ŭ������ ��ȯ�Ѵ�.
 * PrintWriter writer()		PrintWriter Ŭ������ ��ȯ�Ѵ�.
 */

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("�̸�:");
		String name = console.readLine();
		System.out.println("����:");
		String job = console.readLine();
		System.out.println("��й�ȣ:");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
