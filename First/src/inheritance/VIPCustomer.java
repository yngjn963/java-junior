package inheritance;

public class VIPCustomer extends Customer {
//	private int customerID;			//�� ���̵�
//	private String customerName;	//�� �̸�
//	private String customerGrade;	//�� ���
//	int bonusPoint;					//���ʽ� ����Ʈ
//	double bonusRatio;				//���� ����
	
	private int agentID;		//VIP �� ��� ���� ���̵�
	double saleRatio;			//������
	
	public VIPCustomer() {
		/*
		 * ���� Ŭ���� �����ڸ� ȣ���ߴµ� ���� Ŭ���� �����ڰ� ȣ��Ǵ� ������ ���� Ŭ���� �����ڿ��� super()�� �ڵ����� ȣ���ϱ� �����̴�.
		 * super()�� ȣ���ϸ� ���� Ŭ������ ����Ʈ �����ڰ� ȣ��ȴ�.
		 * ���� Ŭ������ ����Ʈ �����ڴ� ����Ʈ �ڵ�� ��ȯ�Ǳ� ���� �ڵ����� ����ȴ�.
		 */
		super();	//�����Ϸ��� �ڵ����� �߰��ϴ� �ڵ�. ���� Ŭ������ Customer()�� ȣ���.
//		customerGrade = "VIP";		//���� Ŭ�������� private �����̹Ƿ� ���� �߻�
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ�� ");	//���� Ŭ���� ������ �� �ܼ� ��¹�
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);	//������ ����
//	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showVIPInfo() {
//		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	/*
	 * ���� Ŭ�������� ������ ��� ������ �޼��带 ���� Ŭ�������� ������ ���� super�� ����Ѵ�.
	 * super ������ ���� Ŭ������ ���� ���� ������ �����Ƿ� �� �ڵ�ó�� ����ϸ� �� ������ ����ϴ� showCustomerInfo() �޼��带 ���� �������� �ʰ� ���� Ŭ������ ���� ������ Ȱ���� �� �ִ�.
	 * ���� �� �ڵ��� showVIPInfo() �޼��忡���� ���� super.showCustomerInfo()��� ȣ������ �ʾƵ� ���� Ŭ������ �޼��尡 �� ȣ��ȴ�.
	 * ���� Ŭ�������� ������ �̸��� ���� Ŭ���� �޼��带 ����ų �� super.showCustomerInfo()��� ��� �Ѵ�.
	 */
//		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
//	}
	
	/*
	 * Customer vc = new VIPCustomer(); ������ ����Ǹ� VIPCustomer �����ڰ� ȣ��ǹǷ� Ŭ���� ������ �޸𸮿� ���������.
	 * �׷��� Ŭ������ �ڷ����� Customer�� �����Ǿ���.
	 * Ŭ������ �� ��ȯ�� �Ǿ��� ���� ������ Ŭ�������� ����Ͽ� ��� ������ �޼��忡 ������ �� �ִ�.
	 * ���� �� vc ���� ������ ����ų �� �ִ� ������ �޼���� Customer Ŭ������ ������̴�.
	 * 
	 * �̷��� Ŭ���� �� ��ȯ�� ����ϴ� ������ �޼��� �������̵��� ������.
	 * ���� Ŭ������ �ν��Ͻ��� ���� Ŭ������ �� ��ȯ�Ǵ� ������ ���������� �̷�����ٸ� �����ϸ� �ȴ�.
	 */
}
