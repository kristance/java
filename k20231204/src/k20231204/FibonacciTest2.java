package k20231204;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 항을 입력하세요: ");
		int n = scanner.nextInt();

//		입력받은 피보나치 수열의 합계를 계산할 항의 개수만큼 배열을 만든다.
		int[] fibo = new int[n];
//		System.out.println(Arrays.toString(fibo));
//		System.out.println("배열의 크기: " + fibo.length);
		
//		배열의 0번째, 1번째 인덱스 요소를 각각 1로 초기화 시킨다.
		fibo[0] = 1;
		fibo[1] = 1;
		int y = 2;
		
//		피보나치 수열의 각 항 값으로 배열을 채우면서 합계를 계산한다.
//		k = 3 일 때, fibo[2] = fibo[0] + fibo[1]
//		k = 4 일 때, fibo[3] = fibo[1] + fibo[2]
//		k = 5 일 때, fibo[4] = fibo[2] + fibo[3]
//		k = n 일 때, fibo[n-1] = fibo[n-3] + fibo[n-2]
		for (int k = 3; k<=n; k++) {
//			System.out.println(k);
			fibo[k-1] = fibo[k-3] + fibo[k-2];
			y += fibo[k-1];
		}
//		System.out.println(Arrays.toString(fibo) + ", " + y);
		
		System.out.println("피보나치 수열의 " + n + "번째 항 까지의 합계: " + y);
//		1 + 1 + 2 + 3 + 5 + 8 = 20
		for (int i = 0; i<fibo.length - 1; i++) {
			System.out.print(fibo[i] + " + ");
		}
		System.out.println(fibo[fibo.length - 1] + " = " + y);
		
		for (int i = 0; i<fibo.length; i++) {
			if (i > 0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
		System.out.println(" = " + y);
		
	}
	
}

















