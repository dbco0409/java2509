package kr.co.abstrac;

// 추상클래스 <-> 명확
public class AbstractClass {
	public static void main(String[] args) {
		Circle circle = new Circle("red",10.0,10.0,5.0);
		Rectangle rectangle = new Rectangle("blue", 30.0, 10.0, 8.0, 5.0);
		
		System.out.println(circle.getShapeType());
		System.out.println(rectangle.getShapeType());
	}
	
}
