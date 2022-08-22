package day40_accessmodifiers_final_hiding;

public class FinalVariables {
	//FOR INSTANCE VARIABLES
	public final int roadster_max_range = 600 ;  //If you use final you have 3 options 
	//1. you can intitalize the variable in the same line
	
	public final int model_3_maxspeed ; //2. you can initialise by constructor
	
	public FinalVariables() {
		model_3_maxspeed=300;
	}
	
	public final int model_x_passengers ; //3. you can initialize by init block
	
	{
		model_x_passengers = 7 ;
	}
	
	
	public static final String admin ;
	//Static block runs only once whenever class loading
	//it does not care about object creation
	static {
		admin = "mike" ;
	}
	
	
	public static void main(String[] args) {
		// LOCAL VARIABLES
		//inside the method local variable
		final int SSN ; 
		SSN = 66 ;
		
		FinalVariables f = new FinalVariables();
		System.out.println(f.model_3_maxspeed);
		
	}

}
