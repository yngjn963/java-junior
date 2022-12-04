package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);	//add() 함수 호출
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
	}

	private static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;	//결과 값 반환
	}
	//함수를 호출하면 그 함수만을 위한 메모리 공간이 할당되는데, 이 메모리 공간을 스택(stack)이라고 부른다.
	//add() 함수를 호출하면서 메모리를 생성하는 과정
	//num1, num2, sum - 1. main() 함수가 사용할 메모리 공간이 스택에 생성됨
	// - 2. main()에서 add() 호출
	//n1, n2, result - 3. add() 함수가 사용할 메모리 공간이 스택에 생성됨
	//add() 함수 수행이 끝나고 함수에 할당했던 메모리 공간을 해제하는 과정
	// - 1. add() 함수가 사용한 메모리 공간은 자동으로 사라짐
	// - 2. add() 수행 후 메모리 해제
	// num1, num2, sum - 3. main() 함수
}
