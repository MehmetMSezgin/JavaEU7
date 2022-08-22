package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car(); //we need to import
		
		//c.model = "M3"; default is not accessible outside of package
		
		c.year = 2012 ; // public accessible anywhere
	
		// c.engine = 3 ; protected is not accessible outside of package 
						//(Just inherited relationship, protected is accessible to another package)
		
		
		// c.door  not accessible because private
		
		
		

	}

}
