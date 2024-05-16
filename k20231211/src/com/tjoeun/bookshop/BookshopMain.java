package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMain {

	public static void main(String[] args) {
		
//		클래스이름 객체(변수)이름 = new 생성자();
		BookVO vo = new BookVO();
//		System.out.println(vo.title); // private 권한으로 선언된 변수에 직접 접근하면 에러가 발생된다.
//		클래스로 만든 객체를 출력하면 자동으로 toString() 메소드가 실행된다.
		System.out.println("vo: " + vo);
//		System.out.println(vo.toString());
		
//		도서 정보를 만든다.
//		출판일은 날짜 데이터를 만들어서 BookVO 클래스의 date 필드에 넣어주면 다른 곳에서 사용할 일이 없다.
//		이럴 경우 익명 객체로 만들어 사용한다.
		BookVO book1 = new BookVO("java", "홍길동", "더조은출판사", new Date(2023, 7, 15), 35000);
		System.out.println("book1: " + book1);
		
//		private 권한으로 선언된 필드에 접근하기 위해서 getters & setters 메소드를 만들어 사용한다.
//		System.out.println(book1.getTitle());
//		book1.setTitle("spring");
//		System.out.println(book1);
		
	}
	
}
