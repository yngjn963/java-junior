package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	//논리 곱에서 앞 항(((num1 = num1 + 10) < 10))의 결과 값이 거짓이므로 ((i = i + 2) < 10) 이 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//위 주석처럼 ((i = i + 2) < 10) 문장은 아예 실행조차 되지 않기 때문에 i 값을 출력해 보면 값이 증가하지 않았다.
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);			//논리 합에서 앞 항(((num1 = num1 + 10) > 10))의 결과 값이 참이므로 ((i = i + 2) < 10) 이 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//위 주석처럼 ((i = i + 2) < 10) 문장은 아예 실행조차 되지 않기 때문에 i 값을 출력해 보면 값이 증가하지 않았다.
		//이처럼 논리 곱 연산과 논리 합 연산을 할 때 두 항을 모두 실행하지 않더라도 결과 값을 알 수 있는 경우에, 나머지 항은 실행되지 않는 것을 단락 회로 평가(Short Circuit Evaluation: SCE)라고 한다.
	}

}
