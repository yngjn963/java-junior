package stream.outputstream;

/*
 * OutputStream
 * 바이트 단위로 쓰는 스트림 중 최상위 스트림
 * 	    스트림 클래스						설명
 * FileOutputStream			바이트 단위로 파일에 자료를 쓴다.
 * ByteArrayOutputStream	Byte 배열에 바이트 단위로 자료를 쓴다.
 * FilterOutputStream		기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스이다.
 * 
 * FileOutputStream
 * 생성자 매개변수로 전달한 파일이 경로에 없으면 FileOutputStream은 파일을 새로 생성한다.
 * 파일에 자료를 쓸 때 기존 파일이 내용이 있더라도 처음부터 새로 쓸지(overwrite), 아니면 기존 내용 맨 뒤에 연결해서 쓸 것인지(append) 여부를 FileOutputStream 생성자의 매개변수로 전달한다.
 * 스트림 생성자에서 append 값은 디폴트가 false이다.
 */

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
