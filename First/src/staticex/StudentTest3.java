package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		//static 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼저 생성된다.
		//그러므로 인스턴스가 아닌 클래스 이름으로도 참조하여 사용할 수 있다.
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);	//serialNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);	//serialNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
	}

}
