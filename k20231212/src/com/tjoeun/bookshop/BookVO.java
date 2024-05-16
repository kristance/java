package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

//	VO(Value Object) 클래스: 1건의 데이터와 데이터를 처리하는 메소드를 모아놓은 클래스이다.
//	VO 클래스는 DTO(Data Transfer Object) 클래스라고도 부른다.
//	bean: 데이터를 기억하는 기억 장소(변수)와 데이터를 입출력하는 getters & setters 메소드로만
//	      구성되는 클래스를 말한다.

//	도서 정보 1건을 기억하는 클래스
public class BookVO {

//	1. 데이터를 기억할 기억 장소를 선언한다. => 멤버 변수, 필드
//	   클래스에서 선언하는 기억 장소는 클래스 내부의 모든 메소드에서 사용할 수 있다.
//	   지역 변수를 선언만 하면 변수에 어떤 값이 들어있을지 모르지만(쓰레기) 클래스에서 선언하는
//	   필드는 별도로 초기화를 하지 않아도 자동 초기화가 된다.
//	   숫자는 0, 문자는 공백, boolean은 false, 클래스로 만든 객체(참조 변수)는 null
//	   일반적으로 필드는 private 권한으로 메소드는 public 권한으로 선언한다.

	private String title = ""; // 도서명
	private String author = ""; // 저자명
	private String publisher = ""; // 출판사명
	private Date writeDate = new Date(); // 출판일
	private double price = 0; // 가격
	
//	2. 생성자 메소드(이하 생성자)를 선언한다.
//	   생성자 이름은 반드시 클래스 이름과 같아야 한다.
//	   생성자는 객체가 생성될 때 자동으로 실행되고 필드에 데이터를 초기화 시키는 목적으로 사용한다.
//	   생성자는 리턴 타입을 사용하지 않고 내부에 return 명령도 사용하지 않는다.
//	   프로그래머가 생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 생성자(기본 생성자)를
//	   만들어주지만 프로그래머가 생성자를 선언하면 기본 생성자는 자동으로 만들어지지 않는다.
	
//	기본 생성자
	public BookVO() {
//		BookVO(String title, String author, String publisher, Date date, double price) 생성자를 실행해서
//		필드를 초기화 한다.
		this("없음", "없어요", "업다니깐요", new Date(), 0);
		System.out.println("기본 생성자가 실행됩니다.");
//		title = "없음";
//		author = "없어요";
//		publisher = "없다니깐요";
//		date = new Date();
//		price = 0;
	}

//	데이터를 넘겨받아 필드를 초기화 시키는 생성자
	public BookVO(String title, String author, String publisher, Date writeDate, double price) {
//		super();는 생략해도 자바 컴파일러가 자동으로 붙여준다.
//		super()와 this()는 반드시 생성자의 첫 문장에 코딩한다. => 동시에 사용할 수 없다.
//		super(); // 부모 클래스의 기본 생성자 호출한다.
//		this(); // 현재 클래스의 기본 생성자를 호출한다.
//		같은 {} 블록에 필드와 지역 변수가 같은 이름으로 존재할 경우 지역 변수에 우선권이 부여된다.
//		이 변수가 필드임을 자바 컴파일러에게 알려주기 위해서 this를 사용한다.
//		super는 부모 클래스를 의미하고 this는 현재 클래스를 의미한다.
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
//		인수로 넘어온 writeDate에 저장된 날짜 데이터에서 년은 1900을 월은 1을 빼서 다시 저장한다.
		writeDate.setYear(writeDate.getYear() - 1900);
		writeDate.setMonth(writeDate.getMonth() - 1);
		
		this.writeDate = writeDate;
		this.price = price;
	}
	
//	3. getters & setters 메소드를 정의한다.
//	   private 권한으로 선언된 필드에 클래스 외부에서 접근할 수 있도록 예외 규정을 만든다.
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
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

//	4. toString() 메소드를 Override(재정의) 한다.
//	   @Override 어노테이션은 이 메소드가 부모 클래스에서 상속받은 메소드를 재정의 한 것을 의미한다.
//	   부모 클래스에서 상속받지 않은 메소드는 에러가 발생한다.
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
//		숫자 데이터 출력 서식 만들기
//		NumberFormat 클래스로 숫자 출력 서식 지정하기 => 미리 제작되서 제공되는 서식만 사용할 수 있다.
//		NumberFormat nf = NumberFormat.getNumberInstance(); // 천 단위 구분 기호
//		NumberFormat nf = NumberFormat.getCurrencyInstance(); // 통화 기호
//		NumberFormat nf = NumberFormat.getPercentInstance(); // 백분율
		
//		DecimalFormat 클래스로 숫자 출력 서식 지정하기 => 서식을 만들어 사용한다.
//		DecimalFormat df = new DecimalFormat("#,##0"); // NumberFormat.getNumberInstance()
//		DecimalFormat df = new DecimalFormat("￦#,##0"); // NumberFormat.getCurrencyInstance()
//		DecimalFormat df = new DecimalFormat("#,##0%"); // NumberFormat.getPercentInstance()
//		DecimalFormat df = new DecimalFormat("#,##0원");
//		소수점 아래 숫자를 출력하려면 "."을 입력하고 보고싶은 자리만큼 "0"을 입력한다. 
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
//		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", writeDate=" + 
//				sdf.format(writeDate) + ", price=" + df.format(price) + "]";
//		return title + ", " + author + ", " + publisher + ", " + sdf.format(writeDate) + ", " + df.format(price);
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(writeDate), df.format(price));
	}

//	5. 클래스 객체에 저장된 내용을 비교해야 한다면 클래스를 선언할 때 hashCode() 메소드와 equals() 메소드를
//	   Override 시켜서 사용해야 한다.
	@Override
//	객체에 저장된 데이터가 같으면 같은 hashcode를 만든다.
	public int hashCode() {
		return Objects.hash(author, price, publisher, title, writeDate);
	}

	@Override
//	객체의 필드에 저장된 실제 데이터끼리 비교한다.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookVO other = (BookVO) obj;
		return Objects.equals(author, other.author)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title)
				&& Objects.equals(writeDate, other.writeDate);
	}
	
}

















