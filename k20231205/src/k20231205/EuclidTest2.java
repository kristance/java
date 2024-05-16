package k20231205;

import java.util.Scanner;

public class EuclidTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 2개 입력: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = 1;
		
		int high, low;
		if (a >= b) {
			high = a;
			low = b;
		} else {
			low = a;
			high = b;
		}

		while (r > 0) {
			r = high % low;
			high = low;
			low = r;
		}
		
		System.out.printf("최대공약수: %d, 최소공배수: %d\n", high, a * b / high);
		
	}
	
}
