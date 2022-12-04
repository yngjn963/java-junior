package classpart;

public class Student {
	//아침에 일어난다 -> 씻는다 -> 밥을 먹는다 -> 버스를 탄다 -> 요금을 지불한다 -> 학교에 도착
	//일을 시간순으로 프로그래밍하는 것을 절차 지향 프로그래밍
	//반면에 객체 지향 프로그래밍이란 객체를 정의하고 객체 간 협력을 프로그래밍하는 것
	//대상이 되는 객체를 찾아보면 학생, 밥, 버스, 학교 등
	//그리고 '밥을 먹는다'는 행동은 '학생'이라는 객체와 '밥'이라는 객체가 있어 학생이 밥을 먹는 협력으로 이루어진다.
	//'버스를 탄다'는 행동을 생각해 보면 '학생' 객체가 '버스' 객체에 타는 행동이 발생하는 것
	int studentID;		//학번
	String studentName;	//학생 이름
	int grade;			//학년
	String address;		//사는 곳
	//이렇게 클래스 내부에 선언하여 객체 속성을 나타내는 변수가 멤버 변수(member variable)
	
	//클래스 내부에서 멤버 변수를 사용하여 클래스 기능을 구현한 것을 '멤버 함수(member function)' 또는'메서드(method)'라고 한다.
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);	//이름, 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();	//Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
