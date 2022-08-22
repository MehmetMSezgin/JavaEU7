package day42_interfaces;

public class Ford extends ElectricCar {
		
		private int year ;

		public Ford(String model, double price, String color, int year) {
			super(model, price, color);
			this.year = year;
		}

		@Override
		public void start() {
			System.out.println("push start buttoni");
		}

		@Override
		public void charge() {
			System.out.println("electric outlet");
		}

		@Override
		public void drive() {
			System.out.println("ford is driving");	
		}

		public int getYear() {
			return year;
		}
		
		
		
}
