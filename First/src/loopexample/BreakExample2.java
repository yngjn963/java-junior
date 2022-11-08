package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for (num = 0; ; num++) {	//조건식을 생략하는 대신 break문을 사용한다.
			sum += num;
			if (sum >= 100) {		//sum이 100보다 크거나 같을 때(종료 조건)
				break;				//반복문 중단
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		//break문의 위치
		while (0 == 0) {
			while (1 == 1) {
				if (2 == 2) {	//조건에 해당하는 경우
					break;		//내부 반복문만 빠져나옴
				}
			}
		}
	}

}
