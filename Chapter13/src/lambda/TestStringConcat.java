package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
//		StringConcatImpl concat1 = new StringConcatImpl();
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
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
