package chapter2;

public class LongVariable {

	public static void main(String[] args) {
		//int num1 = 12345678900;	//int형으로 표현할 수 있는 범위를 넘어섰기 때문에 오류
		//long num2 = 12345678900;	//자바는 모든 정수 값을 기본으로 int형으로 처리하기 때문에 long형으로 처리하라고 별도로 컴파일러에게 알려줘야 한다.
		//long num = 12345678900L;
		long num = 1000;	//int형 범위를 넘지 않으면 범위 내부에 있는 값을 사용할 수 있기 때문에 식별자가 필요 없다(int형이 long형으로 자동 형변환).
	}

}
