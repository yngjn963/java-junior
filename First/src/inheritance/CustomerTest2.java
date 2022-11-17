package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer();	//���� Ŭ���� ����
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		/*
		 * ��� ȭ���� ���� ���� Ŭ������ Customer() �����ڰ� ���� ȣ��ǰ� �� ������ VIPCustomer()�� ȣ��Ǵ� ���� �� �� �ִ�.
		 * �����ϸ� ���� Ŭ������ ��ӹ��� ���� Ŭ������ ������ ���� �ݵ�� ���� Ŭ������ �����ڰ� ���� ȣ��ȴ�.
		 * �׸��� ���� Ŭ���� �����ڰ� ȣ��� �� ���� Ŭ������ ��� ������ �޸𸮿� �����Ǵ� ���̴�.
		 * ���� Ŭ���� VIPCustomer�� ������ �� �޸� ������
		 * �� �޸�
		 * customerID	-|
		 * customerName	 |
		 * customerGrade |- 1. Customer() ������ ȣ�� -> Customer Ŭ������ ��� ������ �޸𸮿� ������
		 * bonusPoint	 |
		 * bonusRatio	-|
		 * agentID		-|
		 * salesRatio	-|- 2. VIPCustomer() ������ ȣ�� -> VIPCustomer Ŭ������ ��� ������ �޸𸮿� ������
		 */
	}

}
