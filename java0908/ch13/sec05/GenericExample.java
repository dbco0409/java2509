package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cource.registerCourse1(new Applicant<Person>(new Person()));
		Cource.registerCourse1(new Applicant<Person>(new Worker()));
		Cource.registerCourse1(new Applicant<Person>(new Student()));
		Cource.registerCourse1(new Applicant<Person>(new HighStudent()));
		Cource.registerCourse1(new Applicant<Person>(new MiddleStudent()));
		
		//Cource.registerCourse2(new Applicant<Person>(new Person()));
		//Cource.registerCourse2(new Applicant<Worker>(new Worker()));
		Cource.registerCourse2(new Applicant<Student>(new Student()));
		Cource.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Cource.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		Cource.registerCourse3(new Applicant<Person>(new Person()));
		Cource.registerCourse3(new Applicant<Worker>(new Worker()));
//		Cource.registerCourse3(new Applicant<Student>(new Student()));
//		Cource.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Cource.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
