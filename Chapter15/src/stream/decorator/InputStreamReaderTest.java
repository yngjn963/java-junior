package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조 스트림
 * 보조 스트림은 입출력 대상이 되는 파일이나 네트워크에 직접 쓰거나 읽는 기능은 없다.
 * 말 그대로 보조 기능을 추가하는 스트림이다.
 * 이 보조 기능은 여러 스트림에 적용할 수 있다.
 * 
 * 보조 스트림은 다른 말로 Wrapper 스트림이라고도 한다.
 * 다른 스트림을 감싸고 있다는 의미이다.
 * 스스로는 입출력 기능이 없기 때문에 생성자의 매개변수로 다른 스트림을 받게 되면 자신이 감싸고 있는 스트림이 읽거나 쓰는 기능을 수행할 때 보조 기능을 추가한다.
 * 
 * FilterInputStream과 FilterOutputStream은 보조 스트림의 상위 클래스이다.
 * 모든 보조 스트림은 FilterInputStream이나 FilterOutputStream을 상속받는다.
 * 
 * 우리가 보조 스트림을 배울 때 기억할 사항은 보조 스트림의 생성자에 항상 기반 스트림만 매개변수로 전달되는 것은 아니라는 점이다.
 * 때로는 또 다른 보조 스트림을 매개변수로 전달받을 수도 있다.
 * 이때 전달되는 또 다른 보조 스트림은 내부적으로 기반 스트림을 포함하고 있다.
 * 이런 경우 다음 그림처럼 하나의 기반 스트림에 여러 보조 스트림 기능이 추가된다.
 * +-----------+ +--------+  +--------+
 * |바이트 단위      |+|문자로 변환| +|버퍼링 기능|
 * |파일 입력 스트림| |기능 추가   |  |추가        |
 * +-----------+ +--------+  +--------+
 *   기반 스트림         보조 스트림        보조 스트림
 * 
 * 바이트 자료만 입력되는 스트림도 있다.
 * 또한 네트워크에서 소켓이나 인터넷이 연결되었을 때 읽거나 쓰는 스트림은 바이트 단위인 InputStream과 OutputStream이다.
 * 이렇게 생성된 바이트 스트림을 문자로 변환해주는 보조 스트림이 InputStreamReader와 OutputStreamWriter이다.
 * 
 * InputStreamReader 생성자의 매개변수로 바이트 스트림과 문자 세트를 매개변수로 지정할 수 있다.
 * 문자 세트란 문자를 표현하는 인코딩 방식이다.
 * 바이트 자료가 문자로 변환될 때 지정된 문자 세트가 적용된다.
 * 적용한 문자 세트를 명시하지 않으면 시스템이 기본으로 사용하는 문자 세트가 적용된다.
 */

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * 표준 입출력 스트림 System.in과 System.out은 모두 바이트 스트림이다.
		 * 특히 System.in은 콘솔 화면에서 한글을 읽으려면 InputStreamReader를 사용해야 한다.
		 * Scanner 클래스는 이런 변환이 필요 없어 콘솔 입력에 많이 쓰인다.
		 * 네트워크에서 쓰이는 클래스는 스트림을 생성하면 InputStream이나 OutputStream으로 생성된다.
		 * 예를 들어 채팅 프로그램을 만든다고 할 때 바이트 단위로 사용하면 영어로만 채팅을 해야 한다.
		 * 이럴 때 읽어 들인 자료를 InputStreamReader나 OutputStreamWriter를 활용해 문자로 변환하여 사용한다.
		 */
	}

}
