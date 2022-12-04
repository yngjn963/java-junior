package singleton;

public class Company {
	/*
	 * 객체 지향 프로그램에서 인스턴스를 단 하나만 생성하는 디자인 패턴을 싱글톤 패턴이라고 한다.
	 * 싱글톤 패턴으로 회사 클래스 구현하기
	 * 단계 1 : 생성자를 private으로 만들기
	 * 단계 2 : 클래스 내부에 static으로 유일한 인스턴스 생성하기
	 */
	private static Company instance = new Company();	//유일하게 생성한 인스턴스
	private Company() {
		
	}
	/*
	 * 단게 3 : 외부에서 참조할 수 있는 public 메서드 만들기
	 */
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
