package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		//static ������ �ν��Ͻ� �������� �����̹Ƿ� �ν��Ͻ����� ���� �����ȴ�.
		//�׷��Ƿ� �ν��Ͻ��� �ƴ� Ŭ���� �̸����ε� �����Ͽ� ����� �� �ִ�.
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(Student1.serialNum);	//serialNum ������ ���� Ŭ���� �̸����� ����
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student1.serialNum);	//serialNum ������ ���� Ŭ���� �̸����� ����
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
	}

}
