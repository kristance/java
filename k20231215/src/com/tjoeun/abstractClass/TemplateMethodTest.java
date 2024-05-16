package com.tjoeun.abstractClass;

//	클래스를 선언할 때 final을 붙여서 선언하면 프로그램에서 상속을 할 수 없다.
abstract class Car {
	
//	필드를 선언할 때 final을 붙여서 선언하면 프로그램에서 값을 변경할 수 없다. => 상수
//	상수는 다른 필드와 구분하기 위해서 대문자로 만들어 사용한다.
	public static final String NAME = "홍길동";
	
//	메소드를 선언할 때 final를 붙여서 선언하면 프로그램에서 Override를 할 수 없다.
	 public void run() {
		
	}
	
}

class AICar extends Car {

}

public class TemplateMethodTest {

	public static void main(String[] args) {
		
		System.out.println(Car.NAME);
//		Car.NAME = "임꺽정"; // final 변수의 값을 수정하려 했으므로 에러가 발생된다.
		System.out.println(Math.PI);
//		Math.PI = 1.23456;
		
	}
	
}
