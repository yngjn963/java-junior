package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
//		StringConcatImpl concat1 = new StringConcatImpl();
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
		/*
		 * 익명 객체를 생성한느 람다식
		 * 자바는 객체 지향 언어. 자바는 객체 생성 없이 메서드 호출이 일어날 수 없는데 이 메서드는 어떻게 호출되는 것일까?
		 * 익명 내부 클래스는 클래스 이름 없이 인터페이스 자료형 변수에 바로 메서드 구현부를 생성하여 대입할 수 있다.
		 * 즉 람다식으로 메서드를 구현해서 호출하면 컴퓨터 내부에서는 다음처럼 익명 클래스가 생성되고 이를 통해 익명 객체가 생성되는 것이다.
		 * StringConcat concat3 = new StringConcat() {
		 * 	@Override
		 * 	public void makeString(String s1, String s2) {
		 * 		System.out.println(s1 + "," + s2);
		 * 	}
		 * }
		 */
		
		/*
		 * 람다식에서 사용하는 지역 변수
		 * 두 문자열을 연결하는 람다식 코드에서 외부 메서드의 지역 변수인 i를 수정하면 어떻게 될까?
		 */
		int i = 100;	// main() 함수의 지역 변수
		
		StringConcat concat3 = (s, v) -> {
			//i = 200; //람다식 내부에서 변경하면 오류 발생
			//지역 변수는 메서드 호출이 끝나면 메모리에서 사라지기 때문에 익명 내부 클래스에서 사용하는 경우에는 지역 변수가 상수로 변한다.
			//람다식 역시 익명 내부 클래스가 생성되므로 외부 메서드의 지역 변수를 사용하면 변수는 final 변수, 즉 상수가 된다.
			//따라서 이 변수를 변경하면 오류가 발생한다.
			System.out.println(i);
			System.out.println(s + "," + v);
		};
	}

}
