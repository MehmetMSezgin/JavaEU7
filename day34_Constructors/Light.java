package day34_Constructors;

public class Light {
	
		int noOfWatts ;
		boolean indicator ;
		String location ;
		
		public Light() {
			this(0,false) ;
			System.out.println("returning from cons1");
		}
		
		public Light (int watt , boolean ind) {
			this (watt, ind, "X") ;
			System.out.println("returning from cons2");
		}

		public Light(int noOfWatts, boolean indicator, String location) {
			
			this.noOfWatts = noOfWatts;
			this.indicator = indicator;
			this.location = location;
			System.out.println("returning from cons 3");
		}
		
		
		
}
