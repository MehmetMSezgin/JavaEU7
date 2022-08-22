package day35_encapsulation;



public class CarpetTest {

	public static void main(String[] args) {
	
	Floor f = new Floor(12.7 , 7.2) ;
	Carpet c = new Carpet (5) ;
		
	Calculator c1 = new Calculator(f , c) ; //I need parameters , objects belongs to floor and carpet class
	//instead of defining object I could use second method
	// Calculator c1 = new Calculator (new Floor(10,20) , new Carpet(5)) ;
	
	
	System.out.println(Math.round(c1.getTotalCost()));
	} //math.round kusurati atmak icin kullandim
	
	
	Calculator c2 = new Calculator (new Floor(10,20) , new Carpet(5)) ;
	
	Calculator c3 = new Calculator() ;
	

}
