package day33_classObject_contructors;

public class Car {

		String model;
		String make ;
		int year ;
		double mile ;
		String color ;
		
		public Car () { //constructor has no return
			// and constructor name and class name must be same
			make = "Civic" ;
			
			// my default make value is Civic anymore
			
		}
		
		public Car (String mo , String ma, int yr , double ml , String cl) {
			model= mo ;
			make = ma ;
			year = yr ;
			mile= ml ;
			this.color= cl;
			
		}
		//you can give same name parameter and object but dont mix
		public Car (int year , double mile) {
			year = year ; //first year object and second year is parameter
			mile = mile ;
			//but you can use "this" keyword
			this.year= year ;
			this.mile= mile ;
			
		}

		public Car(String model, String make, String color) { //right click --> source ----> generate constructor using fields
			this.model = model;
			this.make = make;
			this.color = color;
		}
		
		
		
		
		
}
