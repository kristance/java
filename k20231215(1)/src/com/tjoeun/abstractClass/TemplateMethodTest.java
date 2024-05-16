package com.tjoeun.abstractClass;

//	클래스를 선언할 때 final을 붙여서 선언하면 프로그램에서 상속을 할 수 없다.
abstract class Car {
	
//	필드를 선언할 때 final을 붙여서 선언하면 프로그램에서 값을 변경할 수 없다. => 상수
//	상수는 다른 필드와 구분하기 위해서 대문자로 만들어 사용한다.
	public static final String NAME = "홍길동";
	
//	자식 클래스에서 다르게 구현(다형성)되어야 하는 부분은 추상 메소드로 선언한다.
	public abstract void drive();
	public abstract void stop();
	
//	자식 클래스에서 공통적으로 실행되어야 하는 부분은 일반 메소드로 만든다.
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
//	템플릿 메소드
//	일반 메소드나 추상 메소드를 사용해서 코드의 흐름(시나리오)를 정의하는 메소드로 
//	프레임워크에서 많이 사용하는 설계 패턴이다.
//	추상 클래스로 선언된 부모 클래스에서 템플릿 메소드를 활용해서 전체적인 흐름을 정의하고
//	자식 클래스에서 다르게 구현되어야 하는 부분은 추상 메소드로 선언해서 자식 클래스에서
//	Override 해서 구현하도록 한다.
	
//	메소드를 선언할 때 final를 붙여서 선언하면 프로그램에서 Override를 할 수 없다.
	final public void run() {
//		실행할 순서대로 메소드를 실행한다.
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}

//	AICar 클래스는 Car 클래스를 상속받아 만든다.
class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자동차가 스스로 자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 변경합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
	
//	Car 클래스에서 상속받은 run() 메소드 Override
//	public void run() { // final 메소드를 Override 했으므로 에러가 발생된다.
//		System.out.println("자동차가 스스로 멈춥니다.");
//	}

}

//	ManualCar 클래스는 Car 클래스를 상속받아 만든다.
class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작해서 방향을 변경합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아서 멈춥니다.");
	}
	
}

public class TemplateMethodTest {

	public static void main(String[] args) {
		
//		System.out.println(Car.NAME);
//		Car.NAME = "임꺽정"; // final 변수의 값을 수정하려 했으므로 에러가 발생된다.
//		System.out.println(Math.PI);
//		Math.PI = 1.23456;
		
		Car manualCar = new ManualCar();
		manualCar.startCar();
		manualCar.drive();
		manualCar.stop();
		manualCar.turnOff();
		System.out.println("=================================");
		
		manualCar.run();
		System.out.println("=================================");
		
		Car aiCar = new AICar();
		aiCar.startCar();
		aiCar.drive();
		aiCar.stop();
		aiCar.turnOff();
		System.out.println("=================================");
		
		aiCar.run();
		
	}
	
}







