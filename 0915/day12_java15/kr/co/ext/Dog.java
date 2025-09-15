package kr.co.ext;

public class Dog extends Animal {
	
	String breeds;
	
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("멍멍");
	}

	public void wagTail() {
		System.out.println("꼬리를 흔든다.");
	}
	
	
	
	

}
