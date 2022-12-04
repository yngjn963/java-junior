package inheritance2;

public class Subject {
	/*
	 * 상속을 항상 사용하는 것이 좋을까?
	 * 그렇지 않다.
	 * IS-A 관계 : 일반적인 개념과 구체적인 개념의 관계.
	 * 일반 클래스를 점차 구체화하는 상황에서 상속을 사용하는 것
	 * 상속을 사용하면 하위 클래스가 상위 클래스형에 종속되기 때문에 이질적인 클래스 간에는 상속을 사용하지 않는 것이 좋다.
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
	 * Student 클래스를 만들고자 한다면,
	 * 모든 학생은 전공 과목을 가지고 있다. 그러므로 Subject 클래스에서 제공하는 여러 메서드를 활용하면 좋을 것 같다. 이런 경우 상속?
	 * 아니다. 왜냐하면 Subject가 Student를 포괄하는 개념의 클래스가 아니기 때문이다.
	 * 또한 Student 클래스를 상속받는 다른 클래스가 있을 수도 있다.
	 * 이런 경우에는 'HAS-A 관계'로 표현한다.
	 * HAS-A 관계란 한 클래스가 다른 클래스를 소유한 관계이다. Subject는 Student에 포함되어 Student의 멤버 변수로 사용하는 것이 적절하다
	 */
}
