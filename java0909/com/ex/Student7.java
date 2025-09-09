package com.ex;

public class Student7 {
	private String name;
	public int age;
	private String studentId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	@Override
	public String toString() {
		return "Student 7 [name="+name+", age ="+age+", StudentID = "+studentId+"]";
	}
	
}
