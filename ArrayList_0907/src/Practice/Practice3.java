package Practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		 3-3) 사용자로부터 5개의 정수를 입력받아서 배열에 저장한 다음, 
		 향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력
		 */
		// Scanner를 사용하여 사용자로부터 입력 받음
        Scanner scanner = new Scanner(System.in);
        
        // 5개의 정수를 저장할 배열 선언 
        int[] numbers = new int[5];
        
        // 사용자로부터 정수를 입력받아 배열에 저장
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = scanner.nextInt();
        }
        
        // 배열의 모든 요소를 더함
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
       
        
        // 결과 출력
        System.out.println("배열의 모든 요소의 합: " + sum);

	}

}
