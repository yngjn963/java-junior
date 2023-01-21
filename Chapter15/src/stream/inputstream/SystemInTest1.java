package stream.inputstream;

/*
 * 입출력은 프로그램의 가장 기본 기능이지만, 외부 저장 장치나 네트워크와 연동해야 하기 때문에 장치에 따라 다르게 구현해야 한다.
 * 자바는 장치에 따라 독립적이고 효율적인 입출력 기능을 제공한다.
 * 
 * 스트림이란?
 * 자바에서 모든 입출력은 스트림(stream)을 통해 이루어진다.
 * 스트림이란 네트워크에서 유래된 용어이다.
 * 자료 흐름이 몰의 흐름과 같다는 의미에서 사용되었다.
 * 입출력 장치는 매우 다양하기 때문에 장치에 따라 입출력 부분을 일일이 다르게 구현을 하면 프로그램 호환성이 떨어질 수밖에 없다.
 * 이런 문제를 해결하기 위해 자바는 입출력 장치와 무관하고 일관성 있게 프로그램을 구현할 수 있도록 일종의 가상 통로인 스트림을 제공하는 것이다.
 * 자료를 읽어 들이려는 소스(source)와 자료를 쓰려는 대상(target)에 따라 각각 다른 스트림 클래스를 제공한다.
 * 자바 응용 프로그램 -------------------- 입출력 자료
 *                  스트림(가상 통로)
 * 자바에서 입출력 기능을 사용하는 곳은 파일 디스크, 키보드, 모니터, 메모리 입출력, 네트워크 등이 있다.
 * 이러한 곳에서 모든 입출력 기능을 스트림 클래스로 제공한다.
 * 따라서 자바에서 자료를 입출력하려면 여러 스트림 클래스에 대해 알아야 하지만, 구현 방식이 서로 비슷하므로 크게 걱정할 필요가 없다.
 */

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
