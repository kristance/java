package com.tjoeun.genericTest3;



// 3D 프린터 재료 - powder
public class Powder implements Material {

	
	
	@Override
	public void doPrinting() {
		System.out.println("powder 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "Powder";
	}

	
	
	
	
	
}
