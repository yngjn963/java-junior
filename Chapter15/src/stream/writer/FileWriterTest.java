package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("안녕하세요. 잘 써지네요");	// 문자열 출력
			fw.write(buf, 1, 2);			// 문자 배열의 일부 출력
			fw.write("65");					// 숫자를 그대로 출력
			/*
			 * 앞에서 FileOutputStream을 사용했을 때 숫자 65를 출력하면 65의 아스키 코드 값에 해당하는 A가 보였다.
			 * 이는 한 바이트로 해석되어 출력되기 때문이다.
			 * 만약 그냥 숫자 65를 출력하고 싶다면 15행과 같이 FileWriter를 활용한다.
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
