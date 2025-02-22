package com.tjoeun.abstractClass;

class Base {
	
//	package 접근 권한은 접근 권한 지정자를 생략하면 package 권한으로 설정된다.
//	package 접근 권한은 같은 package에서는 public 처럼 사용되고 다른 package에서는
//	private 처럼 사용된다.
	String name; // 접근 권한을 생략했으므로 package 권한을 의미한다.
	
	void say() {
		System.out.println(name + "님 안녕하세요");
	}
	
}

class Sub extends Base {
	
	int age;

	@Override
	void say() {
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
	
}

public class UpDownCastingTest {

	public static void main(String[] args) {
		
//		부모 클래스 타입에 부모 클래스 타입의 객체를 만들어 넣어주면 아무 문제없이 처리된다.
		Base base = new Base();
		base.name = "홍길동";
		base.say();
		System.out.println("==============================");
		
//		자식 클래스 타입에 자식 클래스 타입의 객체를 만들어 넣어주면 아무 문제없이 처리된다.
		Sub sub = new Sub();
		sub.name = "임꺽정";
		sub.age = 20;
		sub.say();
		System.out.println("==============================");
		
//		결론 => 부모 클래스가 자식 클래스를 제어할 수 있지만 자식 클래스가 부모 클래스를 제어할 수 없다.
		
//		부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입하면 아무 문제 없이 처리된다.
//		Base b = new Sub();
//		b.say();
		
//		자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입하면 아무 문제 없이 처리된다.
//		Sub s = new Base(); // 에러
		
//		부모 클래스 타입의 객체에 자식 클래스 타입의 객체를 대입한다. => UpCasting
//		DownCasting은 부모 클래스 타입으로 UpCasting된 자식 클래스를 다시 자식 클래스 타입으로 변환하는
//		것을 말한다.
		Base b = sub; // UpCasting
		
//		b는 부모 클래스 타입의 객체지만 자식 클래스 타입을 대입했으므로 say() 메소드를 실행하면 부모 클래스의
//		say() 메소드가 아닌 자식 클래스의 say() 메소드가 실행된다.
		b.say();
		System.out.println("==============================");
		
//		자식 클래스 타입에 부모 클래스 타입을 대입하면 에러가 발생되는데 이 때, 부모 클래스 타입을 자식 클래스
//		타입으로 형변환 시켜 대입하면 대입이 가능해지지만 정상적인 DownCasting이 아닐 경우 문법적인 오류는
//		발생하지 않지만 ClassCastException이 발생된다.
//		Sub s = (Sub) base; // casting 시키면 문법적인 에러는 발생되지 않는다.
		Sub s = (Sub) b; // DownCasting
		
//		instanceof 연산자는 어떤 객체가 instanceof 뒤에 지정한 클래스 타입으로 안전하게 형변환이 가능한지
//		검사하는 연산자이다.
		if (sub instanceof Base) {
			System.out.println("Sub 클래스 타입의 객체는 Base 클래스 타입으로 형변환 가능");
			Base base2 = (Base) sub;
			base2.say();
		} else {
			System.out.println("Sub 클래스 타입의 객체는 Base 클래스 타입으로 형변환 불가능");
		}
		System.out.println("==============================");
		
		if (base instanceof Sub) {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 가능");
//			base는 Sub 클래스 타입이 Base 클래스 타입으로 UpCasting된 객체가 아니므로 DownCasting 불가능 하다.
			Sub sub2 = (Sub) base;
			sub2.say();
		} else {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 불가능");
		}
		System.out.println("==============================");
		
		if (b instanceof Sub) {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 가능");
//			b는 Sub 클래스 타입이 Base 클래스 타입으로 UpCasting된 객체이므로 DownCasting 불가능 하다.
			Sub sub3 = (Sub) b;
			sub3.say();
		} else {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 불가능");
		}
		System.out.println("==============================");
		
		try {
			Sub sub4 = (Sub) base;
			sub4.say();
		} catch (ClassCastException e) {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 불가능");
		}
		System.out.println("==============================");
		
//		정상적인 DownCasting
		Base base2 = sub; // 부모 클래스 타입에 자식 클래스 타입을 대입한다. UpCasting
//		DownCasting은 부모 클래스 타입으로 UpCasting된 것을 다시 자식 클래스 타입에 넣어주는 것을 말한다.
		Sub sub2 = (Sub) base2; // DownCasting
		
	}
	
}











