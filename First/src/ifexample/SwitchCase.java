package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		switch (ranking) {
			case 1 : medalColor = 'G';
					 break;	//break���� ������� ������ ù ��° case ������ �����ؼ� �޴� ���� ���� ���ԵǾ����� switch-case���� ���������� �ʴ´�. ���� �յ��� ������ ������� ��� ����Ǿ default���� ���� ���Եȴ�.
			case 2 : medalColor = 'S';
					 break;
			case 3 : medalColor = 'B';
					 break;
			default : medalColor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + " �Դϴ�.");
		
		int month = 1;
		int day;
		switch (month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31;
					 break;
			case 4 : case 6 : case 9 : case 11 : day = 30;
					 break;
			case 2 : day = 28;
					 break;
		}
	}

}
