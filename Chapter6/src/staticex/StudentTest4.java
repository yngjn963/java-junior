package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNum());	//serialNum ���� �������� ���� get() �޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2.getSerialNum());	//serialNum ���� �������� ���� get() �޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
	}

}
