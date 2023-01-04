package lambda;

/*
 * 객체 지향 프로그래밍 방식과 람다식 비교
 * 람다식을 사용하면 메서드의 구현부를 클래스에 만들고, 이를 다시 인스턴스로 생성하고 호출하는 코드가 줄어들기 때문에 기존 방식보다 간결한 코드를 구현할 수 있다.
 */

public interface StringConcat {
	public void makeString(String s1, String s2);
}
