package k20231205;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2진수로 변환할 10진수를 입력하세요: ");
		int dec = scanner.nextInt();
		int number = dec;
		
		int[] bin = new int[8]; // 진법이 변환된 결과를 기억할 배열을 선언한다. 자동으로 0으로 초기화 된다.
		int index = 0; // 배열의 인덱스로 사용할 변수
		
//		입력되는 10진수의 크기에 따라 반복 횟수가 달라지므로 무한 루프를 돌려서 처리한다.
		while (true) {
			int m = dec / 2; // 몫
			int r = dec % 2; // 나머지
			bin[index++] = r; // 2진수를 기억할 배열에 나머지를 넣어준다.
//			dec에 저장된 10진수를 2로 나눈 몫이 0이되면 무한 루프를 탈출한다.
			if (m == 0) {
				break;
			}
//			이전 작업의 몫인 m이 다음 작업의 dec가 된다.
			dec = m;
		}
		System.out.println(Arrays.toString(bin));
		
		System.out.print(number + "를(을) 2진수로 변환하면 ");
		for (int i = bin.length - 1; i>=0; i--) {
			System.out.print(bin[i]);
		}
		System.out.println(" 입니다.");
		
		System.out.print(number + "를(을) 2진수로 변환하면 ");
		for (int i = index - 1; i>=0; i--) {
			System.out.print(bin[i]);
		}
		System.out.println(" 입니다.");
		
	}
	
}
















