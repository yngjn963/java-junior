package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;			//���ӿ��� ȹ���� ������ 150��
		
		int lastScore1 = ++gameScore;	//gameScore�� 1��ŭ ���� ���� lastScore1�� ����
		System.out.println(lastScore1);	//151
		
		int lastScore2 = --gameScore;	//gameScore���� 1��ŭ �� ���� lastScore2�� ����
		System.out.println(lastScore2);	//150
		
		/*
		 * ����,���� �������� ��ġ
		 * ����,���� �����ڰ� �ǿ����� �տ� ������ ������ ������ ���� �ǿ����� ���� �����ϰų� �����Ѵ�.
		 */
		int value = 10;
		int num = ++value;	//num�� 11�� ���Ե�
		//�� �ڵ忡�� ���� �����ڰ� �ǿ����� value �տ� �ִµ� �̶� num ���� 11�� �ȴ�.
		/*
		 * �ݴ�� ����,���� �����ڰ� �ǿ����� �ڿ� ������ ������ ���� �Ŀ� �ǿ����� ���� �����ϰų� �����Ѵ�.
		 */
		int value2 = 10;
		int num2 = value2++;	//num2�� 10�� ���Ե�
		//�� �ڵ�ó�� ���� �����ڰ� �ǿ����� value �ڿ� ������ value ���� num�� ���� ������ �� 1�� ���ϱ� ������ num ���� 10�� �ȴ�.
	}

}
