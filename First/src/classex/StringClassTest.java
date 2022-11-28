package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * ����Ϸ��� Ŭ������ �ڷ����� �𸣴� ���¿��� Class Ŭ������ Ȱ���Ͽ� �� Ŭ������ ������ ��������, �� ������ Ȱ���Ͽ� �ν��Ͻ��� �����ϰų� �޼��带 ȣ���ϴ� ����� '���÷���(reflection)'�̶�� �Ѵ�.
 */

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();//��� ������ ��������
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		Field[] fields = strClass.getFields();//��� ��� ����(�ʵ�) ��������
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		Method[] methods = strClass.getMethods();//��� �޼��� ��������
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
