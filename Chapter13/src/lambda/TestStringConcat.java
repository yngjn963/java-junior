package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
//		StringConcatImpl concat1 = new StringConcatImpl();
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
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
