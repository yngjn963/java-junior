package loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for (i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		for (i = 1; i <= 10; i++) {
			System.out.println("�ȳ��ϼ���" + i);
		}
		
		//for�� ��� �����ϱ�
		//�ʱ�ȭ�� ����
		for (; i < 5; i++) {
			
		}
		//���ǽ� ����
		for (i = 0; ; i++) {
			if (sum > 200) break;
		}
		//������ ����
		//�������� ������ �����ϰų� �ٸ� ������ ���� ��� ���� �¿�ȴٸ� �������� �����ϰ� for�� �ȿ� �� �� �ִ�.
		for (i = 0; i < 5;) {
			i = (++i) % 10;
		}
		//��� ��� ����
		//���� �ݺ�
		for (; ;) {
			
		}
	}

}
