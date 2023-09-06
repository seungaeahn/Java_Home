package Practice;

public class Practice4 {

	public static void main(String[] args) {
		/*
		 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는
		 1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하세요.
		 
		     0열 1열 2열     3열
		 0행  값  값  값  0행 값들의 합
		 1행  값  값  값  1행 값들의 합
		 2행  값  값  값  2행 값들의 합
		 3행  값  값  값  3행 값들의 합
		 
		 */
			
			int[][] arr = new int[4][4];
			
			final int RowFinal = arr.length - 1; //열 
			final int ColFinal = arr[0].length - 1; //행 
			
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[row].length; col++) {
					if (row != RowFinal && col != ColFinal) {
						arr[row][col] = (int)(Math.random() * 10 + 1);
						// Math.random(): 0~1(1은 미포함) 구간에서 부동소수점의 난수를 생성
						
						arr[row][ColFinal] += arr[row][col];
						arr[RowFinal][col] += arr[row][col];
						arr[RowFinal][ColFinal] += arr[row][col];
					}
					System.out.printf(arr[row][col] + " ");
				} 
				System.out.println();
			} 
			

		}

	}


