package ch06.sec15;

public class Signleton {
	public static Signleton singleton = new Signleton();
	
	private Signleton() {}
	
	public static Signleton getInstance() {
		return singleton;
	}
}
