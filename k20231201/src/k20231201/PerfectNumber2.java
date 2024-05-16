package k20231201;

public class PerfectNumber2 {

	public static void main(String[] args) {
		
		int lm = 0; // 완전수의 개수를 기억할 변수
		
		for (int n = 4; n<=10000; n++) { // 완전수인가 판단할 수
			int sum = 0; // 자기 자신을 제외한 약수의 합계를 기억할 변수를 선언한다.
//			모든 숫자는 자기 자신을 제외하고 나눠서 떨어뜨릴 수 있는 가장 큰 수는 자기 자신의 절반을
//			넘지 않는다.
			for (int i = 1; i<=n/2; i++) {
//				완전수인가 판단할 수(n)의 약수를 계산하기 위해 i로 나눈 나머지를 0과 비교한다.
				if (n % i == 0) { // i가 n의 약수인가?
//					i가 n의 약수면 n의 약수 합계를 계산한다.
					sum += i;
				}
			}
			
//			완전수인가 판단한다.
			if (n == sum) { // n이 완전수인가?
				lm++; // 완전수의 개수를 1증가 시킨다.
				System.out.printf("%d번째 완전수 => %4d\n", lm, n);
			}
			
		}
		
		System.out.println("4 ~ 10000 사이의 완전수는 " + lm + "개 입니다.");
		
	}
	
}
