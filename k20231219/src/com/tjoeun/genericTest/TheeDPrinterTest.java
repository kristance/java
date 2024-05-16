package com.tjoeun.genericTest;

public class TheeDPrinterTest {

	public static void main(String[] args) {
		
//		powder 전용 3D 프린터
//		powder를 재료로 사용하는 3D 프린터를 만든다.
		ThreeDPrinterPowder printerPowder = new ThreeDPrinterPowder();
//		powder를 재료로 사용하는 3D 프린터에 사용할 재료를 만든다.
		Powder powder = new Powder();
//		3D 프린터에 재료를 넣는다.
		printerPowder.setMaterial(powder);
//		3D 프린터를 사용한다.
		System.out.println(printerPowder.getMaterial());
//		3D 프린터 사용이 종료되면 재료를 꺼낸다.
		powder = printerPowder.getMaterial();
		System.out.println("==============================================");
		
		
//		plastic 전용 3D 프린터
		ThreeDPrinterPlastic printerPlastic = new ThreeDPrinterPlastic();
		Plastic plastic = new Plastic();
		printerPlastic.setMaterial(plastic);
		System.out.println(printerPlastic.getMaterial());
		plastic = printerPlastic.getMaterial();
		System.out.println("==============================================");
		
//		powder와 plastic을 모두 재료로 사용하는 3D 프린터 -> Object
		ThreeDPrinter threeDPrinter = new ThreeDPrinter();
		
		threeDPrinter.setMaterial(powder); // UpCasting, powder 하위 클래스타입이 object 상위 클래스타입으로
		System.out.println(threeDPrinter.getMaterial());
//		자식 객체를 부모 객체에 넣을 때(UpCasting)는 별다른 문제가 발생되지 않지만,
//		부모 객체에 저장된 자식 객체를 자식 객체에 넣을 때(DownCasting)는 반드시 형변환시켜서 넣어야한다.
		powder = (Powder) threeDPrinter.getMaterial(); // DownCasting
		
		threeDPrinter.setMaterial(plastic);
		System.out.println(threeDPrinter.getMaterial());
		plastic = (Plastic) threeDPrinter.getMaterial();
		System.out.println("==============================================");
		
//		powder와 plastic을 모두 재료로 사용하는 3D 프린터 -> Generic
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<Powder>(); // genericprinter의 자료형은 제네릭에 들어있는 powder
		genericPrinter.setMaterial(powder);
		System.out.println(genericPrinter.getMaterial());
		powder = genericPrinter.getMaterial();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>(); // genricprinter의 자료형은 제네릭에 들어있는 plastic
		genericPrinter2.setMaterial(plastic);
		System.out.println(genericPrinter2.getMaterial());
		plastic = genericPrinter2.getMaterial();
		System.out.println("==============================================");
		
		Water water = new Water();
		
		threeDPrinter.setMaterial(water);
		System.out.println(threeDPrinter.getMaterial());
		water = (Water) threeDPrinter.getMaterial();
		
		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<Water>();
		genericPrinter3.setMaterial(water);
		System.out.println(genericPrinter3.getMaterial());
		water = genericPrinter3.getMaterial(); // DownCasting 필요 X
		
		
		
		
		
		
		
	}
	
}
