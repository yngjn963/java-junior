package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/*
 * ���α׷��Ӱ� ����� �����ϴ� reduce() ����
 * reduce() ������ ���������� ��Ʈ���� ��Ҹ� �ϳ��� �Ҹ��ϸ鼭 ���α׷��Ӱ� ���� ������ ����� �����Ѵ�.
 * reduce() �޼����� ���� : T reduce(T identify, BinaryOperator<T> accumulator)
 * ù ��° �Ű����� T identify�� �ʱ갪�� �ǹ��ϰ� �� ��° �Ű����� BinaryOperator<T> accumulator�� �����ؾ� �� ����̴�.
 * BinaryOperator �������̽��� �� �Ű������� ���ٽ��� �����ϸ� �� ���ٽ��� �� ��Ұ� �����ؾ� �� ����� �ȴ�.
 * �̶� BinaryOperator �������̽��� ������ ���ٽ��� ���� �ᵵ �ǰ�, ���ٽ��� ��� �������̽��� ������ Ŭ������ �����Ͽ� �����ص� �ȴ�.
 * ���� BinaryOperator�� �Լ��� �������̽��� apply() �޼��带 �ݵ�� �����ؾ� �Ѵ�.
 * apply() �޼���� �� ���� �Ű������� �� ���� ��ȯ ���� �����µ�, �� �� ��� ���� �ڷ����̴�.
 * reduce() �޼��尡 ȣ��� �� BinaryOperator�� apply() �޼��尡 ȣ��ȴ�.
 * 
 * reduce() �޼��忡 � ���ٽ��� ���޵Ǵ��Ŀ� ���� �پ��� ������ ������ �� �ִ�.
 * reduce()�� ó������ ���������� ��� ��Ҹ� �Ҹ��ϸ鼭 ���ٽ��� �ݺ��ؼ� �����ϹǷ� ���� �����̴�.
 */

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) { //reduce() �޼��尡 ȣ��� �� �Ҹ��� �޼���, �� ���ڿ� ���̸� ��
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���~~~", "hello", "Good morning", "�ݰ����ϴ�^^"};
		System.out.println(Arrays.stream(greetings) .reduce("", (s1, s2) -> { //���ٽ��� ���� �����ϴ� ���. ���������� ���ٽ� �κ��� ��� ������ŭ �ݺ��ؼ� ȣ��
			//���ٽ����� ������ �κе� �͸� Ŭ������ �ν��Ͻ��� �����Ǵ� ���̹Ƿ� ���������δ� ������ ������ �� �� �ִ�.
			if (s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperator�� ������ Ŭ���� ���
		System.out.println(str);
	}

}
