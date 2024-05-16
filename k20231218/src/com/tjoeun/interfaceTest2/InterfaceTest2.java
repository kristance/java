package com.tjoeun.interfaceTest2;

public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Calc calc = new ComputeCalc();
		int num1 = 10;
		int num2 = 2;
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		
	}
	
}
