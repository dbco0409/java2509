package kr.co.poly;

import kr.co.ext.Animal;
import kr.co.ext.Cat;
import kr.co.ext.Dog;

public class PolyClass {
	public PolyClass() {
		Animal[] ani = { 
			new Dog("바둑이", 5, "진돗개"), 
			new Cat("나비", 2, false), 
			new Dog("제리", 2, "푸들"), 
			new Cat("까망이", 4, true)
		};
		
		System.out.println("다형성 배열로 구성된 객체 값 접근하기 ------");
		for (Animal a : ani) {
			a.makeSound();
		}
		
		System.out.println("---------------------------------");
		System.out.println("-------자식객체의 특성값 접근----------");
		for(Animal a : ani) {
			if(a instanceof Dog) {
				Dog d = (Dog) a;
				d.wagTail();
			}else if(a instanceof Cat) {
				Cat c = (Cat) a;
				c.climb();
			}
		}
	}
}
