package k20231206;


import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("10진수와 변환할 진법을 입력하세요: ");
		int dec = scanner.nextInt();
		int n = scanner.nextInt();
		int number = dec;
		
		int[] hex = new int[8];
		int index = 0;
		
		while (true) {
			int m = dec / n;
			int r = dec % n;
			hex[index++] = r; // n진수를 기억할 배열에 나머지를 넣어준다.
//			dec에 저장된 10진수를 n으로 나눈 몫이 0이되면 무한 루프를 탈출한다.
			if (m == 0) {
				break;
			}
			dec = m;
		}
		
//		char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.print(number + "를(을) " + n + "진수로 변환하면 ");
		for (int i = index - 1; i>=0; i--) {
//			System.out.print(h[hex[i]]);
			if (hex[i] < 10) {
//				hex 배열 요소에 저장된 값이 10미만이면 hex 배열 요소에 저장된 값을 그대로 출력한다.
				System.out.print(hex[i]);
			} else {
//				hex 배열 요소에 저장된 값이 10이상이면 영문자로 변환해서 출력한다.
//				System.out.print((char) (hex[i] + 55));
				System.out.printf("%c", hex[i] + 55);
			}
			
		}
		System.out.println(" 입니다.");
		
	}
	
}
















