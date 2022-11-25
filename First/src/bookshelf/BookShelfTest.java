package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		/*
		 * 실무에서 인터페이스를 사용하는 경우
		 * 인터페이스는 클래스가 제공할 기능을 선언하고 설계하는 것이다.
		 * 만약 여러 클래스가 같은 메서드를 서로 다르게 구현한다면 어떻게 해야 할까?
		 * 우선 인터페이스에 메서드를 선언한 다음 인터페이스를 구현한 각 클래스에서 같은 메서드에 대해 다양한 기능을 구현하면 된다.
		 * 이것이 바로 인터페이스를 이용한 다형성의 구현이다.
		 * 
		 * 어느 회사에서 시스템을 개발한 상황
		 * 이 시스템은 자료를 저장하기 위해 데이터베이스를 사용한다.
		 * 처음에는 MySQL 데이터베이스를 사용했는데, 이 시스템을 다른 회사에 가서 설치하려고 하니 오라클 데이터베이스를 사용하여 설치해 달라고 요구한다.
		 * 또 다른 회사는 MS-SQL을 사용한다고 한다.
		 * 프로그램은 하나인데 사용하는 데이터베이스가 제각각인 것이다.
		 * 이 프로그램의 웹 페이지나 모바일 페이지는 데이터베이스와 관계없이 수행된다.
		 * 데이터베이스와 연관되는 코드는 프로그램의 특정 부분인 것이다.
		 * 이런 경우에 데이터베이스 기능을 수행할 인터페이스를 정의한다.
		 * 그리고 인터페이스 정의에 맞게 여러 데이터베이스 관련 모듈을 개발하면 된다.
		 * 사용자 정보를 처리하는 모듈 그림
		 * UserInfoWeb -------------------- UserInfoDao
		 *                                       |
		 *                             +---------|---------+
		 *                             |         |         |
		 *                         OracleDao  MysqlDao  MssqlDao
		 * 
		 * 사용자 정보를 데이터베이스에 입력하거나 업데이트하거나 삭제하는 기능을 UserInfoDao 인터페이스에서 정의한다.
		 * 그리고 여러 데이터베이스에 맞게 구현하는 것은 각 클래스가 담당한다.
		 * 웹 페이지나 그 밖의 다른 클래스에서 이 기능이 필요하다면 UserInfoDao 인터페이스를 구현하여 사용할 수 있다.
		 * 인터페이스를 잘 정의하는 것이 확장성 있는 프로그램을 만드는 시작이다.
		 */
	}

}
