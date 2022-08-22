package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car {

	public Car2() {
		//model = "m3" ; default different package but subclass --- no access
		year = 2017 ;    //public always accessible
		//door = 3 ;	//private never accessible
		engine = 1 ;	//protected different package but subclass --- accessible
	
		
		
	}
		
		
}
