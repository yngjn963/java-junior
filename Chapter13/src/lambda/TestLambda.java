package lambda;

/*
 * �Լ��� ����ó�� ����ϴ� ���ٽ�
 * ���ٽ��� �̿��ϸ� ������ �Լ��� ����ó�� ����� �� �ִ�.
 * �츮�� ���α׷����� ������ ����ϴ� ���� ũ�� �� �����̴�.
 * 1. Ư�� �ڷ������� ���� ���� �� �� �����Ͽ� ����ϱ� ex) int a = 10;
 * 2. �Ű������� �����ϱ� ex) int add(int x, int y);
 * 3. �޼����� ��ȯ ������ ��ȯ�ϱ� ex) return num;
 * 
 * ���ٽ����� ������ �޼��嵵 ������ �����Ͽ� ����� �� �ְ�, �Ű������� �����ϰ� ��ȯ�� �� �ִ�.
 * 
 * �������̽��� ������ ���ٽ� �����ϱ�
 * 
 */

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);	//���ٽ��� �������̽��� ������ �����ϰ� �� ������ ����� ���ٽ� ������ ȣ��
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr); //�޼����� �Ű������� ���ٽ��� ������ ���� ����
		
		PrintString reStr = returnString(); //������ ��ȯ�ޱ�
		reStr.showString("hello ");			//�޼��� ȣ��
	}

	public static void showMyString(PrintString p) { //�Ű������� �������̽������� ����
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() { //��ȯ ������ ���̴� ���ٽ�
//		PrintString str = s -> System.out.println(s + "world");
//		return str;
		return s -> System.out.println(s + "world");
	}

}
