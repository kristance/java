package k20231205;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("16진수로 변환할 10진수를 입력하세요: ");
		int dec = scanner.nextInt();
		int number = dec;
		
		int[] hex = new int[8];
		int index = 0;
		
		while (true) {
			int m = dec / 16;
			int r = dec % 16;
			hex[index++] = r; // 16진수를 기억할 배열에 나머지를 넣어준다.
//			dec에 저장된 10진수를 16로 나눈 몫이 0이되면 무한 루프를 탈출한다.
			if (m == 0) {
				break;
			}
			dec = m;
		}
		
//		16진수 각 자리 숫자를 기억하는 배열을 선언한다.
		char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.print(number + "를(을) 16진수로 변환하면 ");
		for (int i = index - 1; i>=0; i--) {
			System.out.print(h[hex[i]]);
		}
		System.out.println(" 입니다.");
		
	}
	
}
















