package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		switch (ranking) {
			case 1 : medalColor = 'G';
					 break;	//break문을 사용하지 않으면 첫 번째 case 조건을 만족해서 메달 색에 값이 대입되었더라도 switch-case문을 빠져나오지 않는다. 따라서 잇따라 나오는 문장까지 모두 수행되어서 default문의 값이 대입된다.
			case 2 : medalColor = 'S';
					 break;
			case 3 : medalColor = 'B';
					 break;
			default : medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
		
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
