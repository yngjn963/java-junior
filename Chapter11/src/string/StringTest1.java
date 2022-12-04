package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";//생성자를 이용하지 않고 바로 문자열 상수를 가리키는 경우에는 "abc"라는 문자열 상수의 메모리 주소를 가리키게 된다.
		//abc와 같이 프로그램에서 사용되는 상수 값을 저장하는 공간을 '상수 풀(constant pool)'이라고 한다.
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
