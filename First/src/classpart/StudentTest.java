package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();	//Student Ŭ���� ����
		studentAhn.studentName = "�Ƚ¿�";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		//��ü : �ǻ糪 ������ ��ġ�� ���
		//Ŭ���� : ��ü�� �ڵ�� ������ ��
		//�ν��Ͻ� : Ŭ������ �޸� ������ ������ ����
	}

}
