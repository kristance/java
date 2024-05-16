package k20231206;

import java.util.Scanner;

public class SosooTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인가 판단할 숫자를 입력하세요: ");
		int n = scanner.nextInt();

//		소수는 1과 자기 자신 이외에는 나눠서 떨어뜨리는 수가 없는 수를 의미한다.
//		모든 수는 1로 나눠 떨어지기 때문에 2부터 떨어질 때 까지 나눠본다.
		int i;
		for (i = 2; i<=n; i++) {
			if (n % i == 0) {
//				나눠서 떨어지면 반복을 탈출시킨다.
				break;
			}
		}
		
//		소수인가 판단한다.
		if (n == i) {
			System.out.println(n + "은(는) 소수입니다.");
		} else {
			System.out.println(n + "은(는) 소수가 아닙니다.");
		}
		
	}
	
}
