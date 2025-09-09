package com.ex;

public class Student6 {
	
	String name;
	int age;
	String studentId;
	
	public Student6() {
		System.out.println(name+"("+age+"세, "+studentId+")");
		System.out.println("기본학생이 생성되었습니다.");
	}
	public Student6(String argName, String argStudentId) {
		this.name = argName;
		this.studentId = argStudentId;
		
		System.out.println(this.name+"("+this.studentId+") 학생이 생성되었습니다.^^");
	}
	public Student6(String argName, int argAge, String argStudentId) {
		this.name = argName;
		this.age = argAge;
		this.studentId = argStudentId;
		
		System.out.println(name+"("+age+"세, "+studentId+") 학생이 생성되었습니다.");
	}
	
	public void study() {
		System.out.println(this.name + "님이 공부를 합니다.");
	}
	
	public void introduce() {
		System.out.println(this.name+"학생을 소개 합니다.");
	}
}
