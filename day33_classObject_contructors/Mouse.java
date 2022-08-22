package day33_classObject_contructors;

public class Mouse {
	
	int numTeeth ;
	int numwhiskers;
	int weight ;
	
	
	public Mouse(int weight) {//constructor chaining "this()" must be in first line
		this(20,weight) ; // !!! I am calling another constructor inside of constructor 
		this.weight = weight;
		
	}


	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20, weight) ; //constructor chaining must be in first line
		this.numTeeth = numTeeth;
		this.weight = weight;
	}


	public Mouse(int numTeeth, int numwhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numwhiskers = numwhiskers;
		this.weight = weight;
	}
	
	public void print () {
		System.out.println(weight + " " + numTeeth + " " + numwhiskers);
	}
	
	
	
	
	
	
	
}
