package com.tjoeun.textFileIO;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		/*
		String str = "010-123-4567";
//		split() 메소드는 인수로 지정된 구분자로 문자열을 분리해서 배열로 리턴한다.
		String[] phoneNo = str.split("-");
		System.out.println(Arrays.toString(phoneNo));
		
//		split() 메소드는 구분자를 2개 이상 지정할 수 없으므로 공백과 탭이 섞여있는 
//		데이터에 구분자를 공백만 지정하면 탭으로 구분된 데이터는 분리할 수 없다.
		str = "사과 배 복숭아	밤 대추";
		String[] data = str.split(" ");
		System.out.println(Arrays.toString(data));
		*/
		
//		StringTokenizer 클래스는 사용자가 지정하는 구분자를 경계로 문자열을 분리한다.
//		구분자를 생략하면 공백과 탭을 기본 구분자로 사용하며 구분자로 분리된 데이터를 token이라 한다.
		
//		문자열이 공백이나 탭으로 구분된 경우
		String str1 = "사과 배 복숭아	밤 대추";
		StringTokenizer st1 = new StringTokenizer(str1);
//		hasMoreTokens() 메소드는 StringTokenizer 클래스 객체에 다음에 읽을 token이 있으면 true,
//		없으면 false를 리턴한다.
		while (st1.hasMoreTokens()) { // 다음에 읽을 데이터(token)가 있는 동안 반복한다.
//			nextToken() 메소드는 StringTokenizer 클래스 객체의 다음 token을 읽어들인다.
			System.out.println(st1.nextToken());
		}
		System.out.println("=========================");
		
//		문자열이 ","로 구분된 경우
		String str2 = "사과,배,복숭아,밤,대추";
//		StringTokenizer 클래스 생성자의 2번째 인수로 구분자를 지정할 수 있다.
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("=========================");
		
//		문자열이 ","와 "."로 구분된 경우
		String str3 = "사과,배,복숭아.밤,대추";
//		StringTokenizer 클래스 생성자의 2번째 인수로 구분자를 여러개 지정할 수 있다.
		StringTokenizer st3 = new StringTokenizer(str3, ",.");
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println("=========================");
		
//		문자열이 "="와 ","로 구분된 경우
		String str4 = "사과=1000,배=2000,복숭아=3000,밤=4000,대추=5000";
//		StringTokenizer 클래스 생성자의 3번째 인수로 구분자를 token에 포함시키는 여부를 지정할 수 있다.
//		3번째 인수는 생략시 false가 기본값으로 구분자를 token에 포함시키지 않지만 true를 쓰면 구분자를
//		token에 포함시킨다.
		StringTokenizer st4 = new StringTokenizer(str4, "=,", true);
//		while (st4.hasMoreTokens()) {
//			System.out.println(st4.nextToken());
//		}
		
//		사과(1,000원)
		DecimalFormat df = new DecimalFormat("#,##0원");
		while (st4.hasMoreTokens()) {
			String str = st4.nextToken();
			if (str.equals("=")) {
				System.out.print("(");
			} else if (str.equals(",")) {
				System.out.println(")");
			} else {
				try {
					System.out.print(df.format(Integer.parseInt(str)));
				} catch (Exception e) {
					System.out.print(str);
				}
			}
		}
		System.out.println(")");
		
	}
	
}



























