package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer("10030", "������", 2000);
//		vc.calcPrice(10000);
		/*
		 * calcPrice()�� ���� Ŭ�������� �����ǵ� �޼����̸� Customer Ŭ������ VIPCustomer Ŭ������ ��� �����Ѵ�.
		 * �׷��ٸ� vc.calcPrice(10000)�� � Ŭ������ �޼��带 ȣ���ұ�?
		 */
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(10000) + "���Դϴ�.");
		/*
		 * ��� ������ �޼���� ������ Ŭ�������� ���� ȣ��ȴ�.
		 * �׷��� vc.calcPrice(10000)�� �翬�� ������ Ŭ�������� Customer Ŭ������ calcPrice() �޼��带 ȣ���ؾ� �Ѵ�.
		 * �׷��� ��� ����� 9,000���̴�.
		 * VIPCustomer Ŭ������ calcPrice() �޼���, �� �����ǵ� �޼��尡 ȣ��Ǿ���.
		 * 
		 * ��ӿ��� ���� Ŭ������ ���� Ŭ������ ���� �̸��� �޼��尡 ������ �� ȣ��Ǵ� �޼���� �ν��Ͻ��� ���� �����ȴ�.
		 * �ٽ� ���� ������ Ŭ�������� �ƴ� ������ �ν��Ͻ��� �޼��带 ȣ���ϴ� ���̴�.
		 * �̷��� �ν��Ͻ��� �޼��尡 ȣ��Ǵ� ����� '���� �޼���'��� �Ѵ�.
		 * ���� �޼��尡 ����Ǵ� ������ �����ϸ� �� vc.calcPrice(10000)�� Customer Ŭ������ �޼��尡 �ƴ� ������ �ν��Ͻ�, �� VIPCustomer�� �޼��带 ȣ���ϴ��� ������ �� �ִ�.
		 */
	}

}
