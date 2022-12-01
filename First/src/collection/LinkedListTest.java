package collection;

import java.util.LinkedList;

/*
 * �迭�� ó�� �迭�� ������ �� ���� ũ��� �����ϰ�, ������ ������ ���� ������ �����ϴ�.
 * �迭�� �߰��� �ڷḦ �����ϰų� ������ �� ������ �ڷḦ �̵����� �� ������ ������ �ʰ� ���ӵ� �ڷ� ������ �����Ѵ�.
 * ���� ó�� ������ �迭 ũ�� �̻����� ��Ұ� �߰��Ǵ� ��쿡�� ũ�Ⱑ �� ū �迭�� ���� �����Ͽ� �� ��Ҹ� �����ؾ� �ϴ� ���ŷο��� �ִ�.
 * �̷� ���� ������ �ڷ� ������ ��ũ�� ����Ʈ(linked list)��� �Ѵ�.
 * 
 * ��ũ�� ����Ʈ�� �� ��Ҵ� ���� ��Ҹ� ����Ű�� �ּ� ���� ������. ���� �������� �޸𸮴� ������ �־ �������δ� �յ� ������ �ִ�.
 * ���� List �������̽��� ������ ArrayList�� ���� �߰��� �ڷḦ �ְ� �����ϴ� �� �ð��� ���� �ɸ��ٴ� ������ �ְ�, ũ�⸦ �������� ������ų �� �ִ�.
 * 
 * ����ϴ� �ڷ��� ����(����, ����)�� ���� ��쿡�� ��ũ�� ����Ʈ��, �ڷ� ������ ���� ���� ��쿡�� �迭�� ����ϴ� ���� ȿ�����̴�.
 */

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);//A, B, C
		
		myList.add(1, "D");
		System.out.println(myList);//A, D, B, C >> B, C�� �о�� D�� ���Ե�
		
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}

}
