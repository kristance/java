package com.tjoeun.genericTest3;

public class TheeDPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<Powder>(); // genericprinter의 자료형은 제네릭에 들어있는 powder
		genericPrinter.setMaterial(new Powder());
		System.out.println(genericPrinter.getMaterial());
		Powder powder = genericPrinter.getMaterial();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>(); // genricprinter의 자료형은 제네릭에 들어있는 plastic
		genericPrinter2.setMaterial(new Plastic());
		System.out.println(genericPrinter2.getMaterial());
		Plastic plastic = genericPrinter2.getMaterial();
		System.out.println("==============================================");
		
		
//		GenericPrinter의 제네릭으로 넘기는 Water 클래스는 Material 클래스를 상속받아 작성되지 않아서
//		에러가 발생된다.
//		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<Water>(); // 에러 발생
		
		
		
		
		
		
		
	}
	
}
