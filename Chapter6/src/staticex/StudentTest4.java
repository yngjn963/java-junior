package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum());	//serialNum 값을 가져오기 위해 get() 메서드를 클래스 이름으로 직접 호출
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());	//serialNum 값을 가져오기 위해 get() 메서드를 클래스 이름으로 직접 호출
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
	}

}
