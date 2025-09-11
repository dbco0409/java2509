package kr.co.ext;

public class Cat extends Animal {
	//public String name;
	String breeds;

//	public Cat() {
//		super();
//	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
//	@Override
//	public void toString() {
//		System.out.println("Dog : "+this.breeds);
//	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Dog : "+this.breeds);
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println(name+"가 야옹~");
	}
}
