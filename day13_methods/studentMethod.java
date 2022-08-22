package day13_methods;

public class studentMethod {

	public static void main(String[] args) {
		sayHello() ;
		code();
		// this is calling of the method
		//compiler knows it is a definition method because paranthesis has been used
        //compiler goes to directly sayHello method
		//after compiler compiles say hello method it comes back to main method´s inside
	}
	// you can not define methods inside each other
	
	
	public static void sayHello () { //to able to run this method you must call it
		
		System.out.println("inside of sayHello method");
		
	}
	
	
	public static void code() {
		System.out.println("code method output");
	}

}
