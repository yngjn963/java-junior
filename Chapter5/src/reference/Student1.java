package reference;

public class Student1 {
	int studentID;
	String studentName;
//	int koreaScore;
//	int mathScore;
//	String koreaSubject;
//	String mathSubject; //과목 이름 변수 추가
	//이렇게 구현하면 이 클래스는 학생에 대한 클래스인데 과목에 대한 변수가 계속 늘어나고 있다.
	//이 문제를 해결하기 위해 과목의 이름과 성적을 Subject라는 클래스로 분리하고, 학생에 Subject 변수를 각 과목별로 추가해 보겠다.
	Subject korean;
	Subject math;
}
