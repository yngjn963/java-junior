package generics;

public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {//���ʸ� �޼���
		return x;
	}
	
	public V getY() {//���ʸ� �޼���
		return y;
	}
}
