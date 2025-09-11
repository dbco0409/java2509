package kr.co.ext;

public class Dog extends Animal {
	//public String name;
	String breeds;

//	public Dog() {
//		super();
//	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
	@Override
//	public void toString() {
//		System.out.println("Cat : "+this.breeds);
//	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Cat : "+this.breeds);
	}

	@Override
	public void sound() {
		super.sound();
		System.out.println(name+"가 멍멍");
	}
}
