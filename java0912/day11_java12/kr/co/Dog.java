package kr.co;

import kr.co.inherit.Animal;

public class Dog extends Animal {
	
	String name;
	int age;
	String breeds;
	
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.breeds = breeds;
	}
	
	public void wagTail() {
		System.out.println(name+"가 꼬리를 흔든다~~");
	}

}
