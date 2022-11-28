package classex;

/*
 * Class Ŭ������ �����ϵ� class ���Ͽ� ����� Ŭ������ �������̽� ������ �������� �� ����Ѵ�.
 * 
 * �𸣴� Ŭ������ ������ ����� ��쿡 �츮�� Ŭ���� ������ ���� ã�ƾ� �Ѵ�.
 * �̶� Class Ŭ������ Ȱ���Ѵ�.
 * 
 * Class Ŭ������ �����ϰ� Ŭ���� ������ �������� ���
 * 1. Object Ŭ������ getClass() �޼��� ���
 * String s = new String();
 * Class c = s.getClass();//getClass() �޼����� ��ȯ���� Class
 * 2. Ŭ���� ���� �̸��� Class ������ ���� ����
 * Class c = String.Class;
 * 3. Class.forName("Ŭ���� �̸�") �޼��� ���
 * Class c = Class.forName("java.lang.String");
 */

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
