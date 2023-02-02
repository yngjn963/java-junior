package stream.others;

import java.io.Console;

/*
 * Console 클래스
 * System.in을 사용하지 않고 간단히 콘솔 내용을 읽을 수 있는 Console 클래스도 있다.
 * 직접 콘솔 창에서 자료를 입력받을 때 이 클래스를 사용하는데, 이클립스와는 연동되지 않는다.
 * 		메서드							설명
 * String readLine()		문자열을 읽는다.
 * char[] readPassword()	사용자에게 문자열을 보여 주지 않고 읽는다.
 * Reader reader()			Reader 클래스를 반환한다.
 * PrintWriter writer()		PrintWriter 클래스를 반환한다.
 */

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
