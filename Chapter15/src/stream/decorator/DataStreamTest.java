package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream과 DataOutputStream
 * 지금까지 살펴본 스트림은 사람이 읽고 쓰는 텍스트 형식의 자료를 다루었다.
 * 지금부터 배울 DataInputStream과 DataOutputStream은 메모리에 저장된 0, 1 상태를 그대로 읽거나 쓴다.
 * 그래서 자료형의 크기가 그대로 보존됟다.
 * 
 * 자료형을 그대로 읽고 쓰는 스트림이기 때문에 같은 정수라도 자료형에 따라 다르게 처리한다.
 * 즉 writeByte(100)은 1바이트로 쓰인 100을 의미하지만, writeInt(100)은 4바이트로 쓰인 100을 의미한다.
 * 따라서 자료를 쓸 때 사용한 메서드와 같은 자료형의 메서드로 읽어야 한다.
 * 즉 정수 100을 쓰는 데 writeInt(100)를 쓰고 readByte()로 읽으면 서로 사용한 메모리 크기가 달라서 같은 값을 가져올 수 없다.
 * 또 파일이든 네트워크든 자료를 쓸 때 사용한 메서드 순서대로 읽어야 한다.
 */

public class DataStreamTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 자바 입출력 스트림은 데코레이터 패턴이다.
		 * 보조 스트림은 자바 입출력 스트림 클래스에 유동적이고 효율적으로 기능을 추가하거나 제거할 수 있는 클래스이다.
		 * 이러한 구조를 디자인 패턴에서는 '데코레이터 패턴'이라고 한다.
		 * 자바의 입출력 스트림 클래스는 데코레이터 패턴 구조이다.
		 * 데코레이터 패턴에서 클래스는 실제로 입출력이 가능한 클래스와 그렇지 않은 클래스로 구분된다.
		 * 앞에서 이야기한 커피, 우유, 시럽을 생각해 보자.
		 * 우유와 시럽은 커피에 추가 기능을 제공하는 역할을 했다.
		 * 이렇게 추가 기능을 제공하는 클래스와 실제 역할을 하는 클래스는 구분해서 생각해야 한다.
		 * 
		 * 이렇게 기능이 동적으로 추가되는 클래스를 데코레이터(장식자)라고 한다.
		 * 자바의 스트림 클래스에 여러 데코레이터 클래스가 추가되는데 이들 데코레이터는 하나의 클래스에 국한하지 않고 여러 클래스에 다양하게 적용할 수 있다.
		 * 예를 들어 BufferedReader는 FileReader를 감쌀 수도 있지만 또 다른 보조 스트림 InputStreamReader도 감싸서 기능을 더할 수 있다.
		 * 즉 보조 스트림은 자료형만 맞는다면 또 다른 보조 스트림에 기능을 더해 줄 수 있다.
		 * 
		 * WhippedCreadCoffee whippedCreamCoffee = new WhippedCreamCoffee(new MochaCoffee(new LatteCoffee(new KenyaCoffee())));
		 * 위와 같이 만들면 휘핑 크림이 올라간 모카 커피가 만들어진다.
		 * 실제 커피는 KenyaCoffee이고 나머지 클래스는 데코레이터이다.
		 */
	}

}
