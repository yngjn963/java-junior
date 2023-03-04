package stream.serialization;

/*
 * Ŭ������ �ν��Ͻ��� �����Ǹ� �ν��Ͻ��� ����, �� �ν��Ͻ� ���� ���� ��ġ ����üó�� ��� ���ϰ� �ȴ�.
 * �׷��� �ν��Ͻ��� ��� ���� ���¸� �״�� �����ϰų� ��Ʈ��ũ�� ���� ������ ���� ���� �� �ִ�.
 * �̸� ����ȭ(serialization)��� �Ѵ�.
 * �׸��� ����� �����̳� ���۹��� ������ �ٽ� �����ϴ� ���� ������ȭ(deserialization)��� �Ѵ�.
 * �ٽ� ���� ����ȭ�� �ν��Ͻ� ������ ���� ��Ʈ������ ����� ���̴�.
 * ��Ʈ������ ������ ���Ͽ� �� ���� �ְ� ��Ʈ��ũ�� ������ ���� �ִ�.
 * ���� ����ȭ �������� �ϴ� ���� �ν��Ͻ� ���� ���� ��Ʈ������ ����� ���̴�.
 * ������ ������ �� ������ �ڹٿ����� ���� ��Ʈ���� ObjectInputStream�� ObjectOutputStream�� ����Ͽ� �� �� ���� ������ �� �ִ�.
 */

class Person {
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
