package com.tjoeun.inhertance;

public class InhertanceTest {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("성춘향", false);
		System.out.println(parent2);
		System.out.println("===============================");
		
		Child child = new Child();
		System.out.println(child);
		Child child2 = new Child("임꺽정", true, 35, "도적넘");
		System.out.println(child2);
		
	}
	
}
