package com.tjoeun.interfaceTest4;

public class InterfaceTest4 {

	public static void main(String[] args) {
		
		Calc calc = new ComputeCalc();
		int num1 = 10;
		int num2 = 2;
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		
//		Calc 인터페이스에서 정의한 default 메소드를 실행한다.
		calc.description(5);
		
//		Calc 인터페이스에서 정의한 static 메소드를 실행한다.
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
		System.out.println(Calc.total(new int[] {1, 2, 3, 4, 5}));
		System.out.println(Calc.total2(1, 2, 3, 4, 5));
		
//		Calc 인터페이스에서 정의한 private 메소드는 인터페이스 외부에서 실행할 수 없다.
//		calc.privateMethod(); // 에러
		
//		Calc 인터페이스에서 정의한 private static 메소드는 인터페이스 외부에서 실행할 수 없다.
//		calc.privateStaticMethod(); // 에러
		
	}
	
}






