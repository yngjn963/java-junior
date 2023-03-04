package stream.serialization;

/*
 * 클래스의 인스턴스가 생성되면 인스턴스의 상태, 즉 인스턴스 변수 값은 마치 생명체처럼 계속 변하게 된다.
 * 그런데 인스턴스의 어느 순간 상태를 그대로 저장하거나 네트워크를 통해 전송할 일이 있을 수 있다.
 * 이를 직렬화(serialization)라고 한다.
 * 그리고 저장된 내용이나 전송받은 내용을 다시 복원하는 것을 역직렬화(deserialization)라고 한다.
 * 다시 말해 직렬화란 인스턴스 내용을 연속 스트림으로 만드는 것이다.
 * 스트림으로 만들어야 파일에 쓸 수도 있고 네트워크로 전송할 수도 있다.
 * 따라서 직렬화 과정에서 하는 일은 인스턴스 변수 값을 스트림으로 만드는 것이다.
 * 복잡한 과정일 수 있지만 자바에서는 보조 스트림인 ObjectInputStream과 ObjectOutputStream을 사용하여 좀 더 쉽게 구현할 수 있다.
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
