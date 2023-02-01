package stream.others;

import java.util.Scanner;

/*
 * 그 외 입력 클래스
 * Scanner 클래스
 * Scanner 클래스는 java.util 패키지에 있는 입력 클래스이다.
 * Scanner 클래스는 문자뿐 아니라 정수, 실수 등 다른 자료형도 읽을 수 있다.
 * 또한 콘솔 화면뿐 아니라 파일이나 문자열을 생성자의 매개변수로 받아 자료를 읽어 올 수 있다.
 * Scanner 클래스의 대표 생성자
 * 		  생성자									설명
 * Scanner(File source)				파일을 매개변수로 받아 Scanner를 생성한다.
 * Scanner(InputStream source)		바이트 스트림을 매개변수로 받아 Scanner를 생성한다.
 * Scanner(String source)			String을 매개변수로 받아 Scanner를 생성한다.
 * 
 * Scanner scanner = new Scanner(System.in)처럼 사용하면 표준 입력으로부터 자료를 읽어 들이는 기능을 사용할 수 있다.
 * Scanner 클래스는 System.in으로 입력받는 것보다 다양한 메서드를 활용할 수 있기 때문에 자주 사용하는 클래스이다.
 */

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scanner.nextLine();
		System.out.println("직업:");
		String job = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		// 표준 입력 System.in을 사용하면 바이트 단위 자료만 처리할 수 있어 한글 같은 경우 보조 스트림을 추가로 사용해야 하는데,
		// Scanner는 다양한 자료형을 입력할 수 있어 많이 활용한다.
	}

}
