package day38_inheritance_part2;

public class Dog extends Animal{
	private int eyes ;
	private int legs ;
	private int tail ;
	private int teeth ;
	private String coat ;
	
// if parent class only has constructor with parameters , then child constructor MUST make 
// a matching super(parameters) call

	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight); //if you dont have this , it will complain
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew () {
		System.out.println("chew method");
	}
	
	
	
	
	
}
