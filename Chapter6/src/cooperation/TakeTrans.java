package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);					//�뼱 ��ȣ�� 100���� ���� ����
		studentJames.takeBus(bus100);				//james�� 100�� ������ 
		studentJames.showInfo();					//james ���� ���
		bus100.showInfo();							//���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��");		//�뼱 ��ȣ�� 100���� ���� ����
		studentTomas.takeSubway(subwayGreen);		//james�� 100�� ������ 
		studentTomas.showInfo();					//james ���� ���
		subwayGreen.showInfo();						//���� ���� ���
	}

}
