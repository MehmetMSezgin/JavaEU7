package day17_classObjects_Part2;

public class BMW_car_objects {

	public static void main(String[] args) {
		
		bmw car1 = new bmw() ;
		bmw car2 = new bmw() ;
		
		car1.model = "300i" ;
		car1.showPrice() ;

		System.out.println(car2.brand); // my default brand name is BMW
		
		car2.brand = "m3" ;
		System.out.println(car2.brand);
	}

}
