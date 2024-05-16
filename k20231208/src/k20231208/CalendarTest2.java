package k20231208;

import java.util.Date;
import java.util.Scanner;

//	달력을 출력하는 클래스
public class CalendarTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int confirm = 0;
		
//		do {
//			System.out.print("이번달(1), 특정달(2): ");
//			confirm = scanner.nextInt();
//		} while (confirm < 1 || confirm > 2);

		while (true) {
			System.out.print("이번달(1), 특정달(2): ");
			confirm = scanner.nextInt();
			if (confirm == 1 || confirm == 2) {
				break;
			}
			System.out.println("1 또는 2만 입력해야 합니다.");
		}
		
		int year, month;
		if (confirm == 1) {
			Date date = new Date();
			year = date.getYear() + 1900;
			month = date.getMonth() + 1;
		} else {
			System.out.print("달력을 출력할 년, 월을 입력하세요: ");
			year = scanner.nextInt();
			month = scanner.nextInt();
		}
		
		System.out.println("============================");
		System.out.printf("         %4d년%2d월\n", year, month);
		System.out.println("============================");
		System.out.println(" 일  월  화  수  목  금  토 ");
		System.out.println("============================");

//		다른 클래스의 메소드를 실행하는 방법은 2가지가 있다.
//		new를 이용해서 실행할 메소드가 포함된 클래스의 객체를 만들고 실행한다.
//		MyCalendar calendar = new MyCalendar();
//		System.out.println(calendar.lastDay(year, month));
//		static을 붙여서 선언한 메소드는 객체를 만들지 않고 클래스 이름에 "."을 찍어서 실행할 수 있다.
//		System.out.println(MyCalendar.lastDay(year, month));
		
//		1일이 출력될 위치(1일의 요일)를 맞추기 위해 1일의 요일만큼 반복하며 빈 칸(요일당 4칸)을 출력한다.
//		for (int i = 1; i<=MyCalendar.weekDay(year, month, 1); i++) {
//			System.out.print("    ");
//		}
		
//		1일이 출력될 위치(1일의 요일)를 맞추기 위해 1일의 요일만큼 반복하며 전달 날짜를 출력한다.
		int week = MyCalendar.weekDay(year, month, 1);
		int start;
		if (month == 1) {
//			1월의 전달은 전년도 12월이다.
//			start = MyCalendar.lastDay(year - 1, 12) - week;
			start = 31 - week;
		} else {
			start = MyCalendar.lastDay(year, month - 1) - week;
		}
		
		for (int i = 1; i<=week; i++) {
			System.out.printf(" %2d ", ++start);
		}
		
//		1일 부터 달력을 출력할 달의 마지막 날짜까지 반복하며 달력을 출력한다.
		for (int i = 1; i<=MyCalendar.lastDay(year, month); i++) {
			System.out.printf(" %2d ", i);
//			출력한 날짜(i)가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다.
			if (MyCalendar.weekDay(year, month, i) == 6 && i != MyCalendar.lastDay(year, month)) {
				System.out.println();
			}
		}
		
//		날짜를 다 출력하고 남은 빈 칸에 다음달 날짜를 출력한다.
//		System.out.println(6 - MyCalendar.weekDay(year, month, MyCalendar.lastDay(year, month)));
		for (int i = 1; i<=6 - MyCalendar.weekDay(year, month, MyCalendar.lastDay(year, month)); i++) {
			System.out.printf(" %2d ", i);
		}
		System.out.println("\n============================");
		
	}
	
}
















