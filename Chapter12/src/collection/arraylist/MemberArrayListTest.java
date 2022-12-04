package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		
		memberArrayList.showAllMember();
		
		/*
		 * ArrayList() ����Ʈ �����ڸ� ȣ���Ͽ� �迭 ũ�⸦ �������� ������ ũ�Ⱑ 10��¥�� �迭�� �⺻���� ���������.
		 * �̸� �迭�� �뷮(capacity)�̶�� �Ѵ�.
		 * ArrayList(int) �����ڸ� ����ϸ� �ʱ⿡ ������ �迭�� �뷮�� ������ ���� �ִ�.
		 * 
		 * �迭�� ��Ҹ� �߰��Ͽ� 3�� �׸��� �ִٰ� �� �� size() �޼��带 ȣ���ϸ� ��ȿ�� ���� ����� ��� ���� 3�� ��ȯ�ȴ�.
		 * �̴� �迭 �뷮���� �ٸ� �ǹ��̴�.
		 * ArrayList�� ��Ҹ� �߰��ϸ� ó�� ������ �뷮�� ������ �� �ִ�.
		 * �⺻���� 10���� ������� ��� 11��° ��Ҹ� �߰��ϸ� ��� �ɱ�? ArrayList�� ��Ұ� �߰��Ǵ� add()�� insert() ���� �޼���� �뷮�� �����ϸ� ū �뷮�� �迭�� ���� ����� ���� �׸��� �����Ѵ�.
		 */
		
		/*
		 * Vector�� ArrayList�� ���̴� ����ȭ ����
		 * Vector : ����ȭ ����
		 * ArrayList : ����ȭ ���� X
		 * ArrayList�� ����ؼ� �����ߴµ� ���߿� ���α׷����� ����ȭ�� �ʿ��ϴٸ� Vector�� �ٲ��� �ʰ� ������ ���� ArrayList ���� �ڵ带 ���� �ȴ�.
		 * Collections.synchronizedList(new ArrayList<String>());
		 */
	}

}
