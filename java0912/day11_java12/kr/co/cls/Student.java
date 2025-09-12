package kr.co.cls;

public class Student {

	private String name;
	public int age;
	private String studentId;
	
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	void introduce() {
		System.out.println(this.name +"을 소개합니다.");
	}
	void study() {
		System.out.println(this.studentId+"번이 공부 합니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	@Override
	public String toString() {
		return "Student [name="+name+", age=" + age + ", studentId= "+studentId+"]";
	}
	
	
}
