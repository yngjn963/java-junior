package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 사용하려는 클래스의 자료형을 모르는 상태에서 Class 클래스를 활용하여 그 클래스의 정보를 가져오고, 이 정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식을 '리플렉션(reflection)'이라고 한다.
 */

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();//모든 생성자 가져오기
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		Field[] fields = strClass.getFields();//모든 멤버 변수(필드) 가져오기
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		Method[] methods = strClass.getMethods();//모든 메서드 가져오기
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
