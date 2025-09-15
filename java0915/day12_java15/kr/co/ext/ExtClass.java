package kr.co.ext;

public class ExtClass {
	public ExtClass() {
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);
		
		System.out.println(dog.getName());
		System.out.println(dog.breeds);
		
		dog.makeSound();
		cat.makeSound();
	}
}
