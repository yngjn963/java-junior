package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Collection에서 stream() 메서드를 사용하면 이 클래스는 제네릭형을 사용해 다음과 같이 자료형을 명시할 수 있다.
 * Stream<String> stream = sList.stream();
 * 이렇게 생성된 스트림은 내부적으로 ArrayList의 모든 요소를 가지고 있다.
 */

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
		//스트림 새로 생성 + 정렬 + 요소를 하나씩 꺼내어 출력
		
		/*
		 * 스트림의 특징
		 * 1. 자료의 대상과 관계없이 동일한 연산을 수행한다.
		 * 2. 한 번 생성하고 사용한 스트림은 재사용할 수 없다.
		 * 3. 스트림의 연산은 기존 자료를 변경하지 않는다.
		 * 4. 스트림의 연산은 중간 연산과 최종 연산이 있다.
		 */
	}

}
