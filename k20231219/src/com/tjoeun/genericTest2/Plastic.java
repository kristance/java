package com.tjoeun.genericTest2;



// 3D 프린터 재료 - plastic
public class Plastic extends Material {

	@Override
	void doPrinting() {
		System.out.println("plastic 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "Plastic";
	}

	
	
	
	
	
	
}
