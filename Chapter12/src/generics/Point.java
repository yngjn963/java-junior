package generics;

public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {//제너릭 메서드
		return x;
	}
	
	public V getY() {//제너릭 메서드
		return y;
	}
}
