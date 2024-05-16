package k20231207;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JuminNoCheckTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();

//		아기공룡 둘리 주민등록번호 => 8304221185600
		System.out.println(jumin.substring(0, 2));
//		int year = jumin.substring(0, 2);
		System.out.println(jumin.charAt(0));
		System.out.println(jumin.charAt(1));
		int year = (jumin.charAt(0) - '0') * 10 + (jumin.charAt(1) - 48);
		System.out.println(year);
		
//		Integer.parseInt(): 인수로 지정된 문자열을 정수로 변환한다.
		year = Integer.parseInt(jumin.substring(0, 2));
//		Double.parseDouble(): 인수로 지정된 문자열을 실수로 변환한다.
//		Boolean.parseBoolean(): 인수로 지정된 문자열을 논리값(true, false)로 변환한다.
		
//		if (jumin.charAt(6) <= '2') {
//			year += 1900;
//		} else {
//			year += 2000;
//		}
		year += jumin.charAt(6) <= '2' ? 1900 : 2000;
		System.out.println("생년: " + year);
		
//		컴퓨터의 날짜 데이터를 얻어와서 년도만 꺼낸다.
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getYear() + 1900);
		System.out.println("둘리 나이: " + (date.getYear() + 1900 - year));
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("둘리 나이: " + (calendar.get(Calendar.YEAR) - year));
		
	}
	
}











