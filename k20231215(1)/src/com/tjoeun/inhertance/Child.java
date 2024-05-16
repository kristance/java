package com.tjoeun.inhertance;

//	자식(하위, 서브, 파생) 클래스
//	상속이란 부모 클래스에서 정의한 모든 필드와 메소드를 자식 클래스에서 물려받는 것을 말한다.
//	자식 클래스는 별도의 선언 없이 부모 클래스의 모든 기능을 사용할 수 있다.
//	public class 자식클래스이름 extends 부모클래스이름
//	Child 클래스는 Parent 클래스를 상속받아 만든다.
public class Child extends Parent {

//	Child 클래스는 Parent 클래스의 private으로 설정된 것을 제외한 모든 필드와 메소드를 사용할 수 있다.
	
//	Child 클래스에서 필요한 기능을 정의한다.
	private int age;
	private String nickname;
	
	public Child() {
//		super는 부모 클래스를 의미하고 뒤에 ()가 나오면 부모 클래스의 생성자를 의미한다.
//		() 안에 아무것도 없으면 부모 클래스의 생성자 중에서 기본 생성자를 의미한다.
//		this는 현재 클래스를 의미하고 뒤에 ()가 나오면 현재 클래스의 생성자를 의미한다.
//		super()는 직접 코딩하지 않아도 자바 컴파일러가 자동으로 만들어준다.
//		super()나 this()는 반드시 생성자의 첫 문장으로 써야한다. => 가장 먼저 실행된다.
//		부모 클래스의 생성자가 자식 클래스의 생성자보다 먼저 실행된다.
//		부모 클래스에서 기본 생성자를 정의하지 않으면 자식 클래스에서 super()를 실행하려 할 때
//		부모 클래스에 실행할 기본 생성자가 없기때문에 에러가 발생된다.
		super();
		System.out.println("자식 클래스의 기본 생성자 실행");
	}

//	부모 클래스에서 상속받은 name, gender와 자식 클래스에서 정의한 age, nickname을 인수로 넘겨받는
//	생성자를 만들어 초기화 시킨다.
//	이클립스가 지원하는 생성자 자동 완성 기능은 현재 클래스에 물리적으로 정의하지 않은 필드
//	즉, 상속받은 필드는 생성자를 만드는 대화 상자에 표시되지 않는다.
	public Child(String name, boolean gender, int age, String nickname) {
//		부모 클래스에서 상속받은 필드의 접근 권한이 private일 경우 자식 클래스에서 직접 접근할 수
//		없기 때문에 부모 클래스의 생성자를 호출해서 초기화 시킨다.
//		this.name = name; // 에러, 부모 클래스에서 private 권한으로 설정된 필드는 자식에서도 접근할 수 없다.
//		this.gender = gender; // 에러, 부모 클래스에서 private 권한으로 설정된 필드는 자식에서도 접근할 수 없다.
		super(name, gender); // 부모 클래스의 Parent(String name, boolean gender)가 실행된다.
		this.age = age;
		this.nickname = nickname;
	}
	
	/*
	public Child(String name, boolean gender, int age, String nickname) {
//		부모 클래스에서 상속받은 접근 권한이 private인 필드의 setter 메소드가 정의되어 있다면
//		상속받은 setter 메소드로 부모 클래스에서 상속받은 필드를 초기화 시킬 수 있다.
		setName(name);
		setGender(gender);
		this.age = age;
		this.nickname = nickname;
	}
	*/

	/*
	public Child(String name, boolean gender, int age, String nickname) {
//		부모 클래스에서 상속받은 접근 권한이 protected인 필드는 자식 클래스에서 접근할 수 있으므로
//		this를 사용한 초기화가 가능하다.
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickname = nickname;
	}
	*/
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

//	임꺽정(남) - 35, 도적넘
//	Override(재정의): 부모 클래스에서 상속받은 메소드의 기능을 무시하고 다시 만들어 사용한다.
	@Override
	public String toString() {
//		부모 클래스에서 상속받은 private 권한을 가지는 필드는 자식 클래스에서 접근할 수 없으므로
//		getter 메소드를 사용해서 접근해야 한다.
		return getName() + "(" + (isGender() ? "남" : "여") +  ") - " + age + ", " + nickname;
		
//		부모 클래스에서 상속받은 메소드의 앞, 뒤에 자식 클래스에서 기능을 추가할 수 있다.
//		부모 클래스에서 상속받은 메소드를 실행하려면 부모 클래스를 의미하는 super 뒤에 "."을 입력하고
//		실행할 메소드를 호출하면 된다.
//		super.toString(): 부모 클래스의 toString() 메소드를 실행한다.
//		return super.toString() + " - " + age + ", " + nickname;
		
//		부모 클래스에서 상속받은 필드의 접근 권한이 protected일 경우 자식 클래스에서 접근이 가능하므로
//		getter 메소드를 사용하지 않아도 된다.
//		return name + "(" + (gender ? "남" : "여") +  ") - " + age + ", " + nickname;
	}
	
}












