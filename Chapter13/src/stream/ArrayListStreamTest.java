package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Collection���� stream() �޼��带 ����ϸ� �� Ŭ������ ���׸����� ����� ������ ���� �ڷ����� ����� �� �ִ�.
 * Stream<String> stream = sList.stream();
 * �̷��� ������ ��Ʈ���� ���������� ArrayList�� ��� ��Ҹ� ������ �ִ�.
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
		//��Ʈ�� ���� ���� + ���� + ��Ҹ� �ϳ��� ������ ���
		
		/*
		 * ��Ʈ���� Ư¡
		 * 1. �ڷ��� ���� ������� ������ ������ �����Ѵ�.
		 * 2. �� �� �����ϰ� ����� ��Ʈ���� ������ �� ����.
		 * 3. ��Ʈ���� ������ ���� �ڷḦ �������� �ʴ´�.
		 * 4. ��Ʈ���� ������ �߰� ����� ���� ������ �ִ�.
		 */
	}

}
