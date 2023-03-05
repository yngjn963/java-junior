package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Ŭ������ �ν��Ͻ��� �����Ǹ� �ν��Ͻ��� ����, �� �ν��Ͻ� ���� ���� ��ġ ����üó�� ��� ���ϰ� �ȴ�.
 * �׷��� �ν��Ͻ��� ��� ���� ���¸� �״�� �����ϰų� ��Ʈ��ũ�� ���� ������ ���� ���� �� �ִ�.
 * �̸� ����ȭ(serialization)��� �Ѵ�.
 * �׸��� ����� �����̳� ���۹��� ������ �ٽ� �����ϴ� ���� ������ȭ(deserialization)��� �Ѵ�.
 * �ٽ� ���� ����ȭ�� �ν��Ͻ� ������ ���� ��Ʈ������ ����� ���̴�.
 * ��Ʈ������ ������ ���Ͽ� �� ���� �ְ� ��Ʈ��ũ�� ������ ���� �ִ�.
 * ���� ����ȭ �������� �ϴ� ���� �ν��Ͻ� ���� ���� ��Ʈ������ ����� ���̴�.
 * ������ ������ �� ������ �ڹٿ����� ���� ��Ʈ���� ObjectInputStream�� ObjectOutputStream�� ����Ͽ� �� �� ���� ������ �� �ִ�.
 * 
 * ������ �����̳� ������ ��Ʈ��ũ ���� ��� ��Ʈ���� �Ű������� �޾Ƽ� �ν��Ͻ� ���� ���� �����ϰų� �����մϴ�.
 * ����ȭ�� ����� Person Ŭ������ �ϳ� ����� �ν��Ͻ��� ������ �� ���Ͽ� ��ٰ� �����ϴ� ������ ���캸��,
 * Person Ŭ������ �����ڷ� �� �ν��Ͻ��� �����Ѵ�.
 * �̸� serial.out ���Ͽ� �����Ѵ�(����ȭ).
 * �׷��� ���� serial.out ���Ͽ��� ����� ������ �о ���� �ν��Ͻ� ���·� �����Ѵ�(������ȭ).
 */

class Person implements Serializable { // implements Serializable: ����ȭ�ϰڴٴ� �ǵ��� ǥ��
	private static final long serialVersionUID = -1503252402544036183L; // ���� ������ ���� ����
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

	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("�����", "��ǥ�̻�");
		Person personKim = new Person("��ö��", "���̻�");
		
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personAhn);
			oos.writeObject(personKim); // personAhn�� personKim�� ���� ���Ͽ� ��(����ȭ)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject(); // personAhn�� personKim�� ���� ���Ͽ��� �о� ����(������ȭ)
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * ���α׷��� �����ϸ� ������ �߻��Ѵ�.
		 * ����ȭ�� �ν��Ͻ� ������ �ܺη� ����Ǵ� ���̹Ƿ� ���α׷��Ӱ� ����ȭ�� �ϰڴٴ� �ǵ��� ǥ���ؾ� �Ѵ�.
		 * ���� Person Ŭ������ ��Ŀ �������̽�(marker interface)�� Serialize �������̽��� �߰��ؾ� �Ѵ�.
		 */
		/*
		 * transient �����
		 * ����ȭ ����� �Ǵ� Ŭ������ ��� �ν��Ͻ� ������ ����ȭ�ǰ� �����ȴ�.
		 * �׷��� ����ȭ�� �� ���� Ŭ����(Socket Ŭ������ ����ȭ�� �� ����)�� �ν��Ͻ� ������ �ִٰų� ����ȭ�ϰ� ���� ���� ������ ���� �� �ִ�.
		 * �׷� �� transient ���� ����Ѵ�.
		 * �׷��� �ش� ������ ����ȭ�ǰ� �����Ǵ� �������� ���ܵȴ�.
		 * transient ���� ����� ���� ������ �� �ڷ����� �⺻ ������ ����ȴ�.
		 * ���� ��ü �ڷ����� ��쿡 null ���� �ȴ�.
		 * ���� �������� Person�� job ������ transient String job���� �ٲٰ� �����ϸ�,
		 * ��� �����
		 * �����,null
		 * ��ö��,null
		 * job ������ ������� �ʾ����� �� �� �ִ�.
		 */
		/*
		 * serialVersionUID�� ����� ���� ����
		 * ��ü�� ������ȭ�� ��, ����ȭ�� ���� Ŭ������ ���°� �ٸ��� ������ �߻��Ѵ�.
		 * �� ���� Ŭ������ �����Ǿ��ٰų� ����Ǿ��ٸ� ������ȭ�� �� ���� �����̴�.
		 * ���� ����ȭ�� �� �ڵ����� serialVersionUID�� �����Ͽ� ������ �����Ѵ�.
		 * �׸��� ������ȭ�� �� �� serialVersionUID�� ���ϴµ� ���� Ŭ���� ������ ����Ǿ��ٸ� Ŭ���� ������ ���� �ʴ´ٴ� ������ �߻��Ѵ�.
		 * �׷��� ���� ���濡�� Ŭ���� ������ ��� �ٲ�� ��Ʈ��ũ�� ���� ��ü�� �����ؼ� ���ϴ� ��쿡 �Ź� Ŭ������ ���� �����ؾ� �ϴ� ���ŷο��� �ִ�.
		 * �̷� ��쿡 Ŭ������ ���� ������ �����ڰ� �� �� �ִ�.
		 * �ڹٿ��� �����ϴ� �ڹ� ��ġ ����� bin/serialver.exe�� ����ϸ� ������ ���� serialVersionUID�� �����ȴ�.
		 * �� ������ Ŭ���� ���Ͽ� ���� �ָ� �ȴ�.
		 * ��Ŭ���������� �� ����� �ڵ����� �����Ѵ�.
		 * The serializable class Person does not declare a static final serialVersionUID field of type long ������
		 * Add generated serial version ID�� �����ϸ� ����ȭ�� ���� ���� ��ȣ�� �ڵ����� �����ȴ�.
		 * ���� ����ȭ�� ����� �Ǵ� Ŭ���� ������ �ٲ�� �̸� �����ؾ� �ϴ� ��쿡 ���� ������ �����ϸ� �ȴ�.
		 */
	}

}
