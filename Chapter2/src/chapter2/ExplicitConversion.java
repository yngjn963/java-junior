package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;	//�� �Ǽ��� ���� �� ��ȯ�Ǿ� ������
		int iNum4 = (int)(dNum1 + fNum2);		//�� �Ǽ��� ���� ���� ���ǰ� �� ��ȯ��
		System.out.println(iNum3);
		System.out.println(iNum4);
		//11��� 12���� ���� ����� �ٸ���.
		//11�࿡���� �� �Ǽ��� ���� ��������� �� ��ȯ�� �Ͼ��. ���� 1�� 0���� ��ȯ�� �� ���� ���Ͽ� ��� ���� 1�� �ȴ�.
		//������ 12�࿡���� �� dNum1�� fNum2�� ���� ���� ����Ѵ�. �̶� �� �Ǽ��� �ڷ����� �ٸ�����, float���� double������ ��ȯ�Ǵ� ������ �� ��ȯ�� �Ǿ� ��� ���� 2�� �ȴ�.
	}

}
