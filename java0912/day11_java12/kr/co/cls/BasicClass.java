package kr.co.cls;

public class BasicClass {
	public BasicClass() {
		Student st1 = new Student("임철수",20,"29250715");
		Student st2 = new Student("이영희","29250716");
		
		st1.setName("김갑수");
		System.out.println(st1.getName());
		
		st1.setAge(20);
		st1.setStudentId("29250715");
		
		st2.setName("김갑수");
		st2.setAge(20);
		st2.setStudentId("29250715");
		
		st1.introduce();
		st1.study();
		st1.toString();
		
		st2.introduce();
		st2.study();
		st2.toString();
	}
}
