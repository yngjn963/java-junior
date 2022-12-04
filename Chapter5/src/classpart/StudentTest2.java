package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		/*
		 * 참조 변수는 힙 메모리에 생성된 인스턴스를 가리킨다.
		 */
		Student student1 = new Student();
		student1.studentName = "안연수";
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student2);	//참조 변수 값 출력
		/*
		 * 힙 메모리에 생성된 인스턴스의 메모리 주소는 참조 변수에 저장된다.
		 * 출력 내용을 확인해 보면 '클래스 이름@주소 값'
		 * 여기에 나오는 주소 값은 다른 말로 해시 코드(hash code) 값이라고도 한다.
		 * 이 값은 자바 가상 머신에서 객체가 생성되었을 때 생성된 객체에 할당하는 가상 주소 값이다.
		 */
	}

}
