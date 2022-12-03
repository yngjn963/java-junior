package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		/*
		 * TreeSet는 자료의 중복을 허용하지 않으면서 출력 결과 값을 정렬하는 클래스이다.
		 */
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(new String("홍길동"));
		treeSet.add(new String("강감찬"));
		treeSet.add(new String("이순신"));
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		/*
		 * 정렬은 어떤 기준으로?
		 * 자바는 정렬을 구현하기 위해 '이진 트리(binary tree)'를 사용한다.
		 */
	}

}
