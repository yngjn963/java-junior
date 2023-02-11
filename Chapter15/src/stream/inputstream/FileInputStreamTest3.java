package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
//				for (byte b : bs) {
				for (int j = 0; j < i; j++) { // 전체 배열을 출력하는 것이 아닌 바이트 수만큼, 즉 i 개수만큼 출력하도록 한다.
					System.out.println((char)bs[j]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		/*
		 * 마지막에 6바이트를 읽었는데 출력 값은 Z 이후에 QRST가 더 출력되었다.
		 * bs 배열을 보면 두 번째 읽을 때 K~T까지 10개 알파벳을 저장했다.
		 * 그러고 나서 마지막으로 U~Z까지 저장할 때 새로 읽어 들인 6개 외에 남은 4개 공간에는 기존 자료가 남아 있다.
		 * 따라서 6개만 읽었는데 bs 전체를 출력하면 QRST가 더 출력되는 것이다.
		 */
	}

}
