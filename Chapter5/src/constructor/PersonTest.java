package constructor;

public class PersonTest {

	public static void main(String[] args) {
//		Person personLee = new Person(); //������
		
		Person personKim = new Person();
		personKim.name = "������";
		personKim.weight = 85.5F;
		personKim.height = 180.0F; //����Ʈ �����ڷ� Ŭ������ ������ �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
		
		Person personLee = new Person("�̼���", 175, 75);	//�ν��Ͻ� ���� �ʱ�ȭ�� ���ÿ� Ŭ���� ����
	}

}
