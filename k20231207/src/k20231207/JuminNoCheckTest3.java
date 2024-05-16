package k20231207;

import java.util.Scanner;

public class JuminNoCheckTest3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();
		
//		아기공룡 둘리 주민등록번호 => 8304221185600 => 오류, 8304221185601 => 정상
//		주민등록번호의 각 자리 숫자에 가중치를 곱한 합계를 계산한다.
		String check = "234567892345"; // 가중치
		int sum = 0;
		for (int i = 0; i<12; i++) {
//			sum += jumin.charAt(i) * check.charAt(i);
//			System.out.printf("%c * %c = %d\n", jumin.charAt(i), check.charAt(i), jumin.charAt(i) * check.charAt(i));
//			sum += (jumin.charAt(i) - '0') * (check.charAt(i) - 48);
//			System.out.printf("%d * %d = %d\n", jumin.charAt(i) - '0', check.charAt(i) - 48, 
//					(jumin.charAt(i) - '0') * (check.charAt(i) - 48));
			
//			문자를 문자열로 변환하는 방법
//			sum += Integer.parseInt(String.valueOf(jumin.charAt(i)));
//			sum += Integer.parseInt(String.format("%s", jumin.charAt(i)));
			sum += Integer.parseInt(jumin.charAt(i) + "") * Integer.parseInt(check.charAt(i) + "");
		}
//		System.out.println(sum);
		
//		주민등록번호의 각 자리 숫자와 가중치를 곱한 합계를 11로 나눈 나머지를 11에서 뺀다.
//		뺀 결과가 10이상이면 10의 자리는 버리고 1의 자리만 취한다.
		int result = (11 - sum % 11) % 10;
		
//		result에 저장된 숫자와 주민등록번호의 마지막 자리를 비교해서 같으면 정상, 다르면 오류
		if (result == jumin.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
		System.out.println(result == jumin.charAt(12) - 48 ? "정상" : "오류");
		
	}
	
}















