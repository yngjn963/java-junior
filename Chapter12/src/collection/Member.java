package collection;

/*
 * 컬렉션 프레임워크의 전체 구조는 Collection 인터페이스와 Map 인터페이스 기반으로 이루어져 있다.
 * Collection 인터페이스는 하나의 자료를 모아서 관리하는 데 필요한 기능을 제공하고, Map 인터페이스는 쌍(pair)으로 된 자료들을 관리하는 데 유용한 기능을 제공한다.
 * 
 * Collection 인터페이스 하위에 List 인터페이스와 Set 인터페이스가 있다.
 * List를 구현한 클래스는 순차적인 자료를 관리하는 데 사용하는 클래스이고,
 * Set 인터페이스는 우리가 수학 시간에 배운 집합을 생각하면 된다. 집합은 순서와 상관없이 중복을 허용하지 않는다. 따라서 Set 계열의 클래스는 아이디처럼 중복되지 않는 객체를 다루는 데 사용한다.
 * 
 * Map 인터페이스는 하나가 아닌 쌍(pair)으로 되어 있는 자료를 관리하는 메서드들이 선언되어 있다.
 * key-value 쌍이라고 표현하는데 이 때 키 값은 중복될 수 없다.
 * 학번과 학생 이름처럼 쌍으로 되어 있는 자료를 관리할 때 사용하면 편리하다.
 */

public class Member implements Comparable<Member> {
	private int memberId;	//회원 아이디
	private String memberName;	//회원 이름
	
	public Member(int memberId, String memberName) {
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
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if (this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);
		/*
		 * 두 값을 비교하여 새로 추가한 회원 아이디가 더 크면 양수, 그렇지 않으면 음수, 같으면 0을 반환하도록 만들었다.
		 * 이렇게 구현하면 출력 결과 값은 오름차순으로 정렬된다.
		 * return (this.memberId - member.memberId) * (-1);//내림차순으로 정렬하기 위해서는 반환 값을 음수로 만든다.
		 */
	}
}
