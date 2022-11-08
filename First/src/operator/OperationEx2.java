package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;			//게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;	//gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);	//151
		
		int lastScore2 = --gameScore;	//gameScore에서 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);	//150
		
		/*
		 * 증가,감소 연산자의 위치
		 * 증가,감소 연산자가 피연산자 앞에 있으면 문장이 끝나기 전에 피연산자 값이 증가하거나 감소한다.
		 */
		int value = 10;
		int num = ++value;	//num에 11이 대입됨
		//위 코드에서 증가 연산자가 피연산자 value 앞에 있는데 이때 num 값은 11이 된다.
		/*
		 * 반대로 증가,감소 연산자가 피연산자 뒤에 있으면 문장이 끝난 후에 피연산자 값이 증가하거나 감소한다.
		 */
		int value2 = 10;
		int num2 = value2++;	//num2에 10이 대입됨
		//위 코드처럼 증가 연산자가 피연산자 value 뒤에 있으면 value 값을 num에 먼저 대입한 후 1을 더하기 때문에 num 값은 10이 된다.
	}

}
