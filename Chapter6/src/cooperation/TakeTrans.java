package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);					//노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);				//james가 100번 버스를 
		studentJames.showInfo();					//james 정보 출력
		bus100.showInfo();							//버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");		//노선 번호가 100번인 버스 생성
		studentTomas.takeSubway(subwayGreen);		//james가 100번 버스를 
		studentTomas.showInfo();					//james 정보 출력
		subwayGreen.showInfo();						//버스 정보 출력
	}

}
