package stream;

import java.util.ArrayList;
import java.util.List;

/*
 * 예제 시나리오
 * 1. 고객의 명단을 출력한다.
 * 2. 여행의 총 비용을 계산한다.
 * 3. 고객 중 20세 이상인 사람을 이름을 정렬하여 출력한다.
 * 
 * 스트림을 사용하지 않고 위 내용을 구현한다면 코드를 여러 번 반복해서 사용해야 할 것이다.
 * 하지만 미리 구현되어 있는 스트림의 메서드로 코드를 간결하게 작성할 수 있다.
 */

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다.");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
