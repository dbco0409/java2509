package kr.co.ext;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
	}
	
	public Animal(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	
	public void makeSound() {
		System.out.println(name+"가 웁니다.");
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
	
	
	
}
