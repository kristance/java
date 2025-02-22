package k20231130;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년/평년을 판별할 년도를 입력하세요: ");
		int year = scanner.nextInt();

//		윤년/평년 판별식
//		년도가 4로 나눠 떨어지고(&&) 100으로 나눠 떨어지지 않거나(||) 400으로 나눠 떨어지면 윤년,
//		그렇치 않으면 평년
//		1900, 2100 => 평년, 2000, 2400 => 윤년, 2023 => 평년, 2024 => 윤년
		
//		프로그램에서 여러번 사용되는 값은 변수에 저장해서 사용하면 편리하다.
//		논리값을 기억하는 변수나 리턴 타입이 논리값인 메소드의 이름은 "is"로 시작하는게 관행이다.
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if (isLeapYear) {
			System.out.println(year + "년은 윤년 입니다.");
		} else {
			System.out.println(year + "년은 평년 입니다.");
		}
		
//		삼항 연산자(?:)
//		삼항 연산자는 조건식을 비교한 후 참이나 거짓일 때 실행할 문장이 각각 1문장일 때 사용하면 편리하다.
//		형식: 조건식 ? 참일 때 실행할 문장 : 거짓일 때 실행할 문장;
		
		System.out.println(isLeapYear ? "윤" : "평");
		System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년 입니다.");
		System.out.printf("%d년은 %s년 입니다.\n", year, isLeapYear ? "윤" : "평");
		System.out.printf("%d년은 %c년 입니다.\n", year, isLeapYear ? '윤' : '평');
		
	}
	
}
