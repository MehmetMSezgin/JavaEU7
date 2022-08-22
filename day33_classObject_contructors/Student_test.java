package day33_classObject_contructors;

public class Student_test {

	public static void main(String[] args) {
		
		Student s1 = new Student("mike", 17, 'm', 2017, "Java", "Cybertek");
		Student s2 = new Student("bob", 16, 'm', 2019, "JVM", "Cybertek");
		Student s3 = new Student("katie", 19, 'f', 2018, "java", "cybertek");
		
		// instead of defining as cybertek you can define cybertek as default variable in class
		s1.attendLecture();
		
		//after I define cybertek as default I create object here
		Student s4 = new Student("abc", 0, 'a', 1, "java") ;

	}

}
