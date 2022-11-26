package object;

/*
 * �ؽô� ������ �����ϰų� �˻��� �� ����ϴ� �ڷ� �����̴�.
 * ������ ��� ������ ������, ��� ������ ������ �ؽ� �Լ��� ����Ͽ� �����Ѵ�.
 * �ؽ� �Լ��� ��ü�� Ư¡ ����(Ű ��)�� �Ű����� ������ ������ �� ��ü�� ����Ǿ�� �� ��ġ�� ����� �ؽ� ���̺� �ּ�(��ġ)�� ��ȯ�Ѵ�.
 * ���� ��ü ������ �˸� �ش� ��ü�� ��ġ�� ������ �˻��� �� �ִ�.
 * 
 * �ڹٿ����� �ν��Ͻ��� �� �޸𸮿� �����Ͽ� ������ �� �ؽ� �˰����� ����Ѵ�.
 * hashCode = hash(key);
 * 
 * �ڹٿ����� �� �ν��Ͻ��� ���ٸ� hashCode() �޼��忡�� ��ȯ�ϴ� �ؽ� �ڵ� ���� ���ƾ� �Ѵ�.
 * ���� �������� ���� �� ��ü�� ���� �ؽ� �ڵ� ���� ��ȯ�ϵ��� hashCode() �޼��带 �������ؾ� �Ѵ�.
 * �ٽ� ����, equals() �޼��带 �������ߴٸ� hashCode() �޼��嵵 �������ؾ� �Ѵ�.
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
