package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	//�� ������ �� ��(((num1 = num1 + 10) < 10))�� ��� ���� �����̹Ƿ� ((i = i + 2) < 10) �� ������ ������� ����
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//�� �ּ�ó�� ((i = i + 2) < 10) ������ �ƿ� �������� ���� �ʱ� ������ i ���� ����� ���� ���� �������� �ʾҴ�.
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);			//�� �տ��� �� ��(((num1 = num1 + 10) > 10))�� ��� ���� ���̹Ƿ� ((i = i + 2) < 10) �� ������ ������� ����
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//�� �ּ�ó�� ((i = i + 2) < 10) ������ �ƿ� �������� ���� �ʱ� ������ i ���� ����� ���� ���� �������� �ʾҴ�.
		//��ó�� �� �� ����� �� �� ������ �� �� �� ���� ��� �������� �ʴ��� ��� ���� �� �� �ִ� ��쿡, ������ ���� ������� �ʴ� ���� �ܶ� ȸ�� ��(Short Circuit Evaluation: SCE)��� �Ѵ�.
	}

}
