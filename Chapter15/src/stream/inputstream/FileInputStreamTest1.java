package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream
 * 바이트 단위로 읽는 스트림 중 최상위 스트림이다.
 * InputStream은 추상 메서드를 포함한 추상 클래스로서 하위 클래스 스트림 클래스가 상속받아 각 클래스 역할에 맞게 추상 메서드 기능을 구현한다.
 * (OutputStream, Reader, Writer도 추상 클래스이고, 하위 클래스가 구현해야 할 추상 메서드가 선언되어 있다.)
 * 주로 사용하는 하위 클래스
 * 	   스트림 클래스							설명
 * FileInputStream			파일에서 바이트 단위로 자료를 읽는다.
 * ByteArrayInputStream		Byte 배열 메모리에서 바이트 단위로 자료를 읽는다.
 * FilterInputStream		기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스이다.
 * 
 * InputStream은 바이트 자료를 읽기 위해 다음 메서드를 제공한다.
 * 		메서드													설명
 * int read()							입력 스트림으로부터 한 바이트의 자료를 읽는다. 읽은 자료의 바이트 수를 반환한다.
 * int read(byte b[])					입력 스트림으로부터 b[] 크기의 자료를 b[]에 읽는다. 읽은 자료의 바이트 수를 반환한다.
 * int read(byte b[], int off, int len)	입력 스트림으로부터 b[] 크기의 자료를 b[]의 off 변수 위치부터 저장하며 len만큼 읽는댜ㅏ. 읽은 자료의 바이트 수를 반환한다.
 * void close()							입력 스트림과 연결된 대상 리소스를 닫는다.(예: FileInputStream인 경우 파일 닫음)
 * read() 메서드의 반환형은 int이다.
 * 한 바이트만 읽는 데 반환형이 int인 이유는 더 이상 읽어 들일 자료가 없는 경우에 정수 -1이 반환되기 때문이다.
 * 파일에서 자료를 읽는 경우 파일의 끝에 도달하면 -1이 반환된다.
 * 
 * FileInputStream
 * FileInputStream은 파일에서 바이트 단위로 자료를 읽어 들일 때 사용하는 스트림 클래스
 * FileInputStream 생성자
 * 			생성자									설명
 * FileInputStream(String name)	파일 이름 name(경로 포함)을 매개변수로 받아 입력 스트림을 생성한다.
 * FileInputStream(File f)		File 클래스 정보를 매개변수로 받아 입력 스트림을 생성한다.
 */

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
