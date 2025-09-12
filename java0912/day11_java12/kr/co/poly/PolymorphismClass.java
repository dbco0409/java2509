package kr.co.poly;

import kr.co.Cat;
import kr.co.Dog;
import kr.co.inherit.Animal;

public class PolymorphismClass {
	public PolymorphismClass() {
		// 다형성 배열
		Animal[] animals= {
				new Dog("바둑이",5,"진돗개"),
				new Cat("나비",3,false),
				new Dog("제리",2,"푸들"),
				new Cat("까망이",4,true)
		};
		System.out.println("----------동물소리-----------");
		int i=0; 
		for(Animal animal:animals) {
			if(i==0 || i==2)
				animal.makeSound("멍멍");
			else
				animal.makeSound("야옹");
			i++;
		}
		
		System.out.println("----------동물 행동-----------");
	
		for(Animal animal:animals) {
			if(animal instanceof Dog) {
				// 개발자가 직접 다운캐스팅
				Dog dog = (Dog) animal;
				dog.wagTail();
			}else if(animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.climb();
			}
			
		}
		
		// 다형성 메서드 호출
		playWithAnimal(new Dog("루피",1,"비글"));
		playWithAnimal(new Cat("츄츄",2,true));
		
	}

	private void playWithAnimal(Animal animal) {
		System.out.println("-------나의 아가들과 놀아주기-------");
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.wagTail();
			dog.eat("고기를");
			dog.makeSound("멍멍");
		}else if(animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.climb();
			cat.eat("생선을");
			cat.makeSound("야옹");
		}
	}
	
}
