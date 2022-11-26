package object;

/*
 * 해시는 정보를 저장하거나 검색할 때 사용하는 자료 구조이다.
 * 정보를 어디에 저장할 것인지, 어디서 가져올 것인지 해시 함수를 사용하여 구현한다.
 * 해시 함수는 객체의 특징 정보(키 값)를 매개변수 값으로 넣으면 그 객체가 저장되어야 할 위치나 저장된 해시 테이블 주소(위치)를 반환한다.
 * 따라서 객체 정보를 알면 해당 객체의 위치를 빠르게 검색할 수 있다.
 * 
 * 자바에서는 인스턴스를 힙 메모리에 생성하여 관리할 때 해시 알고리즘을 사용한다.
 * hashCode = hash(key);
 * 
 * 자바에서는 두 인스턴스가 같다면 hashCode() 메서드에서 반환하는 해시 코드 값이 같아야 한다.
 * 따라서 논리적으로 같은 두 객체도 같은 해시 코드 값을 반환하도록 hashCode() 메서드를 재정의해야 한다.
 * 다시 말해, equals() 메서드를 재정의했다면 hashCode() 메서드도 재정의해야 한다.
 */

public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}
