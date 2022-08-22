package day41_abstraction;

public abstract class Animal {
		
	public abstract void eat() ; //Abstract method does not have body, only signature
	
	public abstract void sleep() ;
	
	public void move() { 		 //instance method
		System.out.println("moving");
	}
}
