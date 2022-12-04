package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		/*
		 * HashSet 클래스는 집합 자료 구조를 구현하며 중복을 허용하지 않는다.
		 */
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
		//HashSet은 자료가 추가된 순서와 상관없이 출력된다.
	}

}
