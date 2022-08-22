package day40_accessmodifiers_final_hiding;

public class Car {
	
	String model ;
	public int year ;
	private int door ;
	protected double engine ;
	
	public Car(String model, int year, int door, double engine) {
		super(); //Object class
		this.model = model;
		this.year = year;
		this.door = door;
		this.engine = engine;
	}

	public Car() {
		super(); //Object class
	}

	
	
	

}
