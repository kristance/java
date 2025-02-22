package com.tjoeun.inhertance;

import java.util.Calendar;

//	자바는 일반적으로 파일 1개에 1개의 클래스를 만들어 사용한다.
//	필요에 따라 1개의 파일에 여러개의 클래스를 만들어 사용할 수 있다.
//	1개의 파일에 여러개의 클래스를 만들면 "*.java" 파일은 1개만 만들어지지만 
//	컴파일된 "*.class" 파일은 각각 독립적으로 생성된다.
//	현재 java 파일의 이름과 같은 이름의 클래스에만 public을 붙일 수 있다.

//	기본 생성자가 실행되면 컴퓨터의 현재 날짜로 필드를 초기화하고 년, 월, 일을 넘겨받는 
//	생성자가 실행되면 넘겨받은 년, 월, 일로 필드를 초기화하는 클래스를 만든다.
class Date {
	
	private int year;
	private int month;
	private int day;
	
	public Date() {
		java.util.Date date = new java.util.Date();
		year = date.getYear() + 1900;
		month = date.getMonth() + 1;
		day = date.getDate();
//		Calendar calendar = Calendar.getInstance();
//		year = calendar.get(Calendar.YEAR);
//		month = calendar.get(Calendar.MONTH) + 1;
//		day = calendar.get(Calendar.DATE);
	}

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

//	2023년 12월 14일
	@Override
	public String toString() {
		return String.format("%04d년 %02d월 %02d일", year, month, day);
	}
	
}

//	기본 생성자가 실행되면 컴퓨터의 현재 시간으로 필드를 초기화하고 시, 분, 초를 넘겨받는 
//	생성자가 실행되면 넘겨받은 시, 분, 초로 필드를 초기화하는 클래스를 만든다.
class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		java.util.Date date = new java.util.Date();
		hour = date.getHours();
		minute = date.getMinutes();
		second = date.getSeconds();
//		Calendar calendar = Calendar.getInstance();
//		hour = calendar.get(Calendar.HOUR);
//		minute = calendar.get(Calendar.MINUTE);
//		second = calendar.get(Calendar.SECOND);
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
//	17:41:53
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
}

//	자바는 다중 상속을 허용하지 않기 때문에 아래와 같이 코딩하면 에러가 발생된다.
//	class Now extends Date, Time { } // 에러
//	다중 상속은 지원하지 않지만 다중 상속 효과를 내기 위한 방법으로 클래스 포함 기능과
//	인터페이스 구현 기능을 지원한다.

class Now {
	
//	클래스 포함이란 클래스의 필드로 다른 클래스 객체를 선언해서 사용하는 것을 말한다.
	private Date date;
	private Time time;
	
//	기본 생성자가 실행되면 현재 날짜와 시간으로 초기화시킨다.
	public Now() {
		date = new Date();
		time = new Time();
	}

//	날짜와 시간 데이터를 넘겨받아 초기화시키는 생성자
	public Now(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
//	년, 월, 일, 시, 분, 초를 넘겨받아 초기화시키는 생성자
	public Now(int year, int month, int day, int hour, int minute, int second) {
		date = new Date(year, month, day);
		time = new Time(hour, minute, second);
	}
	
	@Override
	public String toString() {
		return "Now [date=" + date + ", time=" + time + "]";
	}
	
}


public class ClassIncludeTest {

	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date);
		Date date2 = new Date(2024, 7, 11);
		System.out.println(date2);
		
		Time time = new Time();
		System.out.println(time);
		Time time2 = new Time(18, 20, 1);
		System.out.println(time2);
		
		Now now = new Now();
		System.out.println(now);
		Now now2 = new Now(date2, time2);
		System.out.println(now2);
		Now now3 = new Now(2024, 7, 11, 18, 20, 1);
		System.out.println(now3);
		
	}
	
}















