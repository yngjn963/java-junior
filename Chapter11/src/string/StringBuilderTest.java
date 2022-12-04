package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		/*
		 * String Ŭ������ �ѹ� �����Ǹ� �� ������ ���ڿ��� ������� �ʱ� ������ String Ŭ������ ����Ͽ� ���ڿ��� ��� �����ϰų� �����ϴ� ���α׷��� �ۼ��ϸ� �޸𸮰� ���� ����ȴ�.
		 * �� ������ �ذ��ϴ� ���� �ٷ� StringBuffer�� StringBuilder Ŭ�����̴�.
		 * 
		 * StringBuffer�� StringBuilder�� ���ο� ���� ������(final�� �ƴ�) char[]�� ������ ������ �ִ�.
		 * �� �� Ŭ������ ����Ͽ� ���ڿ��� �����ϸ� ������ ����ϴ� char[] �迭�� Ȯ��ǹǷ� �߰� �޸𸮸� ������� �ʴ´�.
		 * ���� ���ڿ��� �����ϰų� ������ ��� �� Ŭ���� �� �ϳ��� ����ϸ� �ȴ�.
		 * �� Ŭ������ ���̴� ���� �۾�(������)�� ���ÿ� ���ڿ��� �����Ϸ� �� �� ���ڿ��� �����ϰ� ����ǵ��� ������ �ִ°� �׷��� �������� �����̴�.
		 * StringBuffer Ŭ������ ���ڿ��� �����ϰ� ����ǵ��� ����������, StringBuilder Ŭ������ ������� �ʴ´�.
		 * ���α׷����� ���� �����带 �����ϴ� ��Ƽ������ ���α׷��� �ƴ϶�� StringBuilder�� ����ϴ� ���� ���� �ӵ��� �� �� ������.
		 */
		String javaStr = new String("java");
		System.out.println("javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer ���ڿ� �ּ� : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("���� �� buffer ���ڿ� �ּ� : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
	}

}
