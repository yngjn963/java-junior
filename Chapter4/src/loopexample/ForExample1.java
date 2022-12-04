package loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for (i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		for (i = 1; i <= 10; i++) {
			System.out.println("안녕하세요" + i);
		}
		
		//for문 요소 생략하기
		//초기화식 생략
		for (; i < 5; i++) {
			
		}
		//조건식 생략
		for (i = 0; ; i++) {
			if (sum > 200) break;
		}
		//증감식 생략
		//증감식의 연산이 복잡하거나 다른 변수의 연산 결과 값에 좌우된다면 증감식을 생략하고 for문 안에 쓸 수 있다.
		for (i = 0; i < 5;) {
			i = (++i) % 10;
		}
		//요소 모두 생략
		//무한 반복
		for (; ;) {
			
		}
	}

}
