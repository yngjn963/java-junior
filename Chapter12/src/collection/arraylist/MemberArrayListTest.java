package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		
		memberArrayList.showAllMember();
		
		/*
		 * ArrayList() 디폴트 생성자를 호출하여 배열 크기를 지정하지 않으면 크기가 10개짜리 배열이 기본으로 만들어진다.
		 * 이를 배열의 용량(capacity)이라고 한다.
		 * ArrayList(int) 생성자를 사용하면 초기에 생성할 배열의 용량을 지정할 수도 있다.
		 * 
		 * 배열에 요소를 추가하여 3개 항목이 있다고 할 때 size() 메서드를 호출하면 유효한 값이 저장된 요소 개수 3이 반환된다.
		 * 이는 배열 용량과는 다른 의미이다.
		 * ArrayList에 요소를 추가하면 처음 생성한 용량이 부족할 수 있다.
		 * 기본으로 10개가 만들어진 경우 11번째 요소를 추가하면 어떻게 될까? ArrayList의 요소가 추가되는 add()나 insert() 등의 메서드는 용량이 부족하면 큰 용량의 배열을 새로 만들고 기존 항목을 복사한다.
		 */
		
		/*
		 * Vector와 ArrayList의 차이는 동기화 여부
		 * Vector : 동기화 지원
		 * ArrayList : 동기화 지원 X
		 * ArrayList를 사용해서 구현했는데 나중에 프로그램에서 동기화가 필요하다면 Vector로 바꾸지 않고 다음과 같이 ArrayList 생성 코드를 쓰면 된다.
		 * Collections.synchronizedList(new ArrayList<String>());
		 */
	}

}
