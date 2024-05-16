package com.tjoeun.interfaceTest4;

public interface Calc {

//	상수
	public static final double PI = 3.141592;
	int ERROR = -9999999;
	
//	추상 메소드		
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
	
//	default 메소드 => JDK 8에서 추가
//	default 메소드는 구현부({} 블록)을 가지는 메소드로 default 예약어를 사용해서 선언한다.
//	인터페이스를 구현받는 모든 클래스에서 공통으로 사용할 수 있는 메소드로 상속 또는 구현시
//	Override가 가능하다.
	default void description(int number) {
		System.out.println("정수 계산기를 구현합니다.");
		privateMethod();
	}
	
//	static 메소드 => JDK 8에서 추가
//	static 메소드는 구현부({} 블록)을 가지는 메소드로 static 예약어를 사용해서 선언한다.
//	인터페이스 객체를 사용하지 않고 인터페이스 이름에 "."을 찍어 실행할 수 있다.
	static int total(int[] arr) {
		privateStaticMethod();
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return total;
	}
	
	static int total2(int ... arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return total;
	}
	
//	private 메소드 => JDK 9에서 추가
//	인터페이스 내부의 default 메소드에서 사용하기 위해 만드는 메소드로 인터페이스를 구현받은
//	클래스에서 사용할 수 없다.
	private void privateMethod() {
		System.out.println("privateMethod");
	}
	
//	private static 메소드 => JDK 9에서 추가
//	인터페이스 내부의 static 메소드에서 사용하기 위해 만드는 메소드로 인터페이스를 구현받은
//	클래스에서 사용할 수 없다.
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
	
}





