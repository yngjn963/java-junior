package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		
		try (FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 " + millisecond + " milliseconds 소요되었습니다.");
		/*
		 * Buffered 스트림은 멤버 변수로 8,192바이트 배열을 가지고 있다.
		 * 즉 한 번 자료를 읽을 때 8KB 정보를 한 꺼번에 읽고 쓸 수 있으므로 1바이트씩 읽고 쓸 때보다 훨씬 빠른 수행을 보장한다.
		 * 배열의 크기는 Buffered 스트림 생성자 매개변수로 지정할 수도 있다.
		 */
		
		/*
		 * 소켓 통신에서 스트림 사용하기
		 * 채팅 프로그램을 만든다고 하자.
		 * 채팅을 하려면 서버와 채팅 클라이언트 프로그램이 서로 통신을 해야 한다.
		 * 자바는 통신을 위한 여러 클래스를 제공한다.
		 * 가장 간단하게 소켓 통신을 한다고 가정해 보자.
		 * 소켓이란 통신에 사용하는 네트워크 연결 리소스이다.
		 * 소켓 통신을 위해 자바는 Socket 클래스를 제공한다.
		 * Socket 클래스에서 스트림을 사용하는 방법은 다음과 같다.
		 * Socket socket = new Socket();
		 * InputStream is = socket.getInputStream();
		 * 
		 * 소켓 통신을 하기 위해 스트림을 가져올 때는 getInputStream()이나 getOutputStream()을 사용해야 한다.
		 * getInputStream() 메서드를 호출하면 InputStream이 반환된다.
		 * 그런데 InputStream은 바이트 단위 스트림이므로 한글을 쓰면 깨진다.
		 * 따라서 이를 문자로 변환해야 한다.
		 * 그리고 여기에 버퍼링 기능을 추가해 주면 더 빠르게 읽고 쓸 수 있다.
		 * 다음은 각 기능이 추가된 입출력 스트림 코드이다.
		 * Socket socket = new Socket();
		 * BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		 */
	}

}
