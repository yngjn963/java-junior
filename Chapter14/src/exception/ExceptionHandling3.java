package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
	}

}
