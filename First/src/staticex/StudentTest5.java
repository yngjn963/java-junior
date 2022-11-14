package staticex;

public class StudentTest5 {

	public static void main(String[] args) {
		System.out.println(Student2.getSerialNum());	//인스턴스 생성 없이 호출 가능
		
		//변수 유형에 따른 용도
		/*
		 * 지역 변수(로컬 변수)		-- 스택 메모리	-- 함수가 호출될 때 생성되고 함수가 끝나면 소멸함
		 * 멤버 변수(인스턴스 변수)	-- 힙 메모리	-- 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨
		 * static 변수(클래스 변수)	-- 데이터 영역	-- 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨
		 */
	}

}
