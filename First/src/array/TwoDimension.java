package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};	//이차원 배열 선언과 동시에 초기화
		//2행 3열의 다차원 배열(new int[2][3])
		
		for (int i = 0; i < arr.length; i++) {	//전체 배열 길이인 arr.length는 행의 개수를 나타낸다.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();	//행 출력 끝난 후 한 줄 띄움
		}
	}

}
