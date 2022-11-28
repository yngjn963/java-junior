package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		/*
		 * ���÷��� ���α׷����� ������ ������ �� �� ���� Ŭ����, �� ���α׷� ���� �߿� Ŭ������ �޸𸮿� �ε��ϰų� ��ü�� �ٸ� ���� ��ġ�ؼ� �������� �ε��ϰ� ������ �� ����Ѵ�.
		 */
		
		/*
		 * Class.forName()�� ����� ���� �ε��ϱ�
		 * � ȸ�翡�� ������ �ý����� �ִµ�, ���� �����ͺ��̽��� ������ �� �ִ�.
		 * �׷��ٰ� �� �ý����� �������� �� ��� �����ͺ��̽� ���̺귯��(����̹�)�� ���� �������� �ʿ�� ����.
		 * �ý����� ������ �� � �����ͺ��̽��� ���������� �����ȴٸ� �ش� ����̹��� �ε��ϸ� �ȴ�.
		 * ȸ�簡 ����ϴ� �����ͺ��̽� ������ ȯ�� ���Ͽ��� �о� �� ���� �ְ� �ٸ� ���� ������ ���� ���� �ִ�.
		 * �� ���α׷� ���� ���� Ŭ������ �ε��� �ʿ��� ��� Ŭ������ '���� �ε�(dynamic loading)' ����� ����Ѵ�.
		 * �ڹٴ� Class.forName() �޼��带 ���� �ε����� �����Ѵ�.
		 * 
		 * forName() �޼��带 ����� �� ������ ��
		 * forName() �޼��带 ����Ͽ� Class Ŭ������ ������ �� ���� �����ؾ� �� ���� �ش� forName("Ŭ���� �̸�")�� Ŭ���� �̸��� ���ڿ� ���̹Ƿ�, ���ڿ��� ������ �־ �������� ������ �� ������ �� �� ���ٴ� ���̴�.
		 * �ᱹ ���α׷��� ����ǰ� �޼��尡 ȣ��� �� Ŭ���� �̸��� �ش��ϴ� Ŭ������ ���ٸ� ClassNotFoundException�� �߻��Ѵ�.
		 * ���� ���� �ε� ����� �������� �� ������ �� �� ����.
		 */
	}

}
