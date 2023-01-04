package lambda;

/*
 * 함수를 변수처럼 사용하는 람다식
 * 람다식을 이용하면 구현된 함수를 변수처럼 사용할 수 있다.
 * 우리가 프로그램에서 변수를 사용하는 경우는 크게 세 가지이다.
 * 1. 특정 자료형으로 변수 선언 후 값 대입하여 사용하기 ex) int a = 10;
 * 2. 매개변수로 전달하기 ex) int add(int x, int y);
 * 3. 메서드의 반환 값으로 반환하기 ex) return num;
 * 
 * 람다식으로 구현된 메서드도 변수에 대입하여 사용할 수 있고, 매개변수로 전달하고 반환할 수 있다.
 * 
 * 인터페이스형 변수에 람다식 대입하기
 * 
 */

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);	//람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr); //메서드의 매개변수로 람다식을 대입한 변수 전달
		
		PrintString reStr = returnString(); //변수로 반환받기
		reStr.showString("hello ");			//메서드 호출
	}

	public static void showMyString(PrintString p) { //매개변수를 인터페이스형으로 받음
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() { //반환 값으로 쓰이는 람다식
//		PrintString str = s -> System.out.println(s + "world");
//		return str;
		return s -> System.out.println(s + "world");
	}

}
