package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이상원";	//오류 발생
		
		System.out.println(studentLee.getStudentName());
		/*
		 * 변수를 public으로 선언하는 것과 변수를 private으로 선언하고 나서 그 변수를 사용할 수 있도록 public 메서드를 제공하는 것의 차이는 무엇일까?
		 * 어차피 변수에 접근하는 것은 마찬가지지만,
		 * 클래스의 멤버 변수를 public으로 선언하면 접근이 제한되지 않으므로 정보의 오류가 발생할 수 있다.
		 * 이런 경우에는 오류가 나더라도 그 값이 해당 변수에 대입되지 못하도록 변수를 private으로 바꾸고 public 메서드(메서드 내부에서 조건을 부여하여 오류 정보가 입력되지 않도록)를 별도로 제공해야 한다.
		 */
	}

}
