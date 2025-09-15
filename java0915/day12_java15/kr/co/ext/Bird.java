package kr.co.ext;

import kr.co.interf.Flyable;
import kr.co.interf.Walkable;

public class Bird extends Animal implements Flyable, Walkable {
	
	private double wingspan;
	
	public Bird(String name, int age, double wingspan) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println("새가 날아요.");
	}

	@Override
	public void walk() {
		System.out.println("새가 걸어요");
	}


	

}
