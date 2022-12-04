package interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	//�������̽��� ������ ������ �������ϸ� ����� ��ȯ�Ѵ�.
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);//�������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��
	
	/*
	 * ����Ʈ �޼���� �� �״�� �⺻���� �����Ǵ� �޼���.
	 * ����Ʈ �޼���� �������̽����� ����������, ���� �������̽��� ������ Ŭ������ �����Ǹ� �� Ŭ�������� ����� �⺻ ����̴�.
	 */
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
//		myMethod();
	}
	
	/*
	 * ���� �޼���� Ŭ���� ������ �����ϰ� ����� �� �ִ�.
	 * ���� �޼��带 ����� ���� �������̽� �̸����� ���� �����Ͽ� ����Ѵ�.
	 */
	static int total(int[] arr) {
		int total = 0;
		
		for (int i : arr) {
			total += i;
		}
		
//		myStaticMethod();
		
		return total;
	}
	
	/*
	 * �ڹ� 9���� �������̽��� private �޼��带 ������ �� �ִ�.
	 * private �޼���� �������̽��� ������ Ŭ�������� ����ϰų� �������� �� ����.
	 * ���� ������ ������ �ڵ带 �������� �ʰ� �������̽��� ������ Ŭ�������� �������� ����ϴ� ��쿡 private �޼���� �����ϸ� �ڵ� ���뼺�� ���� �� �ִ�.
	 * ���� Ŭ���̾�Ʈ ���α׷��� ������ �⺻ ����� private �޼���� �����ϱ⵵ �Ѵ�.
	 */
//	private void myMethod() {
//		System.out.println("private �޼����Դϴ�.");
//	}
//	
//	private static void myStaticMethod() {
//		System.out.println("private static �޼����Դϴ�.");
//	}
}
