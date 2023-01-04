package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
//		StringConcatImpl concat1 = new StringConcatImpl();
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
		/*
		 * �͸� ��ü�� �����Ѵ� ���ٽ�
		 * �ڹٴ� ��ü ���� ���. �ڹٴ� ��ü ���� ���� �޼��� ȣ���� �Ͼ �� ���µ� �� �޼���� ��� ȣ��Ǵ� ���ϱ�?
		 * �͸� ���� Ŭ������ Ŭ���� �̸� ���� �������̽� �ڷ��� ������ �ٷ� �޼��� �����θ� �����Ͽ� ������ �� �ִ�.
		 * �� ���ٽ����� �޼��带 �����ؼ� ȣ���ϸ� ��ǻ�� ���ο����� ����ó�� �͸� Ŭ������ �����ǰ� �̸� ���� �͸� ��ü�� �����Ǵ� ���̴�.
		 * StringConcat concat3 = new StringConcat() {
		 * 	@Override
		 * 	public void makeString(String s1, String s2) {
		 * 		System.out.println(s1 + "," + s2);
		 * 	}
		 * }
		 */
		
		/*
		 * ���ٽĿ��� ����ϴ� ���� ����
		 * �� ���ڿ��� �����ϴ� ���ٽ� �ڵ忡�� �ܺ� �޼����� ���� ������ i�� �����ϸ� ��� �ɱ�?
		 */
		int i = 100;	// main() �Լ��� ���� ����
		
		StringConcat concat3 = (s, v) -> {
			//i = 200; //���ٽ� ���ο��� �����ϸ� ���� �߻�
			//���� ������ �޼��� ȣ���� ������ �޸𸮿��� ������� ������ �͸� ���� Ŭ�������� ����ϴ� ��쿡�� ���� ������ ����� ���Ѵ�.
			//���ٽ� ���� �͸� ���� Ŭ������ �����ǹǷ� �ܺ� �޼����� ���� ������ ����ϸ� ������ final ����, �� ����� �ȴ�.
			//���� �� ������ �����ϸ� ������ �߻��Ѵ�.
			System.out.println(i);
			System.out.println(s + "," + v);
		};
	}

}
