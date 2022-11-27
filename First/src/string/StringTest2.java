package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));
		/*
		 * java 문자열을 가리키는 javaStr에 android 문자열이 연결된 것 같지만, 문자열은 불변하므로 javaStr 변수 값 자체가 변하는 것이 아니라 새로운 문자열이 생성되는 것이다.
		 */
	}

}
