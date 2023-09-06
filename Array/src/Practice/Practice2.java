package Practice;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 4행 4열짜리 정수형 배열을 선언 및 할당하고
		1) 1 ~ 16까지 값을 차례대로 저장하세요. 
		2) 저장된 값들을 차례대로 출력하세요.
		ex. 
		1 2 3 4 
		5 6 7 8 
		9 10 11 12
		13 14 15 16
		 */
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num++;
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

}
