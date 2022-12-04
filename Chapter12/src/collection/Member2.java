package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
	private int memberId;	//회원 아이디
	private String memberName;	//회원 이름
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if (this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
	/*
	 * Comparator를 사용할 때 유의할 점은 TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달한다는 것이다.
	 * 즉 다음과 같이 코드를 구현해야 한다.
	 * TreeSet<Member> treeSet = new TreeSet<Member>(new Member());
	 * 
	 * 일반적으로 Comparator 인터페이스보다 Comparable 인터페이스를 더 많이 사용한다.
	 * 다만 어떤 클래스가 이미 Comparable 인터페이스를 구현한 경우에 이 클래스의 정렬 방식을 정의할 때 Comparator 인터페이스를 사용할 수 있다.
	 * 예를 들어 String 클래스는 Comparable 인터페이스를 구현하여 오름차순 정렬을 구현한다. 만약 정렬 방식을 내림차순으로 바꾸고 싶은 경우에는 어떻게?? String 클래스의 경우는 final로 선언되어 있어서 상속받아 compareTo() 메서드를 재정의할 수도 없다.
	 */
}
