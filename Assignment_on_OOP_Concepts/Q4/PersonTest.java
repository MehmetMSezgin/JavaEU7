package Assignment_on_OOP_Concepts.Q4;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		person.setAge(44);
		person.setFirstName("john");
		person.setLastName("doe");
		
		System.out.println(person.toString());
		
		Person person1 = new Person("Fatima", "Lee", 22);

		System.out.println(person1.getFirstName()); 
		System.out.println(person1.getLastName()); 
		System.out.println(person1.getAge()); 
		System.out.println(person1.toString()); 

		



	}

}
