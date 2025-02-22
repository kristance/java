package k20231201;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("완전수인가 판단할 숫자를 입력하세요: ");
		int number = scanner.nextInt();
		
//		약수 출력
		for (int i = 1; i<=number; i++) {
			int r = number % i;
			if (r == 0) {
				System.out.println(i);
			}
		}
		System.out.println("=============================");
		
//		모든 숫자는 자기 자신을 제외하고 나눠서 떨어뜨릴 수 있는 가장 큰 수는 자기 자신의 절반을
//		넘지 않는다.
		int sum = 0; // 자기 자신을 제외한 약수의 합계를 기억할 변수를 선언한다.
		for (int i = 1; i<=number/2; i++) {
			if (number % i == 0) {
//				System.out.println(i);
				sum += i; // 약수의 합계를 계산한다.
			}
		}
		System.out.println("자신을 제외한 " + number + "의 약수 합계: " + sum);
		
//		완전수인가(자신을 제외한 약수의 합이 자기 자신과 같은가) 판단한다.
		if (number == sum) {
			System.out.println(number + "는(은) 완전수입니다.");
		} else {
			System.out.println(number + "는(은) 완전수가 아닙니다.");
		}
		
	}
	
}









