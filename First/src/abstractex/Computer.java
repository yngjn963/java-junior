package abstractex;

//public class Computer {//���� �߻�
public abstract class Computer {
//	public void display();//���� �߻�
//	public void typing();//���� �߻�
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
