package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�Ǹ��ϱ�");
	}
	
	/*
	 * ����Ʈ �޼��尡 �ߺ��Ǿ����� �� �������̽��� �����ϴ� Customer Ŭ�������� �������Ѵ�.
	 * Customer Ŭ�������� ����Ʈ �޼��带 �������ϸ�, Customer Ŭ������ �����Ͽ� ����� �� �����ǵ� �޼��尡 ȣ��ȴ�.
	 */
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}

}
