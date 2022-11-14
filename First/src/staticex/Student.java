package staticex;

public class Student {
	/*
	 * 클래스 전반에서 공통으로 사용할 수 있는 기준 변수
	 * 그리고 학생이 한 명 생성될 때마다 기준 변수 값을 하나씩 증가시켜 각 학생 인스턴스의 학번 변수에 대입해 주면 된다.
	 * 이 때 클래스에서 공통으로 사용하는 변수를 'static 변수'로 선언한다.
	 * 
	 * static 변수는 클래스 내부에 선언하지만, 다른 멤버 변수처럼 인스턴스가 생성될 때마다 새로 생성되는 변수가 아니다.
	 * static 변수는 프로그램이 실행되어 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당된다.
	 * 그리고 그 값은 모든 인스턴스가 공유한다.
	 * 다시 말하면 일반 멤버 변수는 인스턴스가 생성될 때마다 새로 생성되어 각각 다른 studentName을 가지게 되지만, static으로 선언한 변수는 인스턴스 생성과 상관없이 먼저 생성되고 그 값을 모든 인스턴스가 공유하게 되는 것이다.
	 * 이런 이유 때문에 static 변수를 클래스에 기반한 변수라고 해서 '클래스 변수(class variable)'라고도 한다.
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
