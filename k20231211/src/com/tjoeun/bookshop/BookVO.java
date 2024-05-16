package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//	VO(Value Object) 클래스: 1건의 데이터와 데이터를 처리할 메소드를 모아놓은 클래스.
//	VO 클래스는 DTO(Data Transfer Object) 클래스라고도 부른다.
//	bean: 처리할 데이터를 기억하는 변수와 변수에 데이터를 입출력 할 수 있는 getters & setters 메소드로만
//	구성된 클래스를 말한다.

//	도서 정보 1건을 기억하는 클래스
public class BookVO {

//	데이터를 기억할 멤버 변수(필드)를 선언한다. => 클래스 내부에 선언되는 모든 메소드에서 사용할 수 있다.
//	지역 변수를 선언하면 변수에 어떤 값이 들어있는지 모르지만(쓰레기) 클래스에서 선언하는 필드는 별도로
//	초기화를 하지 않아도 숫자는 0, 문자는 공백, boolean은 false, 클래스로 만든 객체(참조 변수)는 null로
//	자동 초기화 된다.
	
	private String title = ""; // 도서명
	private String author = ""; // 저자
	private String publisher = ""; // 출판사
	private Date date = new Date(); // 출판일
	private double price = 0; // 가격
	
//	생성자 메소드(이하 생성자)를 선언한다.
//	생성자 이름은 반드시 클래스 이름과 같아야 한다.
//	생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 생성자를 만들어 준다. => 기본 생성자
//	프로그래머가 생성자를 선언하면 기본 생성자를 자동으로 만들어 주지 않는다.
//	생성자는 리턴 타입을 사용하지 않고 생성자 내부에 return도 사용하지 않는다.
//	생성자는 객체가 생성될 때 자동으로 실행되고 필드에 데이터 초기화를 목적으로 사용한다.
	
//	기본 생성자
	public BookVO() {
//		System.out.println("기본 생성자가 실행됩니다.");
//		title = "";
//		author = "";
//		publisher = "";
//		date = new Date();
//		price = 0;
//		BookVO(String title, String author, String publisher, Date date, double price) 생성자를 호출한다.
//		this("없음", "없다니까는", "글쎄~~~~~", new Date(), 0);
	}

//	데이터를 넘겨받아 필드를 초기화 시키는 생성자.
//	필드와 지역 변수의 이름이 같을 경우 지역 변수에 우선권이 부여된다.
	public BookVO(String title, String author, String publisher, Date date, double price) {
//		super는 부모 클래스를 의미하고 this는 현재 클래스를 의미한다.
//		super가 붙은 변수는 부모 클래스의 필드를 의미하고 this가 붙은 변수는 필드를 의미한다.
//		super() this()는 반드시 생성자의 첫 문장으로 적어야 한다. => 동시에 사용할 수 없다.
//		super(); // 생략해도 자바 컴파일러가 자동으로 붙여준다. 부모 클래스의 기본 생성자를 호출한다.
//		this(); // 현재 클래스의 기본 생성자를 호출한다.
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
//		인수로 넘어온 date에 저장된 날짜 데이터에서 년은 1900을 월은 1을 빼서 다시 저장한다.
		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		
		this.date = date;
		this.price = price;
	}

//	getters & setters 메소드를 선언한다.
//	getters & setters 메소드는 private 권한으로 선언된 필드를 클래스 외부에서 접근할 수 있도록
//	예외 규정을 만든다.
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
//	클래스 객체에 저장된 데이터를 보려면 toString() 멤소드를 Override(재정의) 해야 한다.
//	@Override 어노테이션은 이 메소드가 부모 클래스에서 상속받은 메소드를 재정의한 메소드임을 의미한다.
//	@Override 어노테이션이 붙어있는 메소드는 메소드 이름을 수정해서 상속받은 메소드 이름과 다르게 하면
//	에러를 발생시킨다.
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
//		숫자 데이터 출력 서식 만들기
//		NumberFormat 클래스로 숫자 출력 서식 지정하기 => 미리 제작되서 제공되는 서식을 사용한다.
//		NumberFormat nf = NumberFormat.getNumberInstance(); // 천 단위 구분 기호
//		NumberFormat nf = NumberFormat.getCurrencyInstance(); // 통화 표시와 천 단위 구분 기호
//		NumberFormat nf = NumberFormat.getPercentInstance(); // 백분율, 자동으로 100이 곱해진다.
		
//		DecimalFormat 클래스로 숫자 출력 서식 지정하기 => 사용자가 서식을 만들어 사용한다.
//		DecimalFormat df = new DecimalFormat("서식");
//		DecimalFormat df = new DecimalFormat("#,##0"); // NumberFormat.getNumberInstance()
//		DecimalFormat df = new DecimalFormat("￦#,##0"); // NumberFormat.getCurrencyInstance()
//		DecimalFormat df = new DecimalFormat("#,##0%"); // NumberFormat.getPercentInstance()
//		DecimalFormat df = new DecimalFormat("#,##0원");
//		소수점 아래 숫자를 출력하려면 "."을 입려하고 보고싶은 자리만큼 "0"을 입력한다.
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", date=" + 
				sdf.format(date) + ", price=" + df.format(price) + "]";
	}
	
}



















