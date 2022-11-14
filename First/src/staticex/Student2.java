package staticex;

public class Student2 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
//		studentName = "이지원";	//오류 발생. serialNum의 get() 메서드(클래스 메서드임)
		//클래스 메서드 내부에서는 인스턴스 변수를 사용할 수 없다.
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
