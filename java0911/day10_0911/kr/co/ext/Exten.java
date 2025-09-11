package kr.co.ext;

public class Exten {
	public Exten() {
		Dog dog = new Dog("똘이", 2, "골든리트리버");
		Cat cat = new Cat("나비", 3, "페르시안+");
		
//		dog.name = "나의 멍멍이";
//		cat.name = "나의 고양이";
//		
//		System.out.println(dog.name);
//		System.out.println(cat.name);
		
		System.out.println(dog.name + dog.age + dog.breeds);
		System.out.println(cat.name + cat.age + cat.breeds);
		
		dog.displayInfo();
		cat.displayInfo();
		
		System.out.println("-----------");
		
		dog.sound();
		cat.sound();
	}
}
