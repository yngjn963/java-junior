package stream.serialization;

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
