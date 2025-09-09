package com.ex.st;

import com.ex.Student;
import com.ex.Student2;
import com.ex.Student3;
import com.ex.Student4;
import com.ex.Student5;
import com.ex.Student6;
import com.ex.Student7;

public class StBasicClass {
	public StBasicClass () {
		// ex1.
		Student st1 = new Student();
		System.out.println(st1);
		System.out.println();
		
		//ex2.
		Student2 st2 = new Student2();
		st2.name = "김철수";
		st2.age = 20;
		st2.studentId = "20250701";
		
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.studentId);
		System.out.println();
		
		//ex3. 메서드 사용
		Student3 st3 = new Student3();
		st3.study();
		st3.introduce();
		System.out.println();
		
		// ex4. 
		
		Student4 st4 = new Student4();
		System.out.println();
		
		//ex5.
		Student5 st5;
		st5 = new Student5("홍길동");
		
		// ex6.
		Student6 st6;
		st6 = new Student6();
		
		Student6 st6_1 = new Student6();
		Student6 st6_2 = new Student6("이정현","20250702");
		Student6 st6_3 = new Student6("김영남",29,"20250703");
		
		st6_2.study();
		st6_3.introduce();
		System.out.println();
		
		st6_3.study();
		st6_2.introduce();
		System.out.println();
		
		// ex7. getter and setter
		
		Student7 st7 = new Student7();
		System.out.println(st7.toString());
		System.out.println();
		
		st7.setName("김가빈");
		String name = st7.getName();
		st7.age = 26;
		st7.setStudentId("20250705");
		String studentId = st7.getStudentId();
		System.out.println(st7.toString());
		System.out.println();
					
	}
}
