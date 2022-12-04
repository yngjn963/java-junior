package thisex;

class Person {
	String name;
	int age;
	
	Person() {
//		this.name = "noname";
		this("이름 없음", 1);	//this를 사용해 Person(String, int) 생성자 호출
		/*
		 * this로 다른 생성자를 호출할 때 주의할 점
		 * this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없다.
		 * 만약 다른 코드를 넣으면 오류
		 * 생성자는 클래스가 생성될 때 호출되므로 클래스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류가 발생할 수 있다.
		 * 즉 디폴트 생성자에서 생성이 완료되는 것이 아니라 this를 사용해 다른 생성자를 호출하므로, 이때는 this를 활용한 문장이 가장 먼저 와야 한다.
		 */
		/*
		 * 자신의 주소를 반환하는 this
		 * this를 사용하여 생성된 클래스 자신의 주소 값을 반환할 수 있다.
		 * 인스턴스 주소 값을 반환할 때는 this를 사용하고 반환형으 클래스 자료형을 사용한다.
		 * this를 반환하는 메서드를 사용할 일이 흔하지는 않지만, 클래스 자료형과 상관없이 클래스 내에서 this를 사용하면 자신의 주소 값을 반환할 수 있다.
		 */
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;	//this 반환
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();	//this 값을 클래스 변수에 대입
		System.out.println(p);				//noName.returnItSelf()의 반환 값 출력
		System.out.println(noName);			//참조 변수 출력
	}

}
