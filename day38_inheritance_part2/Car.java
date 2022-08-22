package day38_inheritance_part2;

public class Car extends Vehicle {
	
	int maxSpeed = 180 ;
	
	public void display() {
		System.out.println("max speed: " + super.maxSpeed); 
		//super.maxSpeed means go to parent class
		
		System.out.println("max speed: " + maxSpeed);
		
	}
}
