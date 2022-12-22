package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
//		StringConcatImpl concat1 = new StringConcatImpl();
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
		int i = 100;	// main() 함수의 지역 변수
		
		StringConcat concat2 = (s, v) -> {
			//i = 200; //람다식 내부에서 변경하면 오류 발생
			System.out.println(i);
			System.out.println(s + "," + v);
		};
	}

}
