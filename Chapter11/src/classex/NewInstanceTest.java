package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		/*
		 * 리플렉션 프로그래밍은 컴파일 시점에 알 수 없는 클래스, 즉 프로그램 실행 중에 클래스를 메모리에 로딩하거나 객체가 다른 곳에 위치해서 원격으로 로딩하고 생성할 때 사용한다.
		 */
		
		/*
		 * Class.forName()을 사용해 동적 로딩하기
		 * 어떤 회사에서 개발한 시스템이 있는데, 여러 데이터베이스를 연동할 수 있다.
		 * 그렇다고 이 시스템을 컴파일할 때 모든 데이터베이스 라이브러리(드라이버)를 같이 컴파일할 필요는 없다.
		 * 시스템을 구동할 때 어떤 데이터베이스와 연결할지만 결정된다면 해당 드라이버만 로딩하면 된다.
		 * 회사가 사용하는 데이터베이스 정보는 환경 파일에서 읽어 올 수도 있고 다른 변수 값으로 받을 수도 있다.
		 * 즉 프로그램 실행 이후 클래스의 로딩이 필요한 경우 클래스의 '동적 로딩(dynamic loading)' 방식을 사용한다.
		 * 자바는 Class.forName() 메서드를 동적 로딩으로 제공한다.
		 * 
		 * forName() 메서드를 사용할 때 유의할 점
		 * forName() 메서드를 사용하여 Class 클래스를 가져올 때 가장 유의해야 할 점은 해당 forName("클래스 이름")의 클래스 이름이 문자열 값이므로, 문자열에 오류가 있어도 컴파일할 때에는 그 오류를 알 수 없다는 것이다.
		 * 결국 프로그램이 실행되고 메서드가 호출될 때 클래스 이름에 해당하는 클래스가 없다면 ClassNotFoundException이 발생한다.
		 * 따라서 동적 로딩 방식은 컴파일할 때 오류를 알 수 없다.
		 */
	}

}
