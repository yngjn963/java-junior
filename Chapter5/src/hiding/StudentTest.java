package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "�̻��";	//���� �߻�
		
		System.out.println(studentLee.getStudentName());
		/*
		 * ������ public���� �����ϴ� �Ͱ� ������ private���� �����ϰ� ���� �� ������ ����� �� �ֵ��� public �޼��带 �����ϴ� ���� ���̴� �����ϱ�?
		 * ������ ������ �����ϴ� ���� ������������,
		 * Ŭ������ ��� ������ public���� �����ϸ� ������ ���ѵ��� �����Ƿ� ������ ������ �߻��� �� �ִ�.
		 * �̷� ��쿡�� ������ ������ �� ���� �ش� ������ ���Ե��� ���ϵ��� ������ private���� �ٲٰ� public �޼���(�޼��� ���ο��� ������ �ο��Ͽ� ���� ������ �Էµ��� �ʵ���)�� ������ �����ؾ� �Ѵ�.
		 */
	}

}
