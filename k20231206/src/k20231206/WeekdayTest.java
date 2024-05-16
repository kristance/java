package k20231206;

import java.util.Scanner;

public class WeekdayTest {

	public static void main(String[] args) {
		
//		요일을 계산할 년, 월, 일을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년, 월, 일을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();

//		서기 1년 1월 1일 부터 요일을 계산하기 위해 입력한 날짜까지 지난 날짜 수를 계산한다.
//		계산된 날짜 수를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일, ..., 5이면 금요일, 6이면 토요일
		
//		서기 1년 1월 1일 부터 입력한 날짜의 전년도 12월 31일까지 지난 날짜를 계산한다.
//		int sum = (year - 1) * 365;
//		for (int i = 1; i<year; i++) {
//			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
//				sum++;
//			}
//		}
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		
//		전년도 12월 31일까지 지난 날짜 수에 전달까지 지난 날짜를 더한다.
		/*
		for (int i = 1; i<month; i++) {
//			2월, 짧은달(4, 6, 9, 11), 긴달(1, 3, 5, 7, 8, 10, 12)
			switch (i) {
				case 2:
//					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//						sum += 29;
//					} else {
//						sum += 28;
//					}
					sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
					break;
				case 4: case 6: case 9: case 11: // 짧은달
					sum += 30;
					break;
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 긴달
				default:
					sum += 31;
					break;
			}
		}
		*/
		
//		각 달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		2월의 마지막 날짜를 확정한다.
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
		for (int i = 1; i<month; i++) {
			sum += m[i - 1];
		}
		
//		전달까지 지난 날짜 수에 일을 더한다.
		sum += day;
		System.out.println(sum);
		System.out.println(sum % 7);
		
//		요일을 문자로 출력한다.
		System.out.printf("%d년 %d월 %d일은 ", year, month, day);
		switch (sum % 7) {
			case 0:
				System.out.print("일요일");
				break;
			case 1:
				System.out.print("월요일");
				break;
			case 2:
				System.out.print("화요일");
				break;
			case 3:
				System.out.print("수요일");
				break;
			case 4:
				System.out.print("목요일");
				break;
			case 5:
				System.out.print("금요일");
				break;
			case 6:
				System.out.print("토요일");
				break;
		}
		System.out.println(" 입니다.");
		
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.printf("%d년 %d월 %d일은 %s 입니다.\n", year, month, day, week[sum % 7]);
		
		char[] week2 = {'일', '월', '화', '수', '목', '금', '토'};
		System.out.printf("%d년 %d월 %d일은 %c요일 입니다.\n", year, month, day, week2[sum % 7]);
		
	}
	
}






















