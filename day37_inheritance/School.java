package day37_inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person () ;
		Student student = new Student () ;
		
		person.name = "mike" ;
		person.age = 35 ;
		
		student.name = "muk" ;
		student.age = 30 ; // I can reach Person classes's variables
		
		student.eat("pizza");
		person.sleep(4);
		

	}

}
