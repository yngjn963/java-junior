package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;	//두 실수가 각각 형 변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2);		//두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(iNum3);
		System.out.println(iNum4);
		//11행과 12행의 연산 결과가 다르다.
		//11행에서는 두 실수가 각각 명시적으로 형 변환이 일어난다. 따라서 1과 0으로 변환된 두 값을 합하여 결과 값이 1이 된다.
		//하지만 12행에서는 두 dNum1과 fNum2의 합을 먼저 계산한다. 이때 두 실수의 자료형이 다르지만, float형이 double형으로 변환되는 묵시적 형 변환이 되어 결과 값이 2가 된다.
	}

}
