package com.tjoeun.interfaceTest4;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

//	인터페이스의 default 메소드는 Override가 가능하다.
//	@Override
//	public void description(int number) {
//		System.out.println("default 메소드를 Calculator 클래스에서 Override한 메소드");
//	}

}
