package generics;

public class GenericMethod {
	
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	/*
	 * ���׸� Ŭ������ �ƴ϶� ���ο� ���׸� �޼��带 ������ �� �ִ�.
	 * 
	 * ���׸� Ŭ���� Shape<T> �ȿ� ���׸� �޼��带 �����ߴٰ� �����ϸ�
	 * Shape<T>���� ����� T�� makeRectangle()���� ����� T�� ���� �ٸ� �ǹ��̴�.
	 * makeRectangle() �޼��忡�� ����� T�� �޼��� �������� ��ȿ�ϴ�.
	 */

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� " + rect + "�Դϴ�.");
	}

}
