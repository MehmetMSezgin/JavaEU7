package Assignment_on_OOP_Concepts.Q4;

public class Person {
	private String firstName ;
	private String lastName;
	private int age ;
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName + "|" + lastName + "|" + age ;
	}
	
	public Person() {
		firstName = "undefined" ;
		lastName = "undefined" ;
		age = -1 ;
	}
	
	public Person(String firstName , String lastName , int age) {
		this.age = age ;
		this.firstName= firstName;
		this.lastName = lastName;
	}
	
	
	
}
