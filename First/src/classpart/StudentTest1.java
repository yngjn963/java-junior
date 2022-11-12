package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();	//첫 번째 학생 생성
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student student2 = new Student();	//두 번째 학생 생성
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
		
		/*
		 * 인스턴스와 힙 메모리
		 * new Student()를 선언하면 Student 하나가 생성되는데 각 Student는 studentID, studentName 등의 멤버 변수를 가지고 있다.
		 * 이 변수를 저장할 공간이 있어야 한다.
		 * 이 때 사용하는 메모리가 힙 메모리(heap memory)
		 * 클래스 생성자를 하나 호출하면 인스턴스가 힙 메모리에 생성되는 것
		 * studentAhn 변수는 지역 변수이며, 지역 변수는 스택 메모리에 생성된다.
		 * 그리고 인스턴스는 힙 메모리에 생성된다.
		 * 지역 변수 studentAhn에 생성된 인스턴스를 대입하는 것은 studentAhn에 인스턴스가 생성된 힙 메모리의 주소를 대입한다는 것과 같은 의미이다.
		 * 
		 * 힙 메모리란?
		 * 힙(heap)은 프로그램에서 사용하는 동적 메모리 공간을 말한다. 일반적으로 프로그램은 스택, 힙, 데이터 이렇게 세 영역을 사용하는데, 객체가 생성될 때 사용하는 공간이 힙이다.
		 * 힙은 동적으로 할당되며 사용이 끝나면 메모리를 해제해 주어야 한다. C나 C++ 언어에서는 프로그래머가 직접 메모리를 해제해야 하지만, 자바에서는 가비지 컬렉터가 자동으로 메모리를 해제해 준다.
		 * 
		 * 두 개의 인스턴스 생성
		 * 생성된 두 인스턴스는 당연히 각각 다른 메모리 공간을 차지한다.
		 * 따라서 student1.studentName과 student2.studentName은 서로 다른 값을 가지게 된다.
		 * 클래스가 생성될 때마다 인스턴스는 다른 메모리 공간을 차지한다. 다시 말하면 멤버 변수를 저장하는 공간이 매번 따로 생긴다는 의미이다.
		 * 이런 이유 때문에 클래스에 선언한 멤버 변수를 다른 말로 '인스턴스 변수'라고도 부른다.
		 */
	}

}
