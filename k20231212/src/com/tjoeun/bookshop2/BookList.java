package com.tjoeun.bookshop2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.swing.JOptionPane;

public class BookList {

//	도서 정보를 기억할 ArrayList를 만든다.
	private ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
//	생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 기본 생성자를 만들어 준다.
//	public BookList() {
//	
//	}
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "======================================================\n";
		str += " 도서명  저자  출판사  출판일  가격\n";
		str += "======================================================\n";

		double sum = 0.0;
//		일반 for
		for (int i = 0; i<bookList.size(); i++) {
			str += bookList.get(i) + "\n";
			sum += bookList.get(i).getPrice();
		}
		
//		향상된 for
//		for (BookVO vo : bookList) {
//			str += vo + "\n";
//			sum += vo.getPrice();
//		}
		
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		str += "======================================================\n";
		str += " 합계 금액: " + df.format(sum) + "\n";
		str += "======================================================\n";
		return str;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookList);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookList other = (BookList) obj;
		return Objects.equals(bookList, other.bookList);
	}
	
	public void addBook(BookVO book) {
		bookList.add(book);
	}
	
}











