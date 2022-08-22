package day42_interfaces;

public class TeslaSemi extends ElectricTruck { //my first concrete class
		
	private double engineSize ;

	public TeslaSemi(String model, double price, String color, double engineSize) {
	super(model, price, color);
	this.engineSize = engineSize;
}

	@Override
	public void load(String item) {
		System.out.println("tesla semi load " + item + " by lowering the truck");
		
	}

	@Override
	public void start() {
		System.out.println("by pressing button");
		
	}

	@Override
	public void charge() {
		System.out.println("by pluging charge 30 min");
		
	}

	@Override
	public void drive() {
		System.out.println("tesla truck is driving with load");
		
	}

	public double getEngineSize() {
		return engineSize;
	}
	
	
		
}
