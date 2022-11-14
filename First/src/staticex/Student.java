package staticex;

public class Student {
	/*
	 * Ŭ���� ���ݿ��� �������� ����� �� �ִ� ���� ����
	 * �׸��� �л��� �� �� ������ ������ ���� ���� ���� �ϳ��� �������� �� �л� �ν��Ͻ��� �й� ������ ������ �ָ� �ȴ�.
	 * �� �� Ŭ�������� �������� ����ϴ� ������ 'static ����'�� �����Ѵ�.
	 * 
	 * static ������ Ŭ���� ���ο� ����������, �ٸ� ��� ����ó�� �ν��Ͻ��� ������ ������ ���� �����Ǵ� ������ �ƴϴ�.
	 * static ������ ���α׷��� ����Ǿ� �޸𸮿� �ö��� �� �� �� �� �޸� ������ �Ҵ�ȴ�.
	 * �׸��� �� ���� ��� �ν��Ͻ��� �����Ѵ�.
	 * �ٽ� ���ϸ� �Ϲ� ��� ������ �ν��Ͻ��� ������ ������ ���� �����Ǿ� ���� �ٸ� studentName�� ������ ������, static���� ������ ������ �ν��Ͻ� ������ ������� ���� �����ǰ� �� ���� ��� �ν��Ͻ��� �����ϰ� �Ǵ� ���̴�.
	 * �̷� ���� ������ static ������ Ŭ������ ����� ������� �ؼ� 'Ŭ���� ����(class variable)'��� �Ѵ�.
	 * 
	 */
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
