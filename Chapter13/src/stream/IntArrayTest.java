package stream;

import java.util.Arrays;

/*
 * 스트림 : 여러 자료의 처리에 대한 기능을 구현해 놓은 클래스
 * 스트림을 활용하면 배열, 컬렉션 등의 자료를 일관성 있게 처리할 수 있다.
 * 자료에 따라 기능을 각각 새로 구현하는 것이 아니라 처리해야 하는 자료가 무엇인지와 상관없이 같은 방식으로 메서드를 호출할 수 있기 때문이다.
 * 다른 말로는 추상화했다고 표현한다.
 * 
 * 스트림 연산
 * 스트림 연산의 종류에는 크게 중간 연산과 최종 연산 두 가지가 있다.
 * 중간 연산은 자료를 거르거나 변경하여 또 다른 자료를 내부적으로 생성한다.
 * 최종 연산은 생성된 내부 자료를 소모해 가면서 연산을 수행한다.
 * 따라서 최종 연산은 마지막에 한 번만 호출된다.
 * 그리고 최종 연산이 호출되어야 중간 연산의 결과가 만들어진다.
 * 
 * 중간 연산 - filter(), map()
 * 최종 연산 - forEach(), count(), sum(), reduce()
 * 최종 연산은 스트림의 자료를 소모하면서 연산을 수행하기 때문에 최종 연산이 수행되고 나면 해당 스트림은 더 이상 사용할 수 없다.
 */

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum(); //sum() 연산으로 arr 배열에 저장된 값을 모두 더함
		int count = (int)Arrays.stream(arr).count(); //count() 연산으로 arr 배열의 요소 개수를 반환함
		//count() 메서드의 반환 값이 long이므로 int형으로 변환
		System.out.println(sumVal);
		System.out.println(count);
	}

}
