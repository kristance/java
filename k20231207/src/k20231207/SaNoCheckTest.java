package k20231207;

import java.util.Scanner;

public class SaNoCheckTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사업자등록번호 10자리를 '-'없이 입력하세요: ");
		String sa = scanner.nextLine().trim();

//		네이버 사업자등록번호 => 2208162517
		String check = "137137135"; // 가중치
		int sum = 0;
//		사업자등록번호의 8번째 인덱스 자리까지 각 자리의 숫자와 가중치를 곱한 결과의 1의 자리 합계를 계산한다.
		for (int i = 0; i<9; i++) {
			sum += Integer.parseInt(sa.charAt(i) + "") * Integer.parseInt(check.charAt(i) + "") % 10;
		}
//		사업자등록번호 8번째 인덱스 자리의 숫자와 가중치를 곱한 결과의 10자리 숫자를 더한다.
		sum += Integer.parseInt(sa.charAt(8) + "") * Integer.parseInt(check.charAt(8) + "") / 10;
		System.out.println(sum);
		
//		사업자등록번호와 가중치의 연산 결과에 사업자등록번호 9번째 인덱스의 숫자를 더한다.
		sum += Integer.parseInt(sa.charAt(9) + "");
		System.out.println(sum);
		
//		최종 결과가 10의 배수면 정상, 그렇치 않으면 오류
		System.out.println(sum % 10 == 0 ? "정상" : "오류");
		
	}
	
}
