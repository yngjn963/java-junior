package stream.others;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 * File 클래스는 말그대로 파일이라는 개념을 추상화한 클래스이다.
 * 파일에 대한 입출력은 지금까지 배운 스트림을 사용하여 수행한다.
 * 따라서 File 클래스에 별도의 입출력 기능은 없지만 파일 자체의 경로나 정보를 알 수 있고 파일을 생성할 수도 있다.
 */

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\easyspub\\JAVA_LAB\\Chapter15\\newFile.txt"); // 해당 경로에 File 클래스 생성. 아직 실제 파일이 생성된 것은 아님
		file.createNewFile(); // 실제 파일 생ㅅ어
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite()); // 파일의 속성들을 살펴보는 메서드 호출하여 출력
		
		file.delete(); // 파일 삭제
	}

}
