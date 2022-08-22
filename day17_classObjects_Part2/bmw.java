package day17_classObjects_Part2;

public class bmw {
	
	String brand= "BMW" ; //all brands are BMW, actually you can assign BMW now
					// it will be our default brand instead of null
	String model ;
	double price ;
	
	public void showPrice() {
		
		switch (model) {
		case "300i" :
			price = 40200 ;
			break ;
		case "740i" :
			price = 85000 ;
			break ;
		case "m3" :
			price = 65000 ;
			break ;
			default :
				System.out.println("not valid");
				price = 0.0 ;
		}
		System.out.println("Price is " + price);
		
	}
	
	
	
	
	
	
	
	
	
	
}
