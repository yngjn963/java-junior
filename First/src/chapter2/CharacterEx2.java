package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		/*
		 * 문자열 끝에는 항상 널 문자('\0')가 있다.
		 * 널 문자는 문자열의 끝을 나타낸다.
		 * 문자와 문자열은 전혀 다른 값을 가진다.
		 * 즉 'A'와 "A"는 다른 값이다.
		 * 'A'는 정수 값 65로 정해져 있는 문자이고, "A"는 그 내부를 살펴보면 "A\0"과 같이 쓰인다.
		 */
		char ch1 = '한';
		char ch2 = '\uD55C';	//\uD55C는 '한'이라는 글자의 유니코드 값이고 16진수로 나타내고 있다.
	}

}
