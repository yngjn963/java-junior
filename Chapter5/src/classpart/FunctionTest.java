package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);	//add() �Լ� ȣ��
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�.");
	}

	private static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;	//��� �� ��ȯ
	}
	//�Լ��� ȣ���ϸ� �� �Լ����� ���� �޸� ������ �Ҵ�Ǵµ�, �� �޸� ������ ����(stack)�̶�� �θ���.
	//add() �Լ��� ȣ���ϸ鼭 �޸𸮸� �����ϴ� ����
	//num1, num2, sum - 1. main() �Լ��� ����� �޸� ������ ���ÿ� ������
	// - 2. main()���� add() ȣ��
	//n1, n2, result - 3. add() �Լ��� ����� �޸� ������ ���ÿ� ������
	//add() �Լ� ������ ������ �Լ��� �Ҵ��ߴ� �޸� ������ �����ϴ� ����
	// - 1. add() �Լ��� ����� �޸� ������ �ڵ����� �����
	// - 2. add() ���� �� �޸� ����
	// num1, num2, sum - 3. main() �Լ�
}
