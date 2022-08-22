package day33_classObject_contructors;

public class Student {
	String name  ;
	int age ;
	char gender ;
	int year ;
	String course ;
	String university= "cybertek" ;
	
	public Student(String name, int age, char gender, int year, String course, String university) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}
	
	
	//now I create a normal method, not constructor
	public void attendLecture() { //return type is void
		System.out.println(name + " is attending lecture");
	}


	public Student(String name, int age, char gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		// after I define cybertek as defaul I did not put here
	}
	
	
	
	
	
	
	
	
	
	
	
}
