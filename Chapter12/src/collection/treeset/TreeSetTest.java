package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		/*
		 * TreeSet�� �ڷ��� �ߺ��� ������� �����鼭 ��� ��� ���� �����ϴ� Ŭ�����̴�.
		 */
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(new String("ȫ�浿"));
		treeSet.add(new String("������"));
		treeSet.add(new String("�̼���"));
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		/*
		 * ������ � ��������?
		 * �ڹٴ� ������ �����ϱ� ���� '���� Ʈ��(binary tree)'�� ����Ѵ�.
		 */
	}

}
