package scheduler;

/*
 * 인터페이스는 클라이언트 프로그램에 어떤 메서드를 제공하는지 미리 알려주는 명세 또는 약속의 역할을 한다.
 * 예를 들어 Abc 인터페이스를 구현한 A 클래스가 있다.
 * 이 클래스를 사용하는 Z 프로그램이 있다고 가정하면, Abc 인터페이스에는 구현할 추상 메서드가 모두 선언되어 있고, 어떤 매개변수가 사용되는지, 어떤 자료형 값이 반환되는지 선언되어 있을 것이다.
 * 즉 Z 프로그램에서는 A 클래스의 구현 코드 전체를 살펴보지 않고 Abc 인터페이스의 선언부만 봐도 이 A 클래스를 어떻게 사용할지 알 수 있는 것이다.
 * 
 * 인터페이스의 역할은 인터페이스를 구현한 클래스가 어떤 기능의 메서드를 제공하는지 명시하는 것이다.
 * 그리고 클라이언트 프로그램은 인터페이스에서 약속한 명세대로 구현한 클래스를 생성해서 사용하면 된다.
 */

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
