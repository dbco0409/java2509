package kr.co.interf;

import kr.co.ext.Bird;
import kr.co.ext.Duck;

public class InterfClass {
	public InterfClass() {
		Bird bird = new Bird("참새",1, 25.5);
		Duck duck = new Duck("도널드", 3);
		
		bird.makeSound();
		bird.walk();
		bird.fly();
		System.out.println("------");
		duck.makeSound();
		duck.walk();
		duck.swim();
		
		Walkable[] walkAni = {bird, duck};
		for(Walkable w : walkAni) {
			w.walk();
		}
		
		testWalk(bird);
		testWalk(duck);
	}
	
	public static void testWalk(Swimable swimable) {
		
	}
}
