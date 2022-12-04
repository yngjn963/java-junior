package collection;

import java.util.LinkedList;

/*
 * 배열은 처음 배열을 생성할 때 정적 크기로 선언하고, 물리적 순서와 논리적 순서가 동일하다.
 * 배열은 중간에 자료를 삽입하거나 삭제할 때 나머지 자료를 이동시켜 빈 공간을 만들지 않고 연속된 자료 구조를 구현한다.
 * 또한 처음 선언한 배열 크기 이상으로 요소가 추가되는 경우에는 크기가 더 큰 배열을 새로 생성하여 각 요소를 복사해야 하는 번거로움이 있다.
 * 이런 점을 개선한 자료 구조를 링크드 리스트(linked list)라고 한다.
 * 
 * 링크드 리스트의 각 요소는 다음 요소를 가리키는 주소 값을 가진다. 따라서 물리적인 메모리는 떨어져 있어도 논리적으로는 앞뒤 순서가 있다.
 * 같은 List 인터페이스를 구현한 ArrayList에 비해 중간에 자료를 넣고 제거하는 데 시간이 적게 걸린다는 장점이 있고, 크기를 동적으로 증가시킬 수 있다.
 * 
 * 사용하는 자료의 변동(삽입, 삭제)이 많은 경우에는 링크드 리스트를, 자료 변동이 거의 없는 경우에는 배열을 사용하는 것이 효율적이다.
 */

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);//A, B, C
		
		myList.add(1, "D");
		System.out.println(myList);//A, D, B, C >> B, C를 밀어내고 D가 삽입됨
		
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}

}
