package exception;

/*
 * 프로그램에서 오류가 발생하는 상황
 * 1. 프로그램 코드 작성 중 실수로 발생하는 컴파일 오류(compile error)
 * 2. 실행 중인 프로그램이 의도하지 않은 동작을 하거나 프로그램이 중지되는 실행 오류(runtime error)
 * 2.1. 실행 오류 중 프로그램을 잘못 구현하여 의도한 바와 다르게 실행되어 생기는 오류를 버그(bug)
 * 자바는 비정상 종료를 최대한 줄이기 위해 다양한 예외에 대한 처리 방법을 가지고 있다.
 * 예외 처리를 하는 목적은 일단 프로그램이 비정상 종료되는 것을 방지하기 위한 것이다.
 * 예외가 발생했을 때 로그를 남겨 두면 예외 상황을 파악하고 버그를 수정하는 데 도움을 받을 수 있다.
 * 
 * 실행 오류는 크게 두 가지
 * 1. 자바 가상 머신에서 발생하는 시스템 오류(error) : 시스템 오류의 예로는 사용 가능한 동적 메모리가 없는 경우나 스택 메모리의 오버플로가 발생한 경우
 * 이러한 시스템 오류는 프로그램에서 제어할 수 없다.
 * 2. 예외(exception)
 * 예외는 프로그램에서 제어할 수 있다.
 * 예를 들어 프로그램에서 파일을 읽어 사용하려는데 파일이 없는 경우, 네트워크로 데이터를 전송하려는데 연결이 안 된 경우, 배열 값을 출력하려는데 배열 요소가 없는 경우 등이다.
 * 자바에서 제공하는 오류에 대한 전체 클래스를 간단히 나타내면
 *      Throwable
 *          |
 *   +------+------+
 *   |             |
 * Error       Exception
 * 오류 클래스는 모두 Throwable 클래스에서 상속받는다.
 * Error 클래스의 하위 클래스는 시스템에서 발생하는 오류를 다루며 프로그램에서 제어하지 않는다.
 * 프로그램에서 제어하는 부분은 Exception 클래스와 그 하위에 있는 예외 클래스이다.
 * 
 * 예외 클래스의 종류
 * Exception 하위 클래스 중 사용 빈도가 높은 클래스 위주로 계층도를 표현하면
 *                                    Exception
 *                                        |
 *                    +-------------------+--------------------+
 *                    |                                        |
 *               IOException                            RuntimeException
 *                    |                                        |
 *          +---------+---------+                  +-----------+----------+
 *          |                   |                  |                      |
 * FileNotFoundException SocketException  ArithmeticException IndexOutofboundsException
 * 이클립스 같은 개발 환경에서는 예외가 발생하면 대부분 처리하라는 컴파일 오류 메시지를 띄운다.
 * 그런데 Exception 하위 클래스 중 RuntimeException은 try-catch문을 사용하여 예외 처리를 하지 않아도 컴파일 오류가 나지 않는다.
 * 예를 들어 RuntimeException 하위 클래스 중 ArithmeticException은 산술 연산 중 발생할 수 있는 예외, 즉 '0으로 숫자 나누기'와 같은 경우에 발생하는 예외이다.
 * 이러한 컴파일러에 의해 체크되지 않는 예외는 프로그래머가 알아서 처리해야 하므로 주의해야 한다.
 */

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");
		//발생한 예외는 catch 블록에서 처리하므로 System.out.println("프로그램 종료"); 문장까지 수행하고 프로그램이 정상 종료된다.
		//만약 예외가 발생하여 프로그램이 바로 비정상 종료되었다면 문장을 수행할 수 없
	}

}
