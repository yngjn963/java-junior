package inheritance2;

public class Subject {
	/*
	 * ����� �׻� ����ϴ� ���� ������?
	 * �׷��� �ʴ�.
	 * IS-A ���� : �Ϲ����� ����� ��ü���� ������ ����.
	 * �Ϲ� Ŭ������ ���� ��üȭ�ϴ� ��Ȳ���� ����� ����ϴ� ��
	 * ����� ����ϸ� ���� Ŭ������ ���� Ŭ�������� ���ӵǱ� ������ �������� Ŭ���� ������ ����� ������� �ʴ� ���� ����.
	 */
	private int subjectID;
	private int subjectName;
	
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public int getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(int subjectName) {
		this.subjectName = subjectName;
	}
	
	public void showSubjectInfo() {
		System.out.println(subjectID + "," + subjectName);
	}
	/*
	 * Student Ŭ������ ������� �Ѵٸ�,
	 * ��� �л��� ���� ������ ������ �ִ�. �׷��Ƿ� Subject Ŭ�������� �����ϴ� ���� �޼��带 Ȱ���ϸ� ���� �� ����. �̷� ��� ���?
	 * �ƴϴ�. �ֳ��ϸ� Subject�� Student�� �����ϴ� ������ Ŭ������ �ƴϱ� �����̴�.
	 * ���� Student Ŭ������ ��ӹ޴� �ٸ� Ŭ������ ���� ���� �ִ�.
	 * �̷� ��쿡�� 'HAS-A ����'�� ǥ���Ѵ�.
	 * HAS-A ����� �� Ŭ������ �ٸ� Ŭ������ ������ �����̴�. Subject�� Student�� ���ԵǾ� Student�� ��� ������ ����ϴ� ���� �����ϴ�
	 */
}
