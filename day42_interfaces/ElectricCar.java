package day42_interfaces;

public abstract class ElectricCar {
		
		private String model ;
		private double price ;
		private String color ;
		
		
		public ElectricCar(String model, double price, String color) {
			super();  //it goes to Object class
			this.model = model;
			this.price = price;
			this.color = color;
		}

		@Override
		public String toString() {
			return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
		}
		
		public abstract void start();
		public abstract void charge();
		public abstract void drive();
		
		public void stop() {
			System.out.println("stopping by pushing the break");
		}

		public String getModel() {
			return model;
		}

		public double getPrice() {
			return price;
		}

		public String getColor() {
			return color;
		}
		
		
		
}
