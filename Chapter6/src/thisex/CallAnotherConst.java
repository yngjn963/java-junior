package thisex;

class Person {
	String name;
	int age;
	
	Person() {
//		this.name = "noname";
		this("�̸� ����", 1);	//this�� ����� Person(String, int) ������ ȣ��
		/*
		 * this�� �ٸ� �����ڸ� ȣ���� �� ������ ��
		 * this�� ����Ͽ� �����ڸ� ȣ���ϴ� �ڵ� ������ �ٸ� �ڵ带 ���� �� ����.
		 * ���� �ٸ� �ڵ带 ������ ����
		 * �����ڴ� Ŭ������ ������ �� ȣ��ǹǷ� Ŭ���� ������ �Ϸ���� ���� ������ �ٸ� �ڵ尡 �ִٸ� ������ �߻��� �� �ִ�.
		 * �� ����Ʈ �����ڿ��� ������ �Ϸ�Ǵ� ���� �ƴ϶� this�� ����� �ٸ� �����ڸ� ȣ���ϹǷ�, �̶��� this�� Ȱ���� ������ ���� ���� �;� �Ѵ�.
		 */
		/*
		 * �ڽ��� �ּҸ� ��ȯ�ϴ� this
		 * this�� ����Ͽ� ������ Ŭ���� �ڽ��� �ּ� ���� ��ȯ�� �� �ִ�.
		 * �ν��Ͻ� �ּ� ���� ��ȯ�� ���� this�� ����ϰ� ��ȯ���� Ŭ���� �ڷ����� ����Ѵ�.
		 * this�� ��ȯ�ϴ� �޼��带 ����� ���� �������� ������, Ŭ���� �ڷ����� ������� Ŭ���� ������ this�� ����ϸ� �ڽ��� �ּ� ���� ��ȯ�� �� �ִ�.
		 */
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;	//this ��ȯ
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();	//this ���� Ŭ���� ������ ����
		System.out.println(p);				//noName.returnItSelf()�� ��ȯ �� ���
		System.out.println(noName);			//���� ���� ���
	}

}
