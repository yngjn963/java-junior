package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200; //���� ������ ����� �ٲ�Ƿ� ���� ������ �� ���� ���� �߻�
				//i = 100; //�Ű������� ���� ����ó�� ����� �ٲ�Ƿ� ���� ������ �� ���� ���� �߻�
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
			}
		}
		
		return new MyRunnable(); //���� ���� Ŭ���� �̸��� Ŭ������ �����Ͽ� ��ȯ�� ���� ����Ѵ�.
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	//MyRunnable�� ����Ϸ��� �� Ŭ������ ���� �����ϴ� ���� �ƴ϶� getRunnable() �޼��� ȣ���� ���� ������ ��ü�� ��ȯ�޾ƾ� �Ѵ�.
		runner.run();
		/*
		 * ���� ���� Ŭ�������� ���� ������ ��ȿ��
		 * run() �޼���� getRunnable() �޼����� ���� ���� i�� num�� ����Ѵ�.
		 * �׷��� ���� ���� Ŭ������ ������ �ִ� getRunnable() �޼��� ȣ���� ���� �Ŀ��� run() �޼��尡 ���������� ȣ��ȴ�.
		 * �̴� getRunnable() �޼��� ȣ���� ������ ���� �޸𸮿��� ������ ������ ���Ŀ� �� ������ �� �ִٴ� ���̴�.
		 * �� ���� ���� Ŭ�������� ����ϴ� ���� ������ ����� ó���ȴ�.
		 * ����� ó���ϱ� ���� �ڹ� 7������ final ���� �� �Բ� ���־�� ������, �ڹ� 8���ʹ� ���� �� ���� �ʾƵ� �ڵ带 �������ϸ� final ���� �ڵ����� �߰��ȴ�.
		 * �׷��Ƿ� 15~16��ó�� num�� i ������ ���� �ٸ� ������ �ٲٷ��� �ϸ� ������ �߻��Ѵ�.
		 */
	}

}
