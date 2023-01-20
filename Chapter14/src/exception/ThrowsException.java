package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 다중 예외 처리에서 주의 사항
		 * 예외는 catch문을 선언한 순서대로 검사한다.
		 * 따라서 맨 위에 catch (Exception e) 문장을 쓰면 발생하는 모든 예외 클래스는 Exception 상위 클래스로 자동 형 변환되어 오류가 발생한다.
		 * 따라서 기본 예외 처리를 하는 Exception 클래스 블록은 여러 예외 처리 블록의 가장 아래에 놓여야 한다.
		 */
	}

}
