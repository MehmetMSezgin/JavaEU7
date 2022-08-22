package day35_encapsulation;

public class Calculator {
		
		Floor floor ; //reference type and reference variable
		Carpet carpet ; // int this way I am giving to access to another class
		
	//for initialisation I need a constructor
		public Calculator(Floor floor, Carpet carpet) {
			
			this.floor = floor;
			this.carpet = carpet;
		}
		
		


		public Calculator() {
			
			
			
		}




		public double getTotalCost  () {
			return carpet.getCost() * floor.getArea() ;
		}
		
}
