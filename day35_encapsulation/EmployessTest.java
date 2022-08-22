package day35_encapsulation;

public class EmployessTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("mike" , 1235456 , "sales" , "m" ) ;
		Employee e2 = new Employee("mary" , 7735456 , "IT" , "F" ) ;
		Employee e3 = new Employee() ;
		
		e3.setName("muki");
		e3.setGender("m");
		e3.setDepartment("it");
		e3.setIdNum(2009889);
		
		System.out.println(e1.getGender());
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

	
		

	}

}
