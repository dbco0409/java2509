package com.geex;

class Box {
	private Object item;
	public void setItem(Object item) {
		this.item = item;
	}
	public Object getItem() {
		return item;
	}
}
class Box2<T>{
	private T item;
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
}
public class GenericExam{
	public GenericExam() {
		Box box= new Box();
		box.setItem("Hello");
		
		String str = (String) box.getItem();
		System.out.println(str);
		
		Box2<String> box2 = new Box2<>();
		box2.setItem("Hello");
		
		String str2 = box2.getItem();
		System.out.println(str);
	}
}
