package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMain {

	public static void main(String[] args) {
		
//		클래스이름 객체(변수)이름 = new 생성자();
//		BookVO vo = new BookVO();
//		System.out.println(vo.title); // private 권한으로 선언된 변수에 직접 접근하면 에러가 발생된다.
//		System.out.println(vo);
//		클래스로 만든 객체를 출력하면 자동으로 toString() 메소드가 실행된다.
//		System.out.println(vo.toString());
		
//		도서 정보를 만든다.
//		출판일은 날짜 데이터를 만들어서 BookVO 클래스의 date 필드에 넣어주면 다른곳에서 사용할 일이 없다.
//		이럴 경우 익명 객체로 만들어 사용한다.
		BookVO book1 = new BookVO("java", "홍길동", "더조은출판사", new Date(2023, 7, 15), 35000);
		System.out.println(book1);
		
//		private 권한으로 선언된 필드에 접근하기 위해서 getters & setters 메소드를 사용한다.
//		System.out.println(book1.getTitle());
//		book1.setTitle("spring");
//		System.out.println(book1);
		
		BookVO book2 = new BookVO("java", "홍길자", "더조은출판사", new Date(2023, 7, 15), 35000);
		BookVO book3 = new BookVO("java", "홍길숙", "더조은출판사", new Date(2023, 7, 15), 35000);
		BookVO book4 = new BookVO("java", "홍길희", "더조은출판사", new Date(2023, 7, 15), 35000);
		BookVO book5 = new BookVO("java", "홍길영", "더조은출판사", new Date(2023, 7, 15), 35000);
		BookVO book6 = new BookVO("java", "홍길자", "더조은출판사", new Date(2023, 7, 15), 35000);
		
		System.out.println("book2: " + book2);
		System.out.println("book6: " + book6);
		
//		"=="을 사용해서 같은지 비교할 수 있는 데이터는 기본 자료형 8가지와 null만 가능하다.
//		따라서, 클래스로 만든 객체는 "=="을 사용해서 비교하면 안된다. => 데이터가 아닌 데이터가 생성된 주소를 비교한다.
		
		if (book2 == book6) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		문자열 비교는 "=="을 사용하지 말고 equals() 메소드를 사용한다.
		if (book2.getAuthor().equals(book6.getAuthor())) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		클래스로 만든 객체를 비교할 때는 equals() 메소드를 사용한다.
		if (book2.equals(book6)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		여러권의 책 정보를 기억하는 클래스 객체를 만든다.
		BookList bookList = new BookList(5);
		
//		도서 정보를 BookList 클래스의 bookList 배열에 저장하는 메소드를 실행한다.
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
//		bookList.addBook(book4);
//		bookList.addBook(book5);
//		bookList.addBook(book6);
		
		System.out.println(bookList);
		
	}
	
}

















