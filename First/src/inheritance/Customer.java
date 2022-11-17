package inheritance;

public class Customer {
	//���� Ŭ�������� �ۼ��� ������ �޼��� �� �ܺ� Ŭ�������� ����� �� ������ ���� Ŭ���������� ����� �� �ֵ��� �����ϴ� ���� �ٷ� protected�̴�.
//	private int customerID;			//�� ���̵�
	protected int customerID;		//�� ���̵�
//	private String customerName;	//�� �̸�
	protected String customerName;	//�� �̸�
//	private String customerGrade;	//�� ���
	protected String customerGrade;	//�� ���
	int bonusPoint;					//���ʽ� ����Ʈ
	double bonusRatio;				//���� ����
	
	public Customer() {
		customerGrade = "SILVER";	//�⺻ ���
		bonusRatio = 0.01;			//���ʽ� ����Ʈ �⺻ ���� ����
		System.out.println("Customer() ������ ȣ�� ");	//���� Ŭ���� ������ �� �ܼ� ��¹�
	}
	/*
	 * Customer Ŭ������ ����Ʈ �����ڸ� ���ְ� ���ο� �����ڸ� �ۼ��ϸ�, Customer Ŭ������ ��ӹ��� VIPCustomer Ŭ�������� ������ �߻��Ѵ�.
	 * ������ �߻��� ����Ʈ �����ڿ� ���콺�� �÷� ���� ������ ���� ���� �޽����� ���δ�.
	 * Implicit super constructor Customer() is undefined. Must explicitly invoke another constructor.
	 * �� ���� �޽����� ���������� ȣ��� ����Ʈ ������ Customer()�� ���ǵ��� �ʾұ� ������, �ݵ�� ��������� �ٸ� �����ڸ� ȣ���ؾ� �Ѵٴ� ���̴�.
	 * Customer Ŭ������ ���� ������ �� �� ID�� �� �̸��� �ݵ�� �����Ͽ� �����ϱ�� ������ VIPCustomer Ŭ������ ������ ���� �� ���� �ʿ��ϴ�.
	 * -> ��������� ���� Ŭ���� �����ڸ� ȣ���ؾ� �Ѵ�. super(customerID, customerName);
	 */
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	//protected ������ ������ ������ �ܺο��� ����� �� �ֵ��� get(), set() �޼��� �߰�
}
