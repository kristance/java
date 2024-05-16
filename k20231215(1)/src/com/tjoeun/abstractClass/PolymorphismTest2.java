package com.tjoeun.abstractClass;

import java.util.ArrayList;

abstract class Animal {
	
	public abstract void move();
	public void eating() { }
	
}

//	Human 클래스는 Animal 클래스를 상속받아 만든다.
class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

//	Tiger 클래스는 Animal 클래스를 상속받아 만든다.
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이는 네 발로 걷습니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

//	Eagle 클래스는 Animal 클래스를 상속받아 만든다.
class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쫘~~~~~ㄱ 펴고 멀리 날아갑니다.");
	}
}

public class PolymorphismTest2 {

	public static void main(String[] args) {
		
//		PolymorphismTest 클래스에서는 이런식으로 실행했었다.
		Animal[] animals = {new Human(), new Tiger(), new Eagle()};
		animals[0].move();
		animals[1].move();
		animals[2].move();
		System.out.println("====================================");
		
//		UpCasting, 자식 => 부모
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		main() 메소드는 static으로 선언된 메소드이기 때문에 static으로 선언된 메소드에만
//		접근할 수 있으므로 moveAnimal() 메소드는 반드시 static으로 선언해야 한다.
//		static으로 선언된 main() 메소드에서 바로 실행하므로 moveAnimal() 메소드는
//		static으로 선언해야 한다.
		moveAnimal(hAnimal);
		moveAnimal(tAnimal);
		moveAnimal(eAnimal);
		System.out.println("====================================");
		
//		현재 클래스 자신의 객체를 생성해서 메소드를 실행하면 static으로 메소드를 선언하지
//		않았어도 실행할 수 있다.
		PolymorphismTest2 polymorphismTest2 = new PolymorphismTest2(); // 자신의 클래스 객체를 만든다.
		polymorphismTest2.moveAnimal2(hAnimal);
		polymorphismTest2.moveAnimal2(tAnimal);
		polymorphismTest2.moveAnimal2(eAnimal);
		System.out.println("====================================");
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for (Animal animal : animalList) {
			animal.move();
		}
		System.out.println("====================================");
		
		for (int i = 0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
//			DownCasting: UpCasting된 클래스를 다시 원래의 타입으로 형변환 시킨다.
//			instanceof 연산자를 사용해서 형변환 가능한지 확인한 후 DownCasting을 실행한다.
			if (animal instanceof Human) {
				Human human = (Human) animal; // DownCasting, 부모에 저장된 자식 객체 => 자식
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("DownCasting 불가능");
			}
		}
		
	}
	
	private static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	private void moveAnimal2(Animal animal) {
		animal.move();
	}
	
}




















