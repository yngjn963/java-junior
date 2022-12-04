package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		/*
		 * String 클래스는 한번 생성되면 그 내부의 문자열이 변경되지 않기 때문에 String 클래스를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을 작성하면 메모리가 많이 낭비된다.
		 * 이 문제를 해결하는 것이 바로 StringBuffer와 StringBuilder 클래스이다.
		 * 
		 * StringBuffer와 StringBuilder는 내부에 변경 가능한(final이 아닌) char[]를 변수로 가지고 있다.
		 * 이 두 클래스를 사용하여 문자열을 연결하면 기존에 사용하던 char[] 배열이 확장되므로 추가 메모리를 사용하지 않는다.
		 * 따라서 문자열을 연결하거나 변경할 경우 두 클래스 중 하나를 사용하면 된다.
		 * 두 클래스의 차이는 여러 작업(스레드)이 동시에 문자열을 변경하려 할 때 문자열이 안저하게 변경되도록 보장해 주는가 그렇지 않은가의 차이이다.
		 * StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장하지만, StringBuilder 클래스는 보장되지 않는다.
		 * 프로그램에서 따로 스레드를 생성하는 멀티스레드 프로그램이 아니라면 StringBuilder를 사용하는 것이 실행 속도가 좀 더 빠르다.
		 */
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 문자열 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 문자열 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
