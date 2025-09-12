package kr.co;

import kr.co.inherit.Animal;

public class Cat extends Animal {
	
	String name;
	int age;
	boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.isIndoor = isIndoor;
	}
	
	public void climb() {
		System.out.println(name+"가 점프를 했다!");
	}

}
