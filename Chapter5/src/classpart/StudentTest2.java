package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		/*
		 * ���� ������ �� �޸𸮿� ������ �ν��Ͻ��� ����Ų��.
		 */
		Student student1 = new Student();
		student1.studentName = "�ȿ���";
		Student student2 = new Student();
		student2.studentName = "�Ƚ¿�";
		
		System.out.println(student1);
		System.out.println(student2);	//���� ���� �� ���
		/*
		 * �� �޸𸮿� ������ �ν��Ͻ��� �޸� �ּҴ� ���� ������ ����ȴ�.
		 * ��� ������ Ȯ���� ���� 'Ŭ���� �̸�@�ּ� ��'
		 * ���⿡ ������ �ּ� ���� �ٸ� ���� �ؽ� �ڵ�(hash code) ���̶�� �Ѵ�.
		 * �� ���� �ڹ� ���� �ӽſ��� ��ü�� �����Ǿ��� �� ������ ��ü�� �Ҵ��ϴ� ���� �ּ� ���̴�.
		 */
	}

}
