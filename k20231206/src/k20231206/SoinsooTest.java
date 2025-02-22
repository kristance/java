package k20231206;

import java.util.Scanner;

public class SoinsooTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("소인수 분해할 숫자를 입력하세요: ");
			int n = scanner.nextInt();
//			입력받은 숫자가 2미만이면 무한 루프를 탈출한다.
			if (n < 2) {
				break;
			}
			
//			소인수 분해
			int[] s = new int[20];
			int number = n;
			int c = 0; // s 배열의 인덱스, 소인수의 개수
			
			while (true) {
				int k = 2; // 소인수 분해를 시작하는 숫자 초기화
				
				while (true) {
					int r = n % k;
					if (r == 0) { // 소인수 분해가 되었는가?
						break;
					}
//					소인수 분해가 되지 않았다면 k를 1증가 시킨다.
					k++;
				}
				
//				소인수 분해가 되었으면 s 배열에 소인수를 저장한다.
				s[c++] = k;
//				다음 소인수를 얻기위해 n에 n을 k로 나눈 몫을 넣어준다.
				n /= k;
				if (n == 1) { // 소인수 분해가 끝났는가?
					break;
				}
			}
			
//			n이 소수면 소수라고 출력하고 소수가 아니면 분해된 소인수를 출력한다.
//			소인수의 개수(c)가 1개라면 자기 자신으로 나눠 떨어진 것을 의미하므로 소수이다.
			if (c == 1) { // n이 소수인가?
				System.out.println(number + "는(은) 소수입니다.");
			} else {
//				소인수를 출력한다.
				System.out.print(number + " = ");
				for (int y = 0; y<c - 1; y++) {
					System.out.print(s[y] + " * ");
				}
				System.out.println(s[c - 1]);
			}
			
		}
		
		System.out.println("프로그램 종료!!!");
		
	}
	
}















