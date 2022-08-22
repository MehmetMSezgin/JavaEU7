package day16_Class_Objects;

public class CellPhone {
		String brand ;
		double screenSize ;
		String color ;
		double price ;
		
		
		public void call() {
			System.out.println("Calling...");
		}
		
		public void message() {
			System.out.println("Texting...");
		}
		
		public void phoneInfo() {
			
			System.out.println(brand + screenSize + color + price);
			
		}

		
}
