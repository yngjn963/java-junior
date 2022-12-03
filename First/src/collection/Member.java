package collection;

/*
 * �÷��� �����ӿ�ũ�� ��ü ������ Collection �������̽��� Map �������̽� ������� �̷���� �ִ�.
 * Collection �������̽��� �ϳ��� �ڷḦ ��Ƽ� �����ϴ� �� �ʿ��� ����� �����ϰ�, Map �������̽��� ��(pair)���� �� �ڷ���� �����ϴ� �� ������ ����� �����Ѵ�.
 * 
 * Collection �������̽� ������ List �������̽��� Set �������̽��� �ִ�.
 * List�� ������ Ŭ������ �������� �ڷḦ �����ϴ� �� ����ϴ� Ŭ�����̰�,
 * Set �������̽��� �츮�� ���� �ð��� ��� ������ �����ϸ� �ȴ�. ������ ������ ������� �ߺ��� ������� �ʴ´�. ���� Set �迭�� Ŭ������ ���̵�ó�� �ߺ����� �ʴ� ��ü�� �ٷ�� �� ����Ѵ�.
 * 
 * Map �������̽��� �ϳ��� �ƴ� ��(pair)���� �Ǿ� �ִ� �ڷḦ �����ϴ� �޼������ ����Ǿ� �ִ�.
 * key-value ���̶�� ǥ���ϴµ� �� �� Ű ���� �ߺ��� �� ����.
 * �й��� �л� �̸�ó�� ������ �Ǿ� �ִ� �ڷḦ ������ �� ����ϸ� ���ϴ�.
 */

public class Member implements Comparable<Member> {
	private int memberId;	//ȸ�� ���̵�
	private String memberName;	//ȸ�� �̸�
	
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
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
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
		 * �� ���� ���Ͽ� ���� �߰��� ȸ�� ���̵� �� ũ�� ���, �׷��� ������ ����, ������ 0�� ��ȯ�ϵ��� �������.
		 * �̷��� �����ϸ� ��� ��� ���� ������������ ���ĵȴ�.
		 * return (this.memberId - member.memberId) * (-1);//������������ �����ϱ� ���ؼ��� ��ȯ ���� ������ �����.
		 */
	}
}
