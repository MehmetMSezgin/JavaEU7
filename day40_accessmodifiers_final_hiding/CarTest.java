package day40_accessmodifiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "M3";
		c.year = 2012 ;
		c.engine = 3 ;
		// c.door  not accessible because private
		

	}

}
