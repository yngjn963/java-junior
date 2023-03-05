package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 클래스의 인스턴스가 생성되면 인스턴스의 상태, 즉 인스턴스 변수 값은 마치 생명체처럼 계속 변하게 된다.
 * 그런데 인스턴스의 어느 순간 상태를 그대로 저장하거나 네트워크를 통해 전송할 일이 있을 수 있다.
 * 이를 직렬화(serialization)라고 한다.
 * 그리고 저장된 내용이나 전송받은 내용을 다시 복원하는 것을 역직렬화(deserialization)라고 한다.
 * 다시 말해 직렬화란 인스턴스 내용을 연속 스트림으로 만드는 것이다.
 * 스트림으로 만들어야 파일에 쓸 수도 있고 네트워크로 전송할 수도 있다.
 * 따라서 직렬화 과정에서 하는 일은 인스턴스 변수 값을 스트림으로 만드는 것이다.
 * 복잡한 과정일 수 있지만 자바에서는 보조 스트림인 ObjectInputStream과 ObjectOutputStream을 사용하여 좀 더 쉽게 구현할 수 있다.
 * 
 * 저장할 파일이나 전송할 네트워크 등의 기반 스트림을 매개변수로 받아서 인스턴스 변수 값을 저장하거나 전송합니다.
 * 직렬화에 사용할 Person 클래스를 하나 만들어 인스턴스로 생성한 후 파일에 썼다가 복원하는 예제를 살펴보면,
 * Person 클래스의 생성자로 두 인스턴스를 생성한다.
 * 이를 serial.out 파일에 저장한다(직렬화).
 * 그러고 나서 serial.out 파일에서 저장된 내용을 읽어서 원래 인스턴스 상태로 복원한다(역직렬화).
 */

class Person implements Serializable { // implements Serializable: 직렬화하겠다는 의도를 표시
	private static final long serialVersionUID = -1503252402544036183L; // 버전 관리를 위한 정보
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
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personAhn);
			oos.writeObject(personKim); // personAhn과 personKim의 값을 파일에 씀(직렬화)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject(); // personAhn과 personKim의 값을 파일에서 읽어 들임(역직렬화)
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * 프로그램을 실행하면 오류가 발생한다.
		 * 직렬화는 인스턴스 내용이 외부로 유출되는 것이므로 프로그래머가 직렬화를 하겠다는 의도를 표시해야 한다.
		 * 따라서 Person 클래스에 마커 인터페이스(marker interface)인 Serialize 인터페이스를 추가해야 한다.
		 */
		/*
		 * transient 예약어
		 * 직렬화 대상이 되는 클래스는 모든 인스턴스 변수가 직렬화되고 복원된다.
		 * 그런데 직렬화될 수 없는 클래스(Socket 클래스는 직렬화될 수 없음)가 인스턴스 변수로 있다거나 직렬화하고 싶지 않은 변수가 있을 수 있다.
		 * 그럴 때 transient 예약어를 사용한다.
		 * 그러면 해당 변수는 직렬화되고 복원되는 과정에서 제외된다.
		 * transient 예약어를 사용한 변수 정보는 그 자료형의 기본 값으로 저장된다.
		 * 따라서 객체 자료형인 경우에 null 값이 된다.
		 * 앞의 예제에서 Person의 job 변수를 transient String job으로 바꾸고 실행하면,
		 * 출력 결과로
		 * 안재용,null
		 * 김철수,null
		 * job 내용이 저장되지 않았음을 알 수 있다.
		 */
		/*
		 * serialVersionUID를 사용한 버전 관리
		 * 객체를 역직렬화할 때, 직렬화할 때의 클래스와 상태가 다르면 오류가 발생한다.
		 * 그 사이 클래스가 수정되었다거나 변경되었다면 역직렬화할 수 없기 때문이다.
		 * 따라서 직렬화할 때 자동으로 serialVersionUID를 생성하여 정보를 저장한다.
		 * 그리고 역직렬화를 할 때 serialVersionUID를 비교하는데 만약 클래스 내용이 변경되었다면 클래스 버전이 맞지 않는다는 오류가 발생한다.
		 * 그런데 작은 변경에도 클래스 버전이 계속 바뀌면 네트워크로 서로 객체를 공유해서 일하는 경우에 매번 클래스를 새로 배포해야 하는 번거로움이 있다.
		 * 이런 경우에 클래스의 버전 관리를 개발자가 할 수 있다.
		 * 자바에서 제공하는 자바 설치 경로의 bin/serialver.exe를 사용하면 다음과 같이 serialVersionUID가 생성된다.
		 * 이 정보를 클래스 파일에 적어 주면 된다.
		 * 이클립스에서는 이 기능을 자동으로 제공한다.
		 * The serializable class Person does not declare a static final serialVersionUID field of type long 오류에
		 * Add generated serial version ID를 선택하면 직렬화를 위한 버전 번호가 자동으로 생성된다.
		 * 만약 직렬화의 대상이 되는 클래스 정보가 바뀌고 이를 공유해야 하는 경우에 버전 정보를 변경하면 된다.
		 */
	}

}
