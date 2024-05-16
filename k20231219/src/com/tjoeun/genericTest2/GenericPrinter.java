package com.tjoeun.genericTest2;

//  <M extends 클래스>
//  M 자료형의 범위를 제한할 수 있고, 부모 클래스에서 선언하거나 정의한 메소드를 사용할 수 있다.
//  상속을 받지 않은 경우 클래스는 Object가 기본값으로 사용된다.



// GenericPrinter 클래스에서 Material 클래스를 상속받아 generic을 선언하면 M에는 Material 클래스를
// 상속받은 클래스만 GenericPrinter 클래스의 자료형으로  넘길 수 있고 무작위 클래스가 들어갈 수 없게 한다.
public class GenericPrinter<M extends Material> {

	private M material;

	public M getMaterial() {
		return material;
	}
	public void setMaterial(M material) {
		this.material = material;
	}
	
	
	
}
