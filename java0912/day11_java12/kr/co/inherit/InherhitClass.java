package kr.co.inherit;

import kr.co.Cat;
import kr.co.Dog;

public class InherhitClass {
	public static void main(String args[]) {
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);
		
		dog.displayInfo();
		dog.eat("고기를");
		dog.makeSound("멍멍");
		dog.wagTail();
		
		cat.displayInfo();
		cat.eat("생선을");
		cat.makeSound("야옹");
		cat.climb();
	}
}
