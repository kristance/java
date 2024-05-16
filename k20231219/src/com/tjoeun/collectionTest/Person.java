package com.tjoeun.collectionTest;

import java.util.Objects;


// 	TreeSet에 저장할 클래스는 Comparable 인터페이스를 구현받고 compareTo() 메소드를 Override한 후
// 객체의 정렬 기준을 지정해야한다.
// TreeSet 객체에 저장할 클래스에 구현한 Comparable 인터페이스의 제네릭에는 현재 클래스 이름을 지정한다.
public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	객체를 HashSet 또는 TreeSet에 저장할 때 중복되는 내용을 가지는 객체가 저장되지 않게 하려면
//	내용이 같은 객체는 같은 hashcode를 가져야 하므로 hashCode() 메소드와 equals() 메소드를
//	Override 시켜야한다.
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	
//	compareTo() 메소드는 자신(this)과 인수(Person o)로 넘어온 객체(add() 메소드의 인수로 지정한 객체)
//	저장된 데이터를 비교한 결과를 숫자로 리턴한다.
//	비교할 데이터가 문자열이면 compareTo() 메소드는 자신이 크면 1, 같으면 0, 작으면 -1을 리턴한다.
//	비교할 데이터가 숫자면 "-"연산을 실행해서 자신이 크면 양, 같으면 0, 작으면 음수를 리턴하게 한다.
	@Override
	public int compareTo(Person o) {
//		return this.name.compareTo(o.name); // name의 오름차순 정렬
//		return -this.name.compareTo(o.name); // name의 내림차순 정렬
//		return this.age - o.age; // age의 오름차순 정렬
//		return o.age - this.age; // age의 내림차순 정렬
	
	
//	name을 기준으로 오름차순 정렬한다. 단, name이 같으면 age의 내림차순으로 정렬한다.
		if (this.name.compareTo(o.name) == 0) { // name이 같은가?
//			name이 같으면 age의 내림차순 정렬
			return o.age - this.age;
		} else {
//			name의 오름차순 정렬
			return this.name.compareTo(o.name);
		}
		
		
		
		
		
	
	
	}
	
	
	
	
}
