package singleton;

public class Company {
	/*
	 * ��ü ���� ���α׷����� �ν��Ͻ��� �� �ϳ��� �����ϴ� ������ ������ �̱��� �����̶�� �Ѵ�.
	 * �̱��� �������� ȸ�� Ŭ���� �����ϱ�
	 * �ܰ� 1 : �����ڸ� private���� �����
	 * �ܰ� 2 : Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����ϱ�
	 */
	private static Company instance = new Company();	//�����ϰ� ������ �ν��Ͻ�
	private Company() {
		
	}
	/*
	 * �ܰ� 3 : �ܺο��� ������ �� �ִ� public �޼��� �����
	 */
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
