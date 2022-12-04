package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		/*
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 * src : ������ �迭 �̸�
		 * srcPos : ������ �迭�� ù ��° ��ġ
		 * dest : �����ؼ� �ٿ� ���� ��� �迭 �̸�
		 * destPos : �����ؼ� ��� �迭�� �ٿ� �ֱ⸦ ������ ù ��° ��ġ
		 * length : src���� dest�� �ڷḦ ������ ��� ����
		 */
		System.arraycopy(array1, 0, array2, 1, 4);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		/*
		 * 1
		 * 10
		 * 20
		 * 30
		 * 40
		 */
	}

}
