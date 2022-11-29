package generics;

public class GenericPrinter<T extends Material> {
	/*
	 * <T extends Material>이라고 명시하여 사용할 수 있는 자료형에 제한을 둘 수 있다.
	 * 만약 Material 클래스를 상속받지 않은 Water 클래스를 사용하면 오류가 발생하게 된다.
	 * 
	 * <T extends Material>로 선언하면 제네릭 클래스를 사용할 때 상위 클래스 Material에서 선언한 메서드를 사용할 수도 있다.
	 * 아래 T 타입의 material의 경우
	 * <T> : Object 클래스가 기본으로 제공하는 메서드만 사용 가능. 왜냐하면 자료형을 알 수 없기 때문이다.
	 * <T extends Material> : 상위 클래스 Material에서 선언하거나 구현한 메서드를 모두 사용할 수 있다. 실제로 컴파일할 때 내부적으로 T 자료형이 Object가 아닌 Material로 변환되기 때문이다.
	 */
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
