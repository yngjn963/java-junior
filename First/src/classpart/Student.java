package classpart;

public class Student {
	//��ħ�� �Ͼ�� -> �Ĵ´� -> ���� �Դ´� -> ������ ź�� -> ����� �����Ѵ� -> �б��� ����
	//���� �ð������� ���α׷����ϴ� ���� ���� ���� ���α׷���
	//�ݸ鿡 ��ü ���� ���α׷����̶� ��ü�� �����ϰ� ��ü �� ������ ���α׷����ϴ� ��
	//����� �Ǵ� ��ü�� ã�ƺ��� �л�, ��, ����, �б� ��
	//�׸��� '���� �Դ´�'�� �ൿ�� '�л�'�̶�� ��ü�� '��'�̶�� ��ü�� �־� �л��� ���� �Դ� �������� �̷������.
	//'������ ź��'�� �ൿ�� ������ ���� '�л�' ��ü�� '����' ��ü�� Ÿ�� �ൿ�� �߻��ϴ� ��
	int studentID;		//�й�
	String studentName;	//�л� �̸�
	int grade;			//�г�
	String address;		//��� ��
	//�̷��� Ŭ���� ���ο� �����Ͽ� ��ü �Ӽ��� ��Ÿ���� ������ ��� ����(member variable)
	
	//Ŭ���� ���ο��� ��� ������ ����Ͽ� Ŭ���� ����� ������ ���� '��� �Լ�(member function)' �Ǵ�'�޼���(method)'��� �Ѵ�.
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);	//�̸�, �ּ� ���
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();	//Student Ŭ���� ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
