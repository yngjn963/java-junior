package generics;

/*
 * 대부분은 하나의 자료형으로 구현하지만, 변수나 메서드의 자료형을 필요에 따라 여러 자료형으로 바꿀 수 있다면 프로그램이 훨씬 유연할 것이다.
 * 이와 같이 어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍하는 것을 '제네릭(Generic) 프로그래밍'이라고 한다.
 * 
 * <> : 다이아몬드 연산자
 * 
 * 자료형 매개변수 T와 static
 * T의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 순간이다.
 * 따라서 T의 자료형이 결정되는 시점보다 빠르기 때문에 static 변수의 자료형이나 static 메서드 내부 변수의 자료형으로 T를 사용할 수 없다.
 * 
 * 제네릭 클래스를 사용할 때 T 위치에 사용한 Powder형을 '대입된 자료형'이라고 하고, Powder를 대입해 만든 GenericPrinter<Powder>를 '제네릭 자료형'이라고 한다.
 */

public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
