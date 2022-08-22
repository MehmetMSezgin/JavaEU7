package day16_Class_Objects;

public class CarObjects {

	public static void main(String[] args) {
		
		Car car1 = new Car () ;
		Car car2 = new Car () ;
		Car car3 = new Car () ;
		
		car1.brand = "bmw" ;
		car1.model = "x3" ;
		car1.printCarInfo();
		car1.currentSpeed = 70 ;
		car1.accelerate(10); //Accelerate method accepts an int parameter
		// examine this method it contains "if" inside of the method
		
		car2.brand = "suzuki" ;
		car2.model = "alto" ;
		car2.currentSpeed = 50 ;
		System.out.println(car2.currentSpeed);
		car2.printCarInfo();
		System.out.println(car2.toString()); 
	}

}
