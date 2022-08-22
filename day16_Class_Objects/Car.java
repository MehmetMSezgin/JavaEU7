package day16_Class_Objects;
			// There is no main method because it is template
public class Car {
		
	String brand ;
	String model ;
	int currentSpeed ;
	String color ;
	
	
	public void printCarInfo () {
		String info = "Car brand[" + brand + "],model[" + model + "]" ;
		System.out.println(info);
	}
	
	public void drive() {
		System.out.println(brand + " " + model + " is driving");
	}
	
	public void accelerate (int mph) { //This method is accepting one parameter which is mph
		currentSpeed = currentSpeed + mph ;
		System.out.println("new current speed is " + currentSpeed + " accelaration is " + mph);
		
		if (currentSpeed>90) {
			System.out.println("slow down");
		}else {
			System.out.println("inside of valid limit");
		}
	}

	@Override //Source --> generate to string
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", currentSpeed=" + currentSpeed + ", color=" + color
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	// Getter and setter way ************
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
}
