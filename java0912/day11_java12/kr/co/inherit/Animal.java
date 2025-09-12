package kr.co.inherit;

//개와 고양이의 공통된 값
public class Animal {
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Animal 이름 :"+name+", 나이:"+age);
	}
	
	public void eat(String food) {
		System.out.println(name + "가 "+food+" 먹는다.");
	}
	
	public void makeSound(String crying) {
		System.out.println(name + "가 "+crying+"하고 운다.");
	}

}
