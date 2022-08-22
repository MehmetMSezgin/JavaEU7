package day37_inheritance;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee () ;
		
		emp1.name = "anna" ;
		emp1.age = 39 ;
		emp1.gender = 'f' ;
		emp1.eat("salad");
		emp1.jobTitle = "scrum master" ;
		
		System.out.println(emp1.toString());

	}

}
