package generics;

public class GenericPrinter<T extends Material> {
	/*
	 * <T extends Material>�̶�� ����Ͽ� ����� �� �ִ� �ڷ����� ������ �� �� �ִ�.
	 * ���� Material Ŭ������ ��ӹ��� ���� Water Ŭ������ ����ϸ� ������ �߻��ϰ� �ȴ�.
	 * 
	 * <T extends Material>�� �����ϸ� ���׸� Ŭ������ ����� �� ���� Ŭ���� Material���� ������ �޼��带 ����� ���� �ִ�.
	 * �Ʒ� T Ÿ���� material�� ���
	 * <T> : Object Ŭ������ �⺻���� �����ϴ� �޼��常 ��� ����. �ֳ��ϸ� �ڷ����� �� �� ���� �����̴�.
	 * <T extends Material> : ���� Ŭ���� Material���� �����ϰų� ������ �޼��带 ��� ����� �� �ִ�. ������ �������� �� ���������� T �ڷ����� Object�� �ƴ� Material�� ��ȯ�Ǳ� �����̴�.
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
