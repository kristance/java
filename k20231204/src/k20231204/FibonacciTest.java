package k20231204;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		
		int a = 1; // 1번째 항의 값 초기화 => 피보나치 수열의 n-2 번째 항의 값
		int b = 1; // 2번째 항의 값 초기화 => 피보나치 수열의 n-1 번째 항의 값
		int y = 2; // 1번째 항과 2번째 항의 값을 더한 합계 => n번째 항 까지의 피보나치 수열의 합계를 기억한다.
		
//		피보나치 수열의 합계를 계산할 항을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 항을 입력하세요: ");
		int n = scanner.nextInt();
		
//		2번째 항 까지는 이미 계산이 되어있는 상태이므로 3번째 항 부터 n번째 항까지 반복하며 합계를 계산한다.
		for (int k = 3; k<=n; k++) {
			int c = a + b; // 피보나치 수열의 n-2 번째(a) 항과 n-1 번째(b) 항을 더해서 n번째(c) 항 값을 계산한다.
			y += c; // 피보나치 수열의 합계를 계산한다.
//			피보나치 수열의 다음 항 값을 계산하기 위해서 변수의 값을 수정한다.
			a = b;
			b = c;
		}
		
		System.out.println("피보나치 수열의 " + n + "번째 항 까지의 합계: " + y);
		
	}
	
}
