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
	 * 제네릭 클래스가 아니라도 내부에 제네릭 메서드를 구현할 수 있다.
	 * 
	 * 제네릭 클래스 Shape<T> 안에 제네릭 메서드를 선언했다고 가정하면
	 * Shape<T>에서 사용한 T와 makeRectangle()에서 사용한 T는 전혀 다른 의미이다.
	 * makeRectangle() 메서드에서 사용한 T는 메서드 내에서만 유효하다.
	 */

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}

}
