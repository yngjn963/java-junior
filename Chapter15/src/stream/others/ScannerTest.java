package stream.others;

import java.util.Scanner;

/*
 * �� �� �Է� Ŭ����
 * Scanner Ŭ����
 * Scanner Ŭ������ java.util ��Ű���� �ִ� �Է� Ŭ�����̴�.
 * Scanner Ŭ������ ���ڻ� �ƴ϶� ����, �Ǽ� �� �ٸ� �ڷ����� ���� �� �ִ�.
 * ���� �ܼ� ȭ��� �ƴ϶� �����̳� ���ڿ��� �������� �Ű������� �޾� �ڷḦ �о� �� �� �ִ�.
 * Scanner Ŭ������ ��ǥ ������
 * 		  ������									����
 * Scanner(File source)				������ �Ű������� �޾� Scanner�� �����Ѵ�.
 * Scanner(InputStream source)		����Ʈ ��Ʈ���� �Ű������� �޾� Scanner�� �����Ѵ�.
 * Scanner(String source)			String�� �Ű������� �޾� Scanner�� �����Ѵ�.
 * 
 * Scanner scanner = new Scanner(System.in)ó�� ����ϸ� ǥ�� �Է����κ��� �ڷḦ �о� ���̴� ����� ����� �� �ִ�.
 * Scanner Ŭ������ System.in���� �Է¹޴� �ͺ��� �پ��� �޼��带 Ȱ���� �� �ֱ� ������ ���� ����ϴ� Ŭ�����̴�.
 */

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�:");
		String name = scanner.nextLine();
		System.out.println("����:");
		String job = scanner.nextLine();
		System.out.println("���:");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		// ǥ�� �Է� System.in�� ����ϸ� ����Ʈ ���� �ڷḸ ó���� �� �־� �ѱ� ���� ��� ���� ��Ʈ���� �߰��� ����ؾ� �ϴµ�,
		// Scanner�� �پ��� �ڷ����� �Է��� �� �־� ���� Ȱ���Ѵ�.
	}

}
