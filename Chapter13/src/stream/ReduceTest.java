package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/*
 * 프로그래머가 기능을 지정하는 reduce() 연산
 * reduce() 연산은 내부적으로 스트림의 요소를 하나씩 소모하면서 프로그래머가 직접 지정한 기능을 수행한다.
 * reduce() 메서드의 정의 : T reduce(T identify, BinaryOperator<T> accumulator)
 * 첫 번째 매개변수 T identify는 초깃값을 의미하고 두 번째 매개변수 BinaryOperator<T> accumulator는 수행해야 할 기능이다.
 * BinaryOperator 인터페이스는 두 매개변수로 람다식을 구현하며 이 람다식이 각 요소가 수행해야 할 기능이 된다.
 * 이때 BinaryOperator 인터페이스를 구현한 람다식을 직접 써도 되고, 람다식이 길면 인터페이스를 구현한 클래스를 생성하여 대입해도 된다.
 * 또한 BinaryOperator는 함수형 인터페이스로 apply() 메서드를 반드시 구현해야 한다.
 * apply() 메서드는 두 개의 매개변수와 한 개의 반환 값을 가지는데, 세 개 모두 같은 자료형이다.
 * reduce() 메서드가 호출될 때 BinaryOperator의 apply() 메서드가 호출된다.
 * 
 * reduce() 메서드에 어떤 람다식이 전달되느냐에 따라 다양한 연산을 수행할 수 있다.
 * reduce()는 처음부터 마지막까지 모든 요소를 소모하면서 람다식을 반복해서 수행하므로 최종 연산이다.
 */

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) { //reduce() 메서드가 호출될 때 불리는 메서드, 두 문자열 길이를 비교
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		System.out.println(Arrays.stream(greetings) .reduce("", (s1, s2) -> { //람다식을 직접 구현하는 방법. 내부적으로 람다식 부분이 요소 개수만큼 반복해서 호출
			//람다식으로 구현된 부분도 익명 클래스의 인스턴스가 생성되는 것이므로 내부적으로는 동일한 구조라 할 수 있다.
			if (s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperator를 구현한 클래스 사용
		System.out.println(str);
	}

}
