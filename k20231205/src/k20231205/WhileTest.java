package k20231205;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10의 합계: " + sum);
		
//		반복으로 최초 진입시 조건이 거짓이면 {} 블록을 한 번도 실행하지 않는다.
//		while (조건식) {
//			조건식이 참인 동안 실행할 문장;
//			...
//		}
		
		sum = 0;
		int i = 1;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10의 합계: " + sum);
		
//		반복으로 최초 진입시 조건이 거짓이더라도 {} 블록을 한 번은 실행한다.
//		do {
//			조건식이 참인 동안 실행할 문장;
//			...
//		} while (조건식); // ";"을 빼먹으면 에러가 발생된다.
		
		sum = 0;
		i = 1;
		do  {
//			sum += i;
//			i++;
			sum += i++;
		} while (i<=10);
		System.out.println("1 ~ 10의 합계: " + sum);
		
		sum = 0;
		i = 1;
		for (; i<=10; ) {
			sum += i++;
		}
		System.out.println("1 ~ 10의 합계: " + sum);
		
	}
	
}















