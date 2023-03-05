package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * Externalizable 인터페이스
 * 직렬화하는 데 사용하는 또 다른 인터페이스는 Externalizable이다.
 * Serializable 인터페이스는 자료를 읽고 쓰는 데 필요한 부분을 프로그래머가 따로 구현하지 않는다.
 * 하지만 Externalizable 인터페이스는 프로그래머가 구현해야 할 메서드가 있다.
 * 객체의 직렬화와 역직렬화를 프로그래머가 직접 세밀하게 제어하고자 할 때, 메서드에 그 내용을 구현한다.
 */

class Dog implements Externalizable {
	String name;
	
	public Dog() {}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	/*
	 * writeExternal() 메서드와 readExternal() 메서드를 구현할 때
	 * 디폴트 생성자가 호출되므로 디폴트 생성자를 추가해 주어야 한다.
	 */
	
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
//		FileOutputStream fos = new FileOutputStream("external.out");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		try (fos; oos) {
//			oos.writeObject(myDog);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		try (FileOutputStream fos = new FileOutputStream("external.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(myDog);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
	}

}
