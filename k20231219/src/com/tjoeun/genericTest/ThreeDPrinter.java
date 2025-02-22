package com.tjoeun.genericTest;



// 재료로 powder와 plastic을 모두 사용하는 3D 프린터, 겸용 프린터 -> object 사용
public class ThreeDPrinter {

//	겸용 3D 프린터는 Powder와 Plastic을 모두 재료로 받을 수 있어야 하기 때문에
//	Powder와 Plastic의 부모 클래스가 Object이므로 Object 타입으로 재료 필드를 선언한다.
	private Object material; // Powder와 Plastic 공통으로 묶을 수 있는 Object 클래스의 멤버 변수 생성

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
	
	
}
