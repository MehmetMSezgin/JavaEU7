package day42_interfaces;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);
		
	}

	@Override
	public void start() {
		
		System.out.println("starting quitely");
	}

	@Override
	public void charge() {
		System.out.println("charging from electric outlet");

		
	}

	@Override
	public void drive() {
		System.out.println("Tesla is driving");

	}
	
}
