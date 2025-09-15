package kr.co.ext;

import kr.co.interf.Swimable;
import kr.co.interf.Walkable;

public class Duck extends Animal implements Walkable, Swimable {

	public Duck(String name, int age) {
		super(name, age);
	}

	@Override
	public void Swim() {
		System.out.println("오리가 수영을 해요");
	}

	@Override
	public void walk() {
		System.out.println("오리가 뒤뚱뒤뚱 걸어요.");
	}

	

}
