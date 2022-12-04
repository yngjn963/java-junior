package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);	//serialNum 변수의 초깃값 출력
		studentLee.serialNum++;	//static 변수 값 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		//둘 다 1001로 증가된 serialNum 값이 출력되는 것을 알 수 있다.
		//static으로 선언한 serialNum 변수는 모든 인스턴스가 공유하기 때문이다.
		//즉 두 개의 참조변수가 동일한 변수의 메모리를 가리키고 있다는 것을 알 수 있다.
		//데이텨 영역 serialNum	-- 스택 메모리 studentLee -- 힙 메모리 studentLee 인스턴스
		//					-- 스택 메모리 studentSon -- 힙 메모리 studentSon 인스턴스 
	}

}
