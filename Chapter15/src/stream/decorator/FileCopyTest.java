package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 입출력이 한 바이트나 문자 단위로 이루어지면 그만큼 프로그램 수행 속도가 느려진다.
 * Buffered 스트림은 내부적으로 8,192바이트 크기의 배열을 가지고 있으며 이미 생성된 스트림에 배열 기능을 추가해 더 빠르게 입출력을 실행할 수 있는 버퍼링 기능을 제공한다.
 * 당연히 한 바이트나 한 문자 단위로 처리할 때보다 훨씬 빠르게 처리할 수 있다.
 * 버퍼링 기능을 제공하는 스트림 클래스
 * BufferedInputStream	: 바이트 단위로 읽는 스트림에 버퍼링 기능을 제공한다.
 * BufferedOutputStream	: 바이트 단위로 출력하는 스트림에 버퍼링 기능을 제공한다.
 * BufferedReader		: 문자 단위로 읽는 스트림에 버퍼링 기능을 제공한다.
 * BufferedWriter		: 문자 단위로 출력하는 스트림에 버퍼링 기능을 제공한다.
 */

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		
		try (FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("copy.zip")) {
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
	}

}
