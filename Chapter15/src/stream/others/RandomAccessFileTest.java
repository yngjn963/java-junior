package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile 클래스
 * RandomAccessFile은 입출력 클래스 중 유일하게 파일 입출력을 동시에 할 수 있는 클래스이다.
 * 또한 지금까지 배운 스트림은 처음부터 차례로 자료를 읽었지만 RandomAccessFile은 임의의 위치로 이동하여 자료를 읽을 수 있다.
 * RandomAccessFile에는 파일 포인터가 있는데, 현재 이 파일의 어느 위치에서 읽고 쓰는지 그 위치를 가리키는 속성이다.
 * 스트림을 생성하지 않고 간단하게 파일에 자료를 쓰거나 읽을 때 사용하면 유용하다.
 * 파일 포인터가 이동하는 위치가 파일 자료를 읽거나 쓰이는 위치이므로 파일 포인터의 위치를 잘 생각하며 구현해야 한다.
 * 
 * RandomAccessFile은 임의의 위치에 읽거나 쓰는 기능 외에도 다양한 자료형 값을 읽거나 쓸 수 있다.
 * 이 원리를 이해하기 위해 RandomAccessFile이 어떤 인터페이스를 구현했는지 JavaDoc에서 살펴보면,
 * 구현한 인터페이스는 DataInput, DataOutput이 있다.
 * 이런 인터페이스를 구현하면 RandomAccessFile 클래스는 DataInputStream 및 DataOutputStream과 같이 다양한 자료형을 다루는 메서드를 사용할 수 있다.
 */

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		rf.seek(0); // 자료를 읽기 전에 파일의 맨 처음으로 이동하여 처음부터 차례로 값을 읽어올 수 있다.
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		int i = rf.readInt(); // 자료를 읽어올 때는 저장할 때 사용한 자료형에 맞는 메서드로 읽어야 한다.
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		/*
		 * 예제를 설명하기 전에 먼저 파일 포인터에 대해 알아보면,
		 * 파일에 자료를 읽거나 쓰며 파일 포인터가 이동한다.
		 * 처음 RandomAccessFile 클래스를 생성하면 파일 포인터 위치는 맨 앞, 즉 0의 위치를 가리킨다.
		 * int 값을 하나 쓰면 int 크기는 4바이트이므로 파일 포인터 위치가 4로 이동한다.
		 * 다시 말해 다음 자료를 읽거나 써야할 위치로 계속 이동하는 것이 파일 포인터이다.
		 * 
		 * RandomAccessFile를 생성할 때 rw 모드를 사용했다.
		 * 따라서 이 파일은 읽고 쓰기가 모두 가능하다.
		 * 다양한 자료형 메서드를 활용하여 파일에 자료를 출력했다.
		 * 각 행에서 자료를 출력한 후의 파일 포인터 위치를 확인하면, 각 메서드가 호출됨으로써 이동한 파일 포인터의 값은
		 * rf.writeInt(100);		// int 4바이트
		 * rf.writeDouble(3.14);	// double 8바이트
		 * rf.writeUTF("안녕하세요");	// 수정된 UTF-8 사용 한글(3바이트) * 5 + null 문자(2바이트) = 17바이트
		 * 
		 * 쓰기가 끝난 후 파일 포인터 위치는 4 + 8 + 17 = 29이다.
		 * 그런데 여기에서 read() 메서드를 바로 호출하면 오류가 난다.
		 * 왜냐하면 파일 포인터 위치가 29에 있기 때문이다.
		 * 우리가 읽어야 할 파일 위치는 맨 처음인 0부터이다.
		 * 따라서 파일 포인터 위치를 이동해 주는 seek() 메서드를 활용하여 맨 처음으로 이동해야 한다.
		 * 
		 */
	}

}
