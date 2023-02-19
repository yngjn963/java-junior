package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); // 배열의 세 번째 위치부터 10개 바이트 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	/*
	 * flush() 메서드와 close() 메서드
	 * 출력 스트림에서 flush() 메서드의 기능은 강제로 자료를 출력하는 것이다.
	 * write() 메서드로 값을 썼다고 해도 바로 파일이나 네트워크로 전송되지 않고 출력을 위한 자료가 쌓이는 출력 버퍼에 어느 정도 자료가 모여야 출력된다.
	 * 따라서 자료의 양이 출력할 만큼 많이 않으면 write() 메서드로 출력했어도 파일에 쓰이지 않거나 전송되지 않을 수 있다.
	 * 이런 경우 flush() 메서드를 호출한다.
	 * 출력 스트림의 close() 메서드 안에서 flush() 메서드를 호출하여 출력 버퍼가 비워지면서 남아 있는 자료가 모두 출력된다.
	 */

}
