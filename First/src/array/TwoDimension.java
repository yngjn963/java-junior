package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};	//������ �迭 ����� ���ÿ� �ʱ�ȭ
		//2�� 3���� ������ �迭(new int[2][3])
		
		for (int i = 0; i < arr.length; i++) {	//��ü �迭 ������ arr.length�� ���� ������ ��Ÿ����.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();	//�� ��� ���� �� �� �� ���
		}
	}

}
