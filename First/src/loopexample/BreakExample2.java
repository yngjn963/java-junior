package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for (num = 0; ; num++) {	//���ǽ��� �����ϴ� ��� break���� ����Ѵ�.
			sum += num;
			if (sum >= 100) {		//sum�� 100���� ũ�ų� ���� ��(���� ����)
				break;				//�ݺ��� �ߴ�
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		//break���� ��ġ
		while (0 == 0) {
			while (1 == 1) {
				if (2 == 2) {	//���ǿ� �ش��ϴ� ���
					break;		//���� �ݺ����� ��������
				}
			}
		}
	}

}
