package kr.co.ext;

public class Animal {
	
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Exten exten = new Exten();
	}

	public void displayInfo() {
		System.out.println("Animal >> "+"이름: "+name+"\n나이:"+age);
	}

	public void sound() {
		System.out.println("동물 소리");
	}

}
