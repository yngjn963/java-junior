package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		/*
		 * Member 클래스를 TreeSet의 요소로 추가할 때 어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지를 구현하지 않아 오류 발생
		 * 따라서 회원을 TreeSet에 추가할 때 어떤 기준으로 비교할 것인지를 구현해 주어야 한다.
		 * 이때 사용하는 인터페이스가 Comparable 또는 Comparator 이다.
		 */
	}

}
