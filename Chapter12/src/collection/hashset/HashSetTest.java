package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		/*
		 * HashSet Ŭ������ ���� �ڷ� ������ �����ϸ� �ߺ��� ������� �ʴ´�.
		 */
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
		//HashSet�� �ڷᰡ �߰��� ������ ������� ��µȴ�.
	}

}
