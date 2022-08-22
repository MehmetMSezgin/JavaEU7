package day37_inheritance;

public class Person { //parent class
	String name ;
	int age ;
	char gender ;
	
	public void eat (String food) {
		System.out.println(name + " is eating");
	}
	
	public void sleep (int hours) {
		System.out.println(name + " is sleeping " + hours);
	}
}
