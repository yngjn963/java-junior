package classex;

/*
 * Class 클래스는 컴파일된 class 파일에 저장된 클래스나 인터페이스 정보를 가져오는 데 사용한다.
 * 
 * 모르는 클래스의 정보를 사용한 경우에 우리가 클래스 정보를 직접 찾아야 한다.
 * 이때 Class 클래스를 활용한다.
 * 
 * Class 클래스를 선언하고 클래스 정보를 가져오는 방법
 * 1. Object 클래스의 getClass() 메서드 사용
 * String s = new String();
 * Class c = s.getClass();//getClass() 메서드의 반환형은 Class
 * 2. 클래스 파일 이름을 Class 변수에 직접 대입
 * Class c = String.Class;
 * 3. Class.forName("클래스 이름") 메서드 사용
 * Class c = Class.forName("java.lang.String");
 */

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
