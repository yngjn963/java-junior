package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();	//Student 클래스 생성
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		//객체 : 의사나 행위가 미치는 대상
		//클래스 : 객체를 코드로 구현한 것
		//인스턴스 : 클래스가 메모리 공간에 생성된 상태
	}

}
