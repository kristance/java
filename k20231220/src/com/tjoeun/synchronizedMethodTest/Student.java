package com.tjoeun.synchronizedMethodTest;

public class Student extends Thread {
	
//	생성자를 통해서 스레드 이름(도서를 대여할 학생 이름)을 넣어준다.
	public Student() {
		
	}
	public Student(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		try {
			String book = LibraryMain.library.lendBook(); // 도서 대여
			if (book == null) {
				return;
			}
			Thread.sleep(2500); // 대여 기간
			LibraryMain.library.returnBook(book); // 도서 반납
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
